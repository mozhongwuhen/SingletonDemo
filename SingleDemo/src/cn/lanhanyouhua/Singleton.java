package cn.lanhanyouhua;

public class Singleton {
	/**
	 * 懒汉式优化版
	 * getSingleton方法进行了两次判空。第一次是为了不必要的同步，第二次判断null则是为了
	 * 在空的情况下去创建实例。我们既可以在需要的时候去创建实例，又能够保证线程安全，同时还能保
	 * 证单例对象初始化之后调用getSingleton方法不会进行同步锁
	 * @param args
	 */
	private static Singleton singleton = null;
	private Singleton(){}
	public static Singleton getSingleton(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
