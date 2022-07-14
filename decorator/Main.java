package decorator;


public class Main {
	public static void main(String[] args) {
	
		/* Conta comprador */
		
		Funcionalidade contaComprador = new Conta();
		System.out.println(contaComprador.getNome());

		contaComprador= new adicionarConsulta(contaComprador);
		System.out.println(contaComprador.getNome());
		
		contaComprador= new EntrarContato(contaComprador);
		System.out.println(contaComprador.getNome());
		
		contaComprador= new encerrarConta(contaComprador);
		System.out.println(contaComprador.getNome());
		
		
		/* Conta vendedor */
		
		Funcionalidade contaVendedor = new Conta();
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new adicionarConsulta(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new AnunciarImovel(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new EntrarContato(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		contaVendedor= new encerrarConta(contaVendedor);
		System.out.println(contaVendedor.getNome());
		
		/* Conta ADM  */
		
		Funcionalidade contaAdiministrador = new Conta();
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new adicionarConsulta(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new AnunciarImovel(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new EntrarContato(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new encerrarConta(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
		contaAdiministrador= new Atualizacao(contaAdiministrador);
		System.out.println(contaAdiministrador.getNome());
		
}
	
}