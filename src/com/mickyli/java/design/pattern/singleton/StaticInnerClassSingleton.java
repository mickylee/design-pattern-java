package com.mickyli.java.design.pattern.singleton;

/**
 * 静态内部类
 * 
 * 跟恶汉模式一样利用了classloder的机制来保证初始化instance时只有一个线程
 * 
 * 恶汉模式只要Singleton类被装载了，那么instance就会被实例化（没有达到lazy loading效果），
 * 而这种方式是Singleton类被装载了，instance不一定被初始化。
 * 因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，
 * 才会显示装载SingletonHolder类，从而实例化instance
 * 
 * 但是如果在构造函数中抛出异常，实例将永远得不到创建，也会出错
 * 
 * @author liqian
 *
 */
public class StaticInnerClassSingleton {
	private static class SingletonHolder {  
		private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();  
    }  
    private StaticInnerClassSingleton(){}
    
    public static final StaticInnerClassSingleton getInstance() {  
    	return SingletonHolder.INSTANCE;  
    }
}
