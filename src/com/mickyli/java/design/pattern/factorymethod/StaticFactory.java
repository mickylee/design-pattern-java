package com.mickyli.java.design.pattern.factorymethod;

/**
 * 静态工厂方法模式
 * 将工厂方法模式的方法置为静态的，不需要创建工厂实例
 * @author liqian
 *
 */
public class StaticFactory {
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
