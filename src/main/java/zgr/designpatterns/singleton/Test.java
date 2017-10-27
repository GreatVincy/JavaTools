package zgr.designpatterns.singleton;

public class Test {
	/**
	 * 测试方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1000; ++i) {
			new Thread(() -> System.out.println(SingletonEnum.INSTANCE.getInstance())).start();
		}
	}
}
