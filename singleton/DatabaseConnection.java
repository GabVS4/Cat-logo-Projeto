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
	
	public void conectar() {
		System.out.println("Conectado");
	}
	
    public void desconectar() {
    	System.out.println("Desconectado");
	}

    
}
