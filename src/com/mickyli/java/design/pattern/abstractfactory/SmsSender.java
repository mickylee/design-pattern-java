package com.mickyli.java.design.pattern.abstractfactory;

/**
 * 发送短信
 * @author liqian
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is a sms send");
	}

}
