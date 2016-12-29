package com.mickyli.java.design.pattern.factorymethod;

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
