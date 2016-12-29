package com.mickyli.java.design.pattern.abstractfactory;

/**
 * 发送邮件工厂类
 * @author liqian
 *
 */
public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
