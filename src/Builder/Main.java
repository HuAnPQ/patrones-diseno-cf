package Builder;

public class Main {

	public static void main(String[] args) {
		Usuario huan = Usuario.Make("HuAn", "Ponce")
				.setMedioContacto(true)
				.setTelefono("0990 654 321")
				.setDireccion("Ecuador")
				.setEmail("hugoponcequiro@gmail.com")
				.Build();
		
		Usuario jose = Usuario.Make("Jose", "Alcivar").Build();
		
		System.out.println(huan);
		System.out.println(jose);
		
		Usuario juan = Usuario.Make("Maria", "Lopez")
				.setMedioContacto(true)
				.setTelefono("0990 987 654")
				.setDireccion("Anonimus")
				.setEmail("maria@gmail.com")
				.setMetodoPago("Paypal")
				.setToken("kkkkkkk5555")
				.Build();
		
		System.out.println(juan);
	}

}
