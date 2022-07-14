package decorator;

public class EntrarContato extends FuncionalidadeDecorator {

	public EntrarContato (Funcionalidade umFunc) {
		super(umFunc);
		nome = "Entrar em Contato";
		entraremContato();
	}
	
	 public void entraremContato(){
	    	System.out.println("Usuario pode entrar em contato");
	    }
}
