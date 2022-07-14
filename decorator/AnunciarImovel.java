package decorator;

public class AnunciarImovel extends FuncionalidadeDecorator {

	public AnunciarImovel(Funcionalidade umFunc) {
		nome = "Anunciar Imovel";
		registrar();
		anunciar();
	}
	
	public void registrar() {
		System.out.println("Usuario pode registrar imovel");
	}
	
	public void anunciar() {
		System.out.println("Usuario pode anunciar imovel");
		
	}

}