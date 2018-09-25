package cn.lanhan;

public class Singleton {

	/**
	 * ������:��������Ҫ������ʵ����ʱ����������,���ַ�ʽ�Ĵ���ʵ���ڵ��߳���
	 * ��û������ģ������ڴ�������߳��оͻ���ɴ������ʵ���������߳��ǲ���ȫ
	 * �ġ�
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
