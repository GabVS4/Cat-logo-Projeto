package state;

public class ImovelDisponivel implements ImovelState{
	
	@Override
	public ImovelState terminoContrato() {
		System.out.println("Imovel Disponivel");
		return this;
	}

	@Override
	public ImovelState imovelAlugado() {
		System.out.println("Imovel Indisponivel");
		return new ImovelIndisponivel();
	}

	@Override
	public ImovelState imovelVend() {
		System.out.println("Imovel Vendido");
		return new ImovelVendido();
	}

}
