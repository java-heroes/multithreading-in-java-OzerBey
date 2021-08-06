
public class Test {
	public static void main(String[] args) {
		// implements runnable
		for (int i = 0; i < 100; i++) {
			IsThread threadIs = new IsThread(23, "thread implementation for runnable ");
			threadIs.run();			
			Thread thread =new Thread(threadIs);
			thread.start();
		}

	}
}
