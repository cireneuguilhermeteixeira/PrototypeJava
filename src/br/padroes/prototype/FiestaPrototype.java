package br.padroes.prototype;

public class FiestaPrototype extends CarroPrototype {
	private String modelo = "fiesta";
	private String montadora = "Ford";
	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
		this.valorCompra = fiestaPrototype.getValorCompra();
		this.ano = fiestaPrototype.getAno();
		this.cor = fiestaPrototype.getCor();
	}

	public FiestaPrototype() {
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
		return new FiestaPrototype(this);
	}

}
