package com.mickyli.java.design.pattern.singleton;

/**
 * 双重校验锁
 * 
 *  考虑这样一种情况，就是有两个线程同时到达，即同时调用 getInstance() 方法，
 *
 *	此时由于 instance == null ，所以很明显，两个线程都可以通过第一重的 instance == null ，
 *	
 *	进入第一重 if 语句后，由于存在锁机制，所以会有一个线程进入 lock 语句并进入第二重 instance == null ，
 *	
 *	而另外的一个线程则会在 lock 语句的外面等待。
 *	
 *	而当第一个线程执行完 new  SingleTon（）语句后，便会退出锁定区域，此时，第二个线程便可以进入 lock 语句块，
 *	
 *	此时，如果没有第二重 instance == null 的话，那么第二个线程还是可以调用 new  SingleTon （）语句，
 *	
 *	这样第二个线程也会创建一个 instance实例，这样也还是违背了单例模式的初衷的，
 *	
 *	所以这里必须要使用双重检查锁定
 * 
 * @author liqian
 *
 */
public class DoubleCheckLockSingleton {
	private volatile static DoubleCheckLockSingleton instance;

	private DoubleCheckLockSingleton() {}

	public static DoubleCheckLockSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLockSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckLockSingleton();
				}
			}
		}
		return instance;
	}
}
