package com.ramesh.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7176482497919777477L;
	
	private String add1 ;
	private String add2 ;
	private String mult1;
	private String mult2 ;
	private String product;
	private String sum;
	
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getMult1() {
		return mult1;
	}
	public void setMult1(String mult1) {
		this.mult1 = mult1;
	}
	public String getMult2() {
		return mult2;
	}
	public void setMult2(String mult2) {
		this.mult2 = mult2;
	}
	public void calculateProduct() {
		int product; try {
		product = Integer.parseInt(mult2)*Integer.parseInt(mult1);
		this.product = String.valueOf(product);
		}catch(Exception e) {this.product = "";}
	}
	public void calculateSum() {
		int sum; 
				try {
		sum = Integer.parseInt(add1)+Integer.parseInt(add2);
		this.sum = String.valueOf(sum);
		}catch(Exception e) {
//			e.printStackTrace();
			this.sum="";
		}
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	
	
}
