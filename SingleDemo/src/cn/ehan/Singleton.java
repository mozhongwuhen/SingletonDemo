package cn.ehan;

public class Singleton {
	/**
	 * ����ģʽ,����ص�ʱ���ʼ�����ʵ��,��������ʵ��������,������һ���׶�,���ʵ������û�б�ʹ��
	 * @param args
	 */
	private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getSingleton(){
    	return singleton;
    }
}
