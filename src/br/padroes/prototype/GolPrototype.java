package br.padroes.prototype;

public class GolPrototype extends CarroPrototype {

	private String modelo = "gol";
	private String montadora = "Wolkswagen";
	protected GolPrototype(GolPrototype golPrototype) {
		this.valorCompra = golPrototype.getValorCompra();
		this.ano = golPrototype.getAno();
		this.cor = golPrototype.getCor();
	}

	public GolPrototype() {
		ano = 0; cor = "";	valorCompra = 0.0;
	}
	@Override
	public String exibirInfo() {
		return "Modelo: "+this.modelo+ " \n Montadora: "+this.montadora+" \n Valor: R$ "+getValorCompra()+" \n Cor: "+getCor()+" \n Ano: "+getAno();
	}

	@Override
	public CarroPrototype clonar() {
		return new GolPrototype(this);
	}


}
