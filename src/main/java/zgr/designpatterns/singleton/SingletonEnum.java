package zgr.designpatterns.singleton;

/**
 * 
 * @author rong 枚举实现单例模式（单例对象为Resource） 
 * 优点：天然线程安全, LazyLoading, 防止用反射、反序列化创建多个实例
 *
 */
public enum SingletonEnum {
	INSTANCE;
	private Resource instance = null;

	private SingletonEnum() {
		instance = new Resource();
	}

	public Resource getInstance() {
		return instance;
	}

}

class Resource {
	Resource() {
	}
}