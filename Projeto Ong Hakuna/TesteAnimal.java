package Generation;
//Classes, Atributos, Objetos, encapsulamento (permissões get e set), Herança

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// System.out.println("oi");

		Scanner scan = new Scanner(System.in);
		int s;
		int sx = 0;
		System.out.println("Somos a ong Hakuna. Entregamos animais amados para adoção <3 \nTemos um menu caso queira nos conhecer melhor.");
		System.out.println("\nQual Animal voce esta pesquisando, clique no número correspondente: \n1 - Cachorro\n2 - Gato\n3"
				+ " - Animais Silvestres\n4 - Doar valores para compra de ração\n0 - Para encerrar");
		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				
				Cao Ong = new Cao();
		        Ong.ficha();
		        
				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();

				break;
			case 2:

				Gato Ong1 = new Gato();
			    Ong1.historico();
			    
			    System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();

				break;
			case 3:
				//Único case que utiliza a classe ANIMAL - Herança.
				do {
					System.out.println("\nDigite o sexo do pet q vc procura: \n1-Macho\n2Fêmea");
					sx = scan.nextInt();

					if (sx == 1) {
						System.out.println("\nEsses são nossos animais silvestres machos: ");

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
								"não castrada", "dócil", "Rua Bahia", 119343454, "Fêmea", "Ave", "Pequeno");
						Papagaio1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");

						AnimaisSilvestres Cobra1 = new AnimaisSilvestres("Gertrude", 15, "cinza", "vacinada",
								"Não castrada", "dócil", "Rua da gruta", 54543234, "Fêmea", "Réptil(cobra)", "Médio");
						Cobra1.imprimirInfo();

					}

				} while (sx != 1 && sx != 2);

				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();

				break;
			case 4:
				
				// Objeto que referencia uma herança, puxando da nossa classe Animais Silvestres
				Doacao doador = new Doacao();
				doador.printD();

				System.out.println("\nOs bichinhos agradecem!");
				System.out.println("\nPara finalizar, clique em 0.\nPara voltar ao menu, insira um número de 1 à 9.");
				s = scan.nextInt();
				break; 
				
			default:  
				System.out.println(
				"\nQual Animal voce esta pesquisando, clique no número correspondente: \n1 - Cachorro\n2 - Gato\n3 - Animais Silvestres\n4 - Doar valores para compra de ração\n0-Para encerrar");
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