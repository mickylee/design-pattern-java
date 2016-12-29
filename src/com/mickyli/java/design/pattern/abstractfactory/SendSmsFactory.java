package com.mickyli.java.design.pattern.abstractfactory;

/**
 * 发送短信工厂类
 * @author liqian
 *
 */
public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
