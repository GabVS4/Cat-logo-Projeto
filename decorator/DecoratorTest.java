package decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecoratorTest {

	@Test
	void testAdcionarConsulta() {
	
	 String aux = "Usuario + Adcionar Consulta";	
		
	 Funcionalidade contaTeste = new Conta();
	 contaTeste = new AdicionarConsulta(contaTeste);
	 
	 boolean bool = aux.equals(contaTeste.getNome());
	
	 assertTrue(bool);
	
	
	}
	
	@Test
	void testAnunciarImovel() {
	
	 String aux = "Usuario + Anunciar Imovel";	
		
	 Funcionalidade contaTeste = new Conta();
	 contaTeste = new AnunciarImovel(contaTeste);
	 
	 boolean bool = aux.equals(contaTeste.getNome());
	
	 assertTrue(bool);
	
	
	}
	
	@Test
	void testAtualizacao() {
	
	 String aux = "Usuario + Atualizar sistema";	
		
	 Funcionalidade contaTeste = new Conta();
	 contaTeste = new Atualizacao(contaTeste);
	 
	 boolean bool = aux.equals(contaTeste.getNome());
	
	 assertTrue(bool);
	
	 
	}
	
	@Test
	void testEncerrarConta() {
	
	 String aux = "Usuario + Encerrar Conta";	
		
	 Funcionalidade contaTeste = new Conta();
	 contaTeste = new EncerrarConta(contaTeste);
	 
	 boolean bool = aux.equals(contaTeste.getNome());
	
	 assertTrue(bool);
	
	 
	}
	
	@Test
	void testEntrarContato() {
	
	 String aux = "Usuario + Entrar em Contato";	
		
	 Funcionalidade contaTeste = new Conta();
	 contaTeste = new EntrarContato(contaTeste);
	 
	 boolean bool = aux.equals(contaTeste.getNome());
	
	 assertTrue(bool);
	
	 
	}

}
