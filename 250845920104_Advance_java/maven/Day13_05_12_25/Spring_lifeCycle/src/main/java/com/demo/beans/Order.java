package com.demo.beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{
	//data Member
	private int orderid;
	private String cname;
	// now here we are using the collection one order can have the multipe the product so taking the list
	private List<Product> plist;
	private double orderAmout;
	
	// default constructor 
	public Order() {
		super();
	}

	// parmeterised cosntructuor
	public Order(int orderid, String cname, List<Product> plist) {
		super();
		this.orderid = orderid;
		this.cname = cname;
		this.plist = plist;
	}

	// getters and setters
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}

	// to String Method
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", cname=" + cname + "\n, plist=" + plist + "]";
	}
	
	// our own Distroy Method 
	public void myDestory() {
		System.out.println("our own destroy Method");
	}

	public void destroy() throws Exception {
		System.out.println("In Destroy of Disposable bin");
		
	}

	public void afterPropertiesSet() throws Exception {
		//you can make changes in the bean if needed
		plist.forEach(System.out::println);
		List<Double> amtlist=plist.stream().map(product->product.getQty()*product.getPrice())
				.collect(Collectors.toList());
		//calculate total amount
		this.orderAmout=amtlist.stream().reduce(0.0,(acc,amt)->acc+amt);
		System.out.println("in afterPropertiesSet of InitializingBean");
		
	}

	//step2
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("MEthod name SetBeanFactory of BeanFactoryAware");
		
	}

	
	// step 1
	public void setBeanName(String name) {
		System.out.println("IN SetBeanName of Interface BeanameAware-->");
		
	}
	
	
	
	
}
