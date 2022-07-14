package singleton;

import java.sql.Connection; 

public class DatabaseConnection {
	
	private Connection conexao;
	private String nomeBanco; 
	
	private static DatabaseConnection instancia;
	
	private DatabaseConnection () {
		
		
	}
	
	public static synchronized DatabaseConnection getInstance() {
		if (instancia == null) {
			instancia = new DatabaseConnection();
		}
	
		return instancia;
	}
	
	public String conectar() {
		return "Conectado";
	}
	
    public String desconectar() {
    	return "Desconectado";
	}

    
}
