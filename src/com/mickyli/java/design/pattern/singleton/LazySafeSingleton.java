package com.mickyli.java.design.pattern.singleton;

/**
 * 线程安全懒汉模式
 * 对象上锁，效率低
 * @author liqian
 *
 */
public class LazySafeSingleton {

	private static LazySafeSingleton instance;
	
	private LazySafeSingleton(){}
	
	public static synchronized LazySafeSingleton getInstance(){
		if(instance == null){
			instance = new LazySafeSingleton();
		}
		return instance;
	}
	
	public Object readResolve() {  
        return instance;  
    }
}
