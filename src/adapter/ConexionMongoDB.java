package adapter;

public class ConexionMongoDB implements IConexionNoSQL {

	@Override
	public void conexion() {
		System.out.println("Conexion con MongoDB");
	}

	@Override
	public String excecuteSentence() {
		return "Consulta MongoDB";
	}

}
