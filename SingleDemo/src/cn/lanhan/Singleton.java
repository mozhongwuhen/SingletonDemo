package cn.lanhan;

public class Singleton {

	/**
	 * 懒加载:当我们需要这个类的实例的时候再来创建,这种方式的创建实例在单线程中
	 * 是没有问题的，但是在创建多个线程中就会造成创建多个实例，所以线程是不安全
	 * 的。
	 * @param args
	 */
	private static Singleton singleton = null;
	private Singleton(){}
	public static Singleton getSingleton(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}

}
