package thread;

import buffer.EmailBuffer;
import entidades.Email;

public class Consumer extends Thread{
	
	private final EmailBuffer buffer;

    public Consumer(EmailBuffer buffer, String name) {
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Email email = buffer.eliminarEmail();
                System.out.println(getName() + " ha enviado el email: " + email);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
