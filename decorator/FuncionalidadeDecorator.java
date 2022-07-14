package decorator;

public abstract class FuncionalidadeDecorator extends Funcionalidade {
	
	Funcionalidade funcionalidade;
	
	public FuncionalidadeDecorator(Funcionalidade umDecorator) {
		funcionalidade = umDecorator;		
	}
	public String getNome() {
		return funcionalidade.getNome() + " + " + nome;
	}
}