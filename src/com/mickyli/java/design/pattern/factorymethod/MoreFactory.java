package com.mickyli.java.design.pattern.factorymethod;

/**
 * 多个工厂方法模式
 * 多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @author liqian
 *
 */
public class MoreFactory {
	
	public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
