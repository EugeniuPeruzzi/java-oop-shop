package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
	
		Prodotto p1 = new Prodotto("caffe", "caffe caldo", 1f , 10f);
		Prodotto p2 = new Prodotto("birra", "prodotto fresco", 5f , 15f);
		System.out.println(p1);
		System.out.println(p2);
	}

}

