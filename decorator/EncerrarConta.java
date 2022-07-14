package decorator;

public class EncerrarConta extends FuncionalidadeDecorator{

		public EncerrarConta (Funcionalidade umFunc) {
			super(umFunc);
			nome = "Encerrar Conta";
			encerrarconta();
		}
		
		 public void encerrarconta(){
		    	System.out.println("Usuario pode encerrar conta");
		    }
	}
	

