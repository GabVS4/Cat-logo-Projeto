package decorator;


public class Main {
	public static void main(String[] args) {
	
		/* Conta comprador */
		
		Funcionalidade contaComprador = new Conta();
		System.out.println(contaComprador.getNome() + " - Comprador");
		System.out.println("\n");

		contaComprador= new AdicionarConsulta(contaComprador);
		System.out.println(contaComprador.getNome());
		
		contaComprador= new EntrarContato(contaComprador);
		System.out.println(contaComprador.getNome());
		
		contaComprador= new EncerrarConta(contaComprador);
		System.out.println(contaComprador.getNome());
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		/* Conta vendedor */
		
		Funcionalidade contaVendedor = new Conta();
		System.out.println(contaVendedor.getNome() + " - Vendedor");
		System.out.println("\n");
		
		contaVendedor= new AdicionarConsulta(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new AnunciarImovel(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new EntrarContato(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new EncerrarConta(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		/* Conta ADM  */
		
		Funcionalidade contaAdiministrador = new Conta();
		System.out.println(contaAdiministrador.getNome() + " - Administrador");
		System.out.println("\n");
		
		contaAdiministrador= new AdicionarConsulta(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new AnunciarImovel(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new EntrarContato(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new EncerrarConta(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new Atualizacao(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		System.out.println("---------------------------------------------------------------------------------------");
	
}
	
}