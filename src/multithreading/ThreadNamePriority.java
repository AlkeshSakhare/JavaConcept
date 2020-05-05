package multithreading;

public class ThreadNamePriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("This is run");
				}
			}
		};

		Thread t1 = new Thread(r1);
		System.out.println(" Thread name: " + t1.getName());// default name = Thread-0
		t1.setName("Thread custome Name");
		System.out.println("Thread priority: " + t1.getPriority());
		/*
		 * MIN PRIORITY=1 NORM PRIORITY=5 MAX PRIORITY=10
		 */
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Change Thread priority: " + t1.getPriority());
		System.out.println(" Thread name: " + t1.getName());// Thread name =Thread custome Name
		System.out.println("is t1 is alive : " + t1.isAlive());
		t1.start();
		try {
			System.out.println("is t1 is alive : " + t1.isAlive());
			t1.join();// join() ask main thread to wait until current thread execution is finished
			System.out.println("is t1 is alive : " + t1.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("is t1 is alive : " + t1.isAlive());
		System.out.println("Bye");
	}

}
