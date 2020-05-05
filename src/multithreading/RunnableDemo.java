package multithreading;

public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {

		Hi1 hi1 = new Hi1();
		Hello1 hello1 = new Hello1();
		Thread t1 = new Thread(hi1);
		Thread t2 = new Thread(hello1);
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}

class Hi1 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello1 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}