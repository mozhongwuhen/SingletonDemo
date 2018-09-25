package cn.lanhanyouhua;

public class Singleton {
	/**
	 * ����ʽ�Ż���
	 * getSingleton���������������пա���һ����Ϊ�˲���Ҫ��ͬ�����ڶ����ж�null����Ϊ��
	 * �ڿյ������ȥ����ʵ�������Ǽȿ�������Ҫ��ʱ��ȥ����ʵ�������ܹ���֤�̰߳�ȫ��ͬʱ���ܱ�
	 * ֤���������ʼ��֮�����getSingleton�����������ͬ����
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
