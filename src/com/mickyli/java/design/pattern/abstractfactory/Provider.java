package com.mickyli.java.design.pattern.abstractfactory;
/**
 * 提供获取发送对象的接口
 * 
 */
public interface Provider {
	Sender produce();
}
