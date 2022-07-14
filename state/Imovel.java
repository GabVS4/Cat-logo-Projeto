package state;

public class Imovel {
	
	protected ImovelState estado;
	public int i;
	
	public Imovel() {
		estado = new ImovelNovo();
	}
	
	public void ImovelDisponivel() {
		estado = estado.terminoContrato();
	}

	public void ImovelIndisponivel() {
		estado = estado.imovelAlugado();
	}

	public void ImovelVendido() {
		estado = estado.imovelVend();
	}

}
