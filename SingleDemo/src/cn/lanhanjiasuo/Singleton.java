package cn.lanhanjiasuo;

public class Singleton {
	/**
	 * 懒汉模式(加锁版)虽然可以解决线程同步问题,但是会影响效率，因为只要调用getSingleton方法都会同步
	 * ,造成了不必要的资源浪费。
	 * @param args
	 */
	private static Singleton singleton = null;
	private Singleton(){}
    public static synchronized Singleton getSingleton(){
    	if(singleton == null){
    		singleton = new Singleton();
    	}
    	return singleton;
    }
}
