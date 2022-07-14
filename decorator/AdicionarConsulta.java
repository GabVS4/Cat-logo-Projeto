package decorator;

public class AdicionarConsulta extends FuncionalidadeDecorator {

	public AdicionarConsulta(Funcionalidade umFunc) {
		super(umFunc);
		nome = "Adcionar Consulta";
		consultarImovel();
	}
    public void consultarImovel(){
    	System.out.println("Usuario agora eh capaz de consultar imovel.");
    }
}