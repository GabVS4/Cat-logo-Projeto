package decorator;

public class Atualizacao extends FuncionalidadeDecorator {

		public Atualizacao (Funcionalidade umFunc) {
			super(umFunc);
			nome = "Atualizar sistema";
			atualizar();
		}
		
		 public void atualizar(){
		    	System.out.println("Usuario tem acesso ao codigo fonte");
		    }
	}

	

