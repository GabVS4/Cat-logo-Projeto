package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

	@Test
	void testConexaoDatabaseConnection() {

	String aux = "Conectado";
    
    boolean bool = aux.equals(DatabaseConnection.getInstance().conectar());
		
	assertTrue(bool);
	
	
	}

	@Test
	void testDesconexaoDatabaseConnection() {

	String aux = "Desconectado";
    
    boolean bool = aux.equals(DatabaseConnection.getInstance().desconectar());
		
	assertTrue(bool);
	
	
	}
}

