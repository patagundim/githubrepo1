package com.msp.util;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;

public class PathExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
public static void main(String[] args) throws IOException {

Path path1=Paths.get("C:\\Users\\mspatagundi\\workspacejuno\\JavaUtil\\src\\com\\msp\\util\\out.pdf");
Path path2=Paths.get("C:\\Users\\mspatagundi\\workspacejuno\\JavaUtil\\src\\com\\msp\\server\\copy.pdf");
System.out.println(path1.toAbsolutePath());
Path p5 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");
System.out.println(Files.getOwner(path2));
System.out.println(Files.exists(p5));
BasicFileAttributes at=Files.readAttributes(path2, BasicFileAttributes.class);
System.out.println(at.creationTime()+"--"+at.lastAccessTime()+"--"+at.lastModifiedTime());
//Files.createFile("C:\\Users\\mspatagundi\\workspacejuno\\JavaUtil\\src\\com\\msp\\server\\copy.pdf");
//Files.move(path1,path2);

Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
for (Path name: dirs) {
    System.err.println(name);
}
	}

}
