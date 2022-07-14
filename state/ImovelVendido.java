package state;

public class ImovelVendido implements ImovelState {
	
	@Override
	public ImovelState terminoContrato() {
		return null;
	}

	@Override
	public ImovelState imovelAlugado() {
		return null;
	}

	@Override
	public ImovelState imovelVend() {
		return null;
	}

}
