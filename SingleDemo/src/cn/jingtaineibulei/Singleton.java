package cn.jingtaineibulei;

public class Singleton {
	/**
	 * ��̬�ڲ����һ�μ��ص�ʱ�򲢲����ʼ��ʵ��,ֻ����getSingletion()��ʱ��,�Ż�ȥ����ʵ��
	 * ������ַ����������Ա�֤�̵߳İ�ȫ,Ҳ�ܱ�֤���������Ψһ��,ͬ��Ҳ�ӳ��˵�����ʵ����,������
	 * ����ʹ�÷�ʽ��
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
