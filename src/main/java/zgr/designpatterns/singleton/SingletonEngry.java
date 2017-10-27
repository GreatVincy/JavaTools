package zgr.designpatterns.singleton;

/**
 * 
 * @author rong 恶汉式单例模式 优点: 简单，且不需要线程同步 缺点:
 *         一开始就装载单例实例，可能占用不必要的内存空间，没有达到LazyLoading效果
 *
 */
public class SingletonEngry {

	private static final SingletonEngry INSTANCE = new SingletonEngry();

	private SingletonEngry() {
	}

	public static SingletonEngry getInstance() {
		return INSTANCE;
	}

	/*
	 * 或者使用如下写法
	 * 
	 * private static SignletonEngry instance = null;
	 * 
	 * static { instance = new SignletonEngry(); }
	 * 
	 * private SignletonEngry() { }
	 * 
	 * public static SignletonEngry getInstance() { return instance; }
	 *
	 */

}
