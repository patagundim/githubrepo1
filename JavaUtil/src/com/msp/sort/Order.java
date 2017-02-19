package com.msp.sort;

public class Order implements Comparable<Order> {
private int id;
private float price;
private String item;

Order(int id, float price,String item)
{
this.id=id;
this.price=price;
this.item=item;
}
	@Override
	public int compareTo(Order arg0) {
		System.out.println("This Id:"+this.id);
		System.out.println("Id:"+arg0.id);
		return this.item.compareTo(arg0.getItem());
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
