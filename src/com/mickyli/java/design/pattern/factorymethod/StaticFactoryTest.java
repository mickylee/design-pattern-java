package com.mickyli.java.design.pattern.factorymethod;

/**
 * 静态工厂方法模式测试类
 * 
 * @author liqian
 *
 */
public class StaticFactoryTest {
	public static void main(String[] args) {
		Sender sender = StaticFactory.produceMail();  
        sender.send();
	}
}
