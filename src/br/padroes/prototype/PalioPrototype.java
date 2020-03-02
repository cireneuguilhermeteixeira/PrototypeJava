package br.padroes.prototype;

public class PalioPrototype extends CarroPrototype {
	private String modelo = "palio";
	private String montadora = "Fiat";
	private PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.getValorCompra();
		this.ano = palioPrototype.getAno();
		this.cor = palioPrototype.getCor();
	}

	public PalioPrototype() {
		ano = 0;
		cor = "";
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: "+this.modelo+ " \n" +
				"Montadora: "+this.montadora+" \n" +
				"Valor: R$ "+getValorCompra()+" \n" +
				"Cor: "+getCor()+" \n" +
				"Ano: "+getAno();
	}


	@Override
	public CarroPrototype clonar() {
		return new PalioPrototype(this);
	}

}
