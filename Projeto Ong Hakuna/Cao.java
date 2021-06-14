package Generation;

import java.util.Scanner;

public class Cao {
	//Atributos
	private String nome;
	private int idade;
	private String raca;
	private String cor;
	private String sexo;
	private String porte;
	private String castrado;
	private String comportamento;
	private String endereco;
	private int telefone;
	private String vacina;

	public Cao() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public Cao(String nome, int idade, String cor, String vacina, String castrado, String comportamento, String sexo,
			String porte, String raca, String endereco, int telefone) {

		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
		this.porte = porte;
		this.castrado = castrado;
		this.comportamento = comportamento;
		this.cor = cor;
		this.vacina = vacina;

	}

	public void ficha() {

		int opcao;

		Scanner read = new Scanner(System.in);

		System.out.println("\nTemos estes lindos Cãezinhos precisando de um lar");
		System.out.println("\nEscolha as Opções abaixo:\n "
				+ "1 - Plinio\n "
				+ "2 - Suzano\n "
				+ "3 - Amora");
		opcao = read.nextInt();

		if (opcao > 0 && opcao < 4) {
			//Método de escolha switch case.
			switch (opcao) {
			case 1:

				System.out.println("\nO Plinio é um Galgo Italiano. \nIdade: 4 anos \nCor: Rajado(Preto-Branco)\n"
									+ "Porte: Grande \nEle já esta: Vacinado, Castrado, Vermifugado\n");
				System.out.println("\nEle não é o Plinio da ANITA, mas é dócil e lindo tanto quanto.");
				break;

			case 2:

				System.out.printf("\nO Suzano é Bulldog Francês. \nIdade: 2 anos \nCor: Marron \nPorte: Pequeno \n"
									+ "Ele já esta: Vacinado, Castrado, Vermifugado\n");
				System.out.printf("\nEle è Bulldog Frânces lindo, foi encontrado abandonado com uma lesão patinha. "
									+ "Mas agora ja está totalmente recuperado.");

				break;

			case 3:

				System.out.printf("\nA Amora não tem raça definida. \nIdade: 3 anos \nPorte: Médio \nEla já esta: Vacinada,"
									+ " Castrada, Vermifugada\n");
				System.out.printf("\nA Amora é uma cachorrinha linda, foi encontrada abandonada com uma lesão na barriguinha,"
									+ " passou por tratamento e agora ja está totalmente recuperada.");

				break;
			default:
			}
		} else {
			System.out.println("\nOpção Inválida");
		}

		System.out.println("\nVoce deseja adota-lo(a)? Entre com as opções abaixo: \n"
				+ "1 - Sim \n"
				+ "2 - Não ");
		
		opcao = read.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Ficamos muito felizes com a sua escolha!!! Os Cães são ótimas cia."
					+ "\n Entre em contato com a ong e conheça seu novo amigo (a), telefone: 11 98477-0766.");
			break;

		default:
			System.out.println("Poxa que Pena! Mas temos outros dogs, que tal você da uma olhada nas outras opções. ");
		}

	}
}
