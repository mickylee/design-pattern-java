package com.mickyli.java.design.pattern.singleton;

/**
 * 恶汉模式
 * 
 * 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
 * @author liqian
 *
 */
public class HungrySingleton2 {
	
	private static HungrySingleton2 instance = new HungrySingleton2();  
 
    private HungrySingleton2(){}  
    
    //静态，不用同步（类加载时已初始化，不会有多线程的问题）
    public static HungrySingleton2 getInstance() {  
    	return instance;  
    }
}
