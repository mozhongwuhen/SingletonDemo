package cn.lanhanjiasuo;

public class Singleton {
	/**
	 * ����ģʽ(������)��Ȼ���Խ���߳�ͬ������,���ǻ�Ӱ��Ч�ʣ���ΪֻҪ����getSingleton��������ͬ��
	 * ,����˲���Ҫ����Դ�˷ѡ�
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
