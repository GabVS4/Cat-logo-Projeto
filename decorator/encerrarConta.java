package decorator;

public class encerrarConta extends FuncionalidadeDecorator{

		public encerrarConta (Funcionalidade umFunc) {
			nome = "Encerrar Conta";
			encerrarconta();
		}
		
		 public void encerrarconta(){
		    	System.out.println("Usuario pode encerrar conta");
		    }
	}
	

