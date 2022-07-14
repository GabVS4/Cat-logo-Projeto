package state;

public class ImovelIndisponivel implements ImovelState {
	
	@Override
	public ImovelState terminoContrato() {
		System.out.println("Imovel Disponivel");
		return new ImovelDisponivel();
	}

	@Override
	public ImovelState imovelAlugado() {
		System.out.println("Imovel Indisponivel");
		return this;
	}

	@Override
	public ImovelState imovelVend() {
		System.out.println("Imovel nao pode ser vendido");
		return this;
	}

}
