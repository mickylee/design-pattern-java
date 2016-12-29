package com.mickyli.java.design.pattern.factorymethod;

/**
 * 普通工厂测试类
 * 缺点：
 * 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象
 * 
 * @author liqian
 *
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}
}
