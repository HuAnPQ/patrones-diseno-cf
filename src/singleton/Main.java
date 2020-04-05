package singleton;

public class Main {

	public static void main(String[] args) {
		ConexionDB conexion = ConexionDB.obtenerConexion();
		ConexionDB conexion2 = ConexionDB.obtenerConexion();
		conexion.hostname = "localhost";
		
		System.out.println(conexion.hostname);
		System.out.println(conexion2.hostname);
	}

}
