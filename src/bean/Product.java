package bean;

import java.io.Serializable;

//Productクラス...productテーブルを表す
public class Product implements Serializable {
//	フィールド...テーブルの列を表す
	private int id;
	private String name;
	private int price;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + "<b>(" + price + "円)</b>";
	}

	public int getTaxPrice() {
		return (int)(price * 1.1);
	}


}