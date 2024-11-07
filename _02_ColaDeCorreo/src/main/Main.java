package main;

import buffer.EmailBuffer;
import thread.Consumer;
import thread.Producer;

public class Main {

	public static void main(String[] args) {
		 EmailBuffer buffer = new EmailBuffer(5);

	        Producer producer1 = new Producer(buffer, "Productor 1");
	        Producer producer2 = new Producer(buffer, "Productor 2");
	        Producer producer3 = new Producer(buffer, "Productor 3");

	        Consumer consumer1 = new Consumer(buffer, "Consumidor 1");
	        Consumer consumer2 = new Consumer(buffer, "Consumidor 2");

	        producer1.start();
	        producer2.start();
	        producer3.start();

	        consumer1.start();
	        consumer2.start();

	}

}
