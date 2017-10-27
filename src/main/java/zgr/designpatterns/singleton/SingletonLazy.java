package zgr.designpatterns.singleton;

/**
 * 
 * @author rong
 * 懒汉式单例模式实现
 * 优点: 简单
 * 缺点：效率低，因为不管实例化与否，都需要在方法上进行同步锁操作
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instance = null;
	
	private SingletonLazy() {
	}
	
	public static synchronized SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

}
