package thread;

import java.util.Random;

import buffer.EmailBuffer;
import entidades.Email;

public class Producer  extends Thread{
	
	private  EmailBuffer buffer;
    private static int emailContador = 1;
    
	public Producer(EmailBuffer buffer,String name) {
		super(name);
		this.buffer = buffer;
	}
	@Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                String destinatario = random.nextBoolean() ? "user@example.com" : "pikachu@gmail.com";
                String remitente = "producer@example.com";
                String asunto = "Asunto " + emailContador;
                String cuerpo = "Cuerpo del mensaje " + emailContador;

                if (destinatario.equals("pikachu@gmail.com")) {
                    System.out.println(getName() + " ha descartado un email con destinatario " + destinatario);
                } else {
                    Email email = new Email(emailContador++, destinatario, remitente, asunto, cuerpo);
                    buffer.addEmail(email);
                }

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
