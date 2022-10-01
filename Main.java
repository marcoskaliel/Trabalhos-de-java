package main;
public class Main {

	public static void main(String[] args) throws Throwable {
	
	double valorTotal = 1000.0;
	double entrada = 300.0;
	int parcelas = 10;
	// tenta rodar a exceção
	try {
		Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
		System.out.println(f.prestacao());
	}
	// caso de um erro no try ele mostra a mensagem 
	catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}
}
}	