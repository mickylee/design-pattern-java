package com.mickyli.java.design.pattern.factorymethod;

/*
 * 多个工厂方法模式测试类
 * 缺点：
 * 需要实例化工厂类
 */
public class MoreFactoryTest {

	public static void main(String[] args) {
		MoreFactory factory = new MoreFactory();  
        Sender sender = factory.produceMail();  
        sender.send();
	}
}
