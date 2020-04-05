package mediator;

public class Main {

	public static void main(String[] args) {
		Usuario huan = new Usuario("HuAn");
		Usuario codi = new Usuario("Codi");
		
		SalaChat sala = new SalaChat();
		sala.addParticipante(huan);
		sala.addParticipante(codi);
		
		sala.enviarMensaje(huan, codi, "Hola desde el curso de patrones de diseno");
	}

}
