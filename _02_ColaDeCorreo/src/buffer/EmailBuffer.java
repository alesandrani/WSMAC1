package buffer;

import java.util.LinkedList;
import java.util.Queue;

import entidades.Email;

public class EmailBuffer {
	
	private final Queue<Email> buffer = new LinkedList<>();
    private final int capacidad;
    
	public EmailBuffer(int capacidad) {
		super();
		this.capacidad = capacidad;
	}
	
	public synchronized void addEmail(Email email) throws InterruptedException {
        while (buffer.size() == capacidad) {
            wait();
        }
        buffer.add(email);
        System.out.println(Thread.currentThread().getName() + " ha añadido el email con ID " + email.getId());
        notifyAll();
    }
	
	public synchronized Email eliminarEmail() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        Email email = buffer.poll();
        notifyAll();
        return email;
    }

    
}
