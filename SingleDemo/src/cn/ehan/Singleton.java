package cn.ehan;

public class Singleton {
	/**
	 * 饿汉模式,类加载的时候初始化这个实例,创建单例实例简单容易,但是有一个弊端,这个实例可能没有被使用
	 * @param args
	 */
	private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getSingleton(){
    	return singleton;
    }
}
