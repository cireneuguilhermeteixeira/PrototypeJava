package br.padroes.prototype;

public class Cliente {
	public static void main(String[] args) {
		PalioPrototype prototipoPalio = new PalioPrototype();
		GolPrototype prototipoGol = new GolPrototype();


		CarroPrototype palioNovo = prototipoPalio.clonar();
		palioNovo.setValorCompra(30000.0);
		palioNovo.setAno(2020);
		palioNovo.setCor("Vermelho");
		CarroPrototype palioUsado = prototipoPalio.clonar();
		palioUsado.setValorCompra(18000.0);
		palioUsado.setAno(2012);
		palioUsado.setCor("Preto");



		CarroPrototype golNovo = prototipoGol.clonar();
		golNovo.setValorCompra(50000.0);
		golNovo.setAno(2021);
		golNovo.setCor("Vermelho");
		CarroPrototype golUsado = prototipoGol.clonar();
		golUsado.setValorCompra(12000.0);
		golUsado.setAno(2010);
		golUsado.setCor("Preto");


		System.out.println(palioNovo.exibirInfo()+"\n");
		System.out.println(palioUsado.exibirInfo()+"\n\n\n");

		System.out.println(golNovo.exibirInfo()+"\n");
		System.out.println(golUsado.exibirInfo()+"\n\n\n");


	}
}
