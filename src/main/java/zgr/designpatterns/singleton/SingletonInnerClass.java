package zgr.designpatterns.singleton;

/**
 *
 * @author rong 静态内部类单例模式 优点：使用静态内部类实现了LazyLoading而且避免了同步操作，推荐
 *
 */
public class SingletonInnerClass {

	private static class SignletonHolder {
		private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
	}

	private SingletonInnerClass() {

	}

	public static SingletonInnerClass getInstance() {
		return SignletonHolder.INSTANCE;
	}

}
