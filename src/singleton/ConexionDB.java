package singleton;

public class ConexionDB {
	
	private static ConexionDB conexion;
	public String hostname;
	
	private ConexionDB() {
	}
	
	public static ConexionDB obtenerConexion() {
		if(conexion == null) {
			conexion = new ConexionDB();
		}
		return conexion;
	}

}
