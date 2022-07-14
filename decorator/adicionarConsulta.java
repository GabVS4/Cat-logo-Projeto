package decorator;

public class adicionarConsulta extends FuncionalidadeDecorator {

	public adicionarConsulta(Funcionalidade umFunc) {
		nome = "Adcionar Consulta";
		consultarImovel();
	}
    public void consultarImovel(){
    	System.out.println("Usuario agora eh capaz de consultar imovel.");
    }
}