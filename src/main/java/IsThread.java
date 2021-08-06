

public class IsThread implements Runnable {

	private int id;
	private int count;
	private String threadName;

	public IsThread() {
		super();
	}

	public IsThread(int count, String threadName) {
		super();
		this.count = count;
		this.threadName = threadName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	// run method for thread
	@Override
	public void run() {
		System.err.println(getThreadName() + "is starting...");
		for (int i = 1; i < this.count; i++) {
			try {
				Thread.sleep(555);
				System.out.println("Thread " +i+"." + getThreadName()+" is running..");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
