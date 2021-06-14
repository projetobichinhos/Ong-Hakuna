//Classes, Atributos, Objetos, encapsulamento (permissões get e set), Herança
//1° sprint:
package Generation;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s;
		int sx = 0;
		System.out.println(
				"Somos a ong Hakuna. Entregamos animais amados para adoção <3 \nTemos um menu caso queira nos conhecer melhor.");
		System.out.println("\nQual Animal voce esta pesquisando, clique no número correspondente: \n" + "1 - Cachorro\n"
				+ "2 - Gato\n" + "3 - Animais Silvestres Legalizados\n" + "4 - Doar valores para compra de ração\n"
				+ "0 - Para encerrar");

		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				//O objeto Ong foi instanciado, puxando o método ficha, da classe Cao.
				Cao Ong = new Cao();
				Ong.ficha();

				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();

				break;
				
			case 2:
				//O objeto Ong1 foi intanciado, puxando o método histórico, da classe Gato.
				Gato Ong1 = new Gato();
				Ong1.historico();

				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();

				break;
				
			case 3:
				// Único case que utiliza a classe ANIMAL - Herança.
				do {
					System.out.println("\nDigite o sexo do pet q vc procura: \n" + "1 - Macho\n" + "2 - Fêmea");

					sx = scan.nextInt();

					if (sx == 1) {
						System.out.println("\nEsses são nossos animais silvestres machos: ");

						// Objeto que referencia uma herança, puxando da nossa classe Animais Silvestres
						AnimaisSilvestres Aves1 = new AnimaisSilvestres("Gunter", 3, "preta", "vacinado", "castrado",
								"bonzinho", "Rua Capixaba", 959129749, "macho", "ave", "pequeno");
						Aves1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");
						AnimaisSilvestres Jabuti1 = new AnimaisSilvestres("Jamelão", 8, "cinza", "vacinada",
								"Não castrada", "dócil", "Rua da concórdia", 545514, "Macho", "Jabuti", "Pequeno");
						Jabuti1.imprimirInfo();

					} else if (sx == 2) {
						System.out.println("\nEsses são nossos animais silvestres fêmeas: ");

						AnimaisSilvestres Papagaio1 = new AnimaisSilvestres("Lora", 2, "verde", "vacinada",
								"não castrada", "dócil", "Rua Bahia", 119343454, "Fêmea", "Ave (papagaio)", "Pequeno");
						Papagaio1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");

						AnimaisSilvestres Cobra1 = new AnimaisSilvestres("Gertrude", 15, "cinza", "vacinada",
								"Não castrada", "dócil", "Rua da gruta", 54543234, "Fêmea", "Réptil(cobra jibóia)", "Médio");
						Cobra1.imprimirInfo();

					}

				} while (sx != 1 && sx != 2);

				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();

				break;
			case 4:
				//O objeto doador foi intanciado, puxando o método printD, da classe Doacao.
				Doacao doador = new Doacao();
				doador.printD();

				System.out.println("\nOs bichinhos agradecem!");
				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();
				break;

			default:
				System.out.println("\nQual Animal voce esta pesquisando, clique no número correspondente: \n"
						+ "1 - Cachorro\n" + "2 - Gato\n" + "3 - Animais Silvestres\n"
						+ "4 - Doar valores para compra de ração\n" + "0-Para encerrar");
				s = scan.nextInt();
			}

		}
		System.out.println("\nOs animaizinhos também recebem visitas sem compromisso.\n"
				+ "\nJabuti Jamelão: Sou feliz em dizer, que nos lares provisórios somos bem tratados."
				+ "\nGata Penélope: Quando pedimos muito carinho, vem crianças nos ver! "
				+ "\nCão Thor:E é cada adulto cheio de amor, que me enche de abraços."
				+ "\n\nGostou de algo? Fale com a gente! Ong Hakuna."
				+ "\nTelefone: 11 98477-0766. End: Rua Bituva, 56. Jd. Capela. São Paulo - SP.");
	}

}