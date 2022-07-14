package state;

public class Imovel {
	
	protected ImovelState estado;
	public int i;
	
	public Imovel() {
		estado = new ImovelNovo();
	}
	
	public void ImovelDisponivel() {
		estado = estado.ImovelDisponivel();
	}

	public void ImovelIndisponivel() {
		estado = estado.ImovelIndisponivel();
	}

	public void ImovelVendido() {
		estado = estado.ImovelVendido();
	}

}
