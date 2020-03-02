package br.padroes.prototype;

public abstract class CarroPrototype {
	protected double valorCompra;
	protected String cor;
	protected int ano;
	public abstract String exibirInfo();

	public abstract CarroPrototype clonar();

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
