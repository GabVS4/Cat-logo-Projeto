package state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StateTest {
	Imovel i;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testImovelDisponivel() {
		Imovel imovel = new Imovel();
		ImovelDisponivel ImovelDisponivel = new ImovelDisponivel();
		
		imovel.ImovelDisponivel();
		assertNotSame(imovel, ImovelDisponivel);
	}
	@Test
	void testImovelIndisponivel() {
		Imovel imovel = new Imovel();
		ImovelIndisponivel ImovelIndisponivel = new ImovelIndisponivel();
		
		imovel.ImovelIndisponivel();
		assertNotSame(imovel, ImovelIndisponivel);
	}
	
	@Test
	void testImovelVendido() {
		Imovel imovel = new Imovel();
		ImovelVendido ImovelVendido = new ImovelVendido();
		
		imovel.ImovelVendido();
		assertNotSame(imovel, ImovelVendido);
	}
	
}
