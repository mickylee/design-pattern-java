package com.mickyli.java.design.pattern.factorymethod;

/**
 * 发送邮件
 * @author liqian
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is a mail send");
	}

}
