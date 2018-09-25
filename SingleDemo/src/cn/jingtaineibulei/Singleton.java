package cn.jingtaineibulei;

public class Singleton {
	/**
	 * 静态内部类第一次加载的时候并不会初始化实例,只有在getSingletion()的时候,才会去创建实例
	 * 因此这种方法不仅可以保证线程的安全,也能保证单例对象的唯一性,同事也延迟了单例的实例化,这是推
	 * 荐的使用方式。
	 * @param args
	 */
	private static Singleton singleton = null;
	private Singleton(){}
	public static Singleton getSingletion(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}

}
