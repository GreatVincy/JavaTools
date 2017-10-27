package zgr.designpatterns.singleton;

/**
 * 
 * @author rong
 * 双重锁单例模式
 *
 */
public class SingletonDoubleCheck {
	//使用volatile限制【指令重排序】以及保证【缓存一致性】,volatile不保证原子性(如++操作)
	//详见: http://blog.csdn.net/glory1234work2115/article/details/50814419
	private static volatile SingletonDoubleCheck instance = null;
	
	private SingletonDoubleCheck() {
	
	}
	
	public static SingletonDoubleCheck getInstance() {
		if(instance == null) {
			// 由于是静态方法，必须对类进行加锁
			synchronized (SingletonDoubleCheck.class) {
				if(instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
	
/**
 * 指令重排序:
 * 
 * new 对象并赋值时，有以下三个指令：
 * 
 * 1.为对象分配内存
 * 2.初始化实例对象
 * 3.把引用instance指向分配的内存空间
 * 
 * 这三条指令会被JVM重排序优化，不一定按照1-2-3顺序执行，
 * 因此，在多线程情况下可能出现不一致
 * 
 */
}
