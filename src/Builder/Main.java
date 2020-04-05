package Builder;

public class Main {

	public static void main(String[] args) {
		Usuario huan = Usuario.Make("HuAn", "Ponce")
				.setTelefono("0990 654 321")
				.setDireccion("Ecuador")
				.setEmail("hugoponcequiro@gmail.com")
				.Build();
		
		System.out.println(huan);
	}

}
