package com.mickyli.java.design.pattern.singleton;

/**
 * 恶汉模式
 * 
 * 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
 * @author liqian
 *
 */
public class HungrySingleton1 {
	private static HungrySingleton1 instance = null;  
    static {  
    	instance = new HungrySingleton1();  
    }  
    private HungrySingleton1(){}  
    public static HungrySingleton1 getInstance() {  
    	return instance;  
    }
}
