package com.msp.objectstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Transform {
	private static String xsl="xsl/catalog.xsl";
	private static String xml="xsl/catalog.xml";
	private static Map cache=new HashMap();
	Map myc=new HashMap();
	
	private Transform()
	{
		
	}
	
	/*public Transformer test(String xslfile) throws TransformerConfigurationException
	{
		 if (myc.get(xslfile) == null) {
			    Source xslSource = new StreamSource(xslfile);
			 System.out.println("Inside 1");
			    TransformerFactory transFact = TransformerFactory.newInstance( );
			    Templates templates = transFact.newTemplates(xslSource);
			    
			    myc.put(xslfile, templates);
			    return templates.newTransformer();
			   }
		return ((Templates) myc.get(xslfile)).newTransformer();
	}*/
	public static synchronized Transformer getTemplate(String xslfile) throws TransformerConfigurationException, MalformedURLException
	{
		 File xsltFile = new File(xslfile);
		 String path=xsltFile.toURL().toExternalForm();
		 System.out.println(path);
		   // determine when the file was last modified on disk
		   long xslLastModified = xsltFile.lastModified( );
		   MapEntry entry = (MapEntry) cache.get(xslfile);
		 
		   if (entry != null) {
		    // if the file has been modified more recently than the
		    // cached stylesheet, remove the entry reference
		    if (xslLastModified > entry.lastModified) {
		      entry = null;
		    }
		   }
		   
		   // create a new entry in the cache if necessary
		   if (entry == null) {
			   URL loader=ClassLoader.getSystemClassLoader().getResource(xslfile);
		    System.out.println(loader);
		    System.out.println("path"+loader.toExternalForm());
			   Source xslSource = new StreamSource(loader.toExternalForm());
		 System.out.println("Inside 1");
		    TransformerFactory transFact = TransformerFactory.newInstance( );
		    Templates templates = transFact.newTemplates(xslSource);
		 xslSource.setSystemId(path);
		    entry = new MapEntry(xslLastModified, templates);
		    cache.put(loader.toExternalForm(), entry);
		   }
		   return entry.templates.newTransformer();
		  }
	
	 public static synchronized void flushAll( ) {
		 System.out.println("Inside clear");
		   cache.clear( );
		  }
		 
		  /**
		  * Flush a specific cached stylesheet from memory.
		  *
		  * @param xsltFileName the file name of 
		  * the stylesheet to remove.
		  */
		  public static synchronized void flush(String xsltFileName) {
			  System.out.println("Inside flush");
		   cache.remove(xsltFileName);
		  }
	static class MapEntry {
		long lastModified; // when the file was modified
		Templates templates;

		MapEntry(long lastModified, Templates templates) {
			this.lastModified = lastModified;
			this.templates = templates;
		}
	}
	
	/**
	 * @param args
	 * @throws TransformerException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws TransformerException, IOException {
		// TODO Auto-generated method stub
		
		TransformerFactory fact= TransformerFactory.newInstance();
		File f= File.createTempFile("temp", ".xml");
		System.out.println(f.getName());
		BufferedWriter wr= new BufferedWriter(new FileWriter(f));
		BufferedReader read=null;
		try
		{
		URL p=ClassLoader.getSystemClassLoader().getResource(xml);
		System.out.println(p.getFile());;
		read= new BufferedReader(new FileReader(p.getFile()));
		String line =null;
		StringBuffer buf=new StringBuffer();
		while((line=read.readLine())!=null)
		{
			wr.write(line);
			buf.append(line);
		}
		System.out.println(buf.toString());
		StringWriter write= new StringWriter();
		String xs=ClassLoader.getSystemClassLoader().getResource(xsl).toExternalForm();//.toExternalForm();
		Templates temp=fact.newTemplates(new StreamSource(xs));
		Source sr1=new StreamSource(xs);
		sr1.setSystemId(xs);
		Transformer tra= temp.newTransformer();//fact.newTransformer(sr1);
		StreamSource sr2= new StreamSource(buf.toString());
		sr2.setSystemId(p.toExternalForm());
		tra.transform(sr2,new StreamResult( write));
		String s=write.toString();
		System.out.println(s);
		}
		catch(MalformedURLException e)
		{
		}
		finally
		{
			read.close();
			wr.close();
		}
	}

}
