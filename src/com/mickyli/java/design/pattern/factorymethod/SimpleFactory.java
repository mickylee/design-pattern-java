package com.mickyli.java.design.pattern.factorymethod;

/**
 * 普通工厂类
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * @author liqian
 *
 */
public class SimpleFactory {

	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }
	}
}
