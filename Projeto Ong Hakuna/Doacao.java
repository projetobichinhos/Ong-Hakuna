package Generation;

import java.text.NumberFormat;
import java.util.Scanner;

public class Doacao {
	String nDoador; // nome doador
	private String tf; //telefone
	private int vDoado; //valor doado

	public Doacao() {
		this.nDoador = nDoador;
		this.tf = tf;
		this.vDoado = vDoado;
	}

	Scanner scan = new Scanner(System.in);
 
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);String formatoMoeda = nf.format(vDoado);
		return formatoMoeda;
	}
	
	public void printD() {
		System.out.println("\nPara doar ração vamos fazer um simples cadastro!!\nDigite seu nome completo:");
		nDoador = scan.nextLine();
		System.out.println("\nAgora informe seu telefone: ");
		tf = scan.nextLine();
		System.out.println("\nQual valor voce deseja doar (informe um número inteiro, vamos entender como R$)");
		vDoado = scan.nextInt();
		System.out.println("\nNome doador: " + nDoador + "\nTelefone: " + tf + "\nValor doado: " + this.formatarMoeda());
	}

	public String getnDoador() {
		return nDoador;
	}

	public void setnDoador(String nDoador) {
		this.nDoador = nDoador;
	}

	public String getTf() {
		return tf;
	}

	public void setTf(String tf) {
		this.tf = tf;
	}

	public int getvDoado() {
		return vDoado;
	}

	public void setvDoado(int vDoado) {
		this.vDoado = vDoado;
	}

}
