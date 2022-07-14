package state;

public class ImovelNovo implements ImovelState{
	
	public ImovelDisponivel terminoContrato() {
		System.out.println("Imovel Disponivel");
		return new ImovelDisponivel();
	}

	public ImovelIndisponivel imovelAlugado() {
		System.out.println("Imovel Indisponivel");
		return new ImovelIndisponivel();
	}

	public ImovelState imovelVend() {
		System.out.println("Imovel Vendido");
		return new ImovelVendido();
	}

}
