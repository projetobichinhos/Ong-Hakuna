package Generation;

public class AnimaisSilvestres extends ANIMAL {
	 
 	private String especie;
	private String porte;

     /*TESTE DO GITHUB*/

		//método construtor
     public AnimaisSilvestres(String nome, int idade, String cor,  String vacina,  String castrado,  String comportamento,
			 String endereco, int telefone, String sexo, String especie, String porte) {
    	 
    
    	//Irei referenciar o que é o atributo e o que será o parâmetro
	     super(nome, idade, cor, vacina, castrado,  comportamento, endereco,  telefone,  sexo);
	     this.especie = especie;
	     this.porte = porte;
     }
     
   //abaixo os métodos especie e porte
 	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
		
	public void imprimirInfo () 
	   {
		System.out.println ("Olá, meu nome é "+ getNome() +" e tenho "+getIdade()+ " anos, possuo a cor " + getCor() +
				", sou " + getVacina () + " e " + getCastrado() + ", acredite, eu sou " + getComportamento () + "." +
				"\nCaso queira me encontrar estou no endereço " +
				getEndereco() + ", mas antes de aparecer, ligue no número " + getTelefone() + " para conversar com meu dono provisório."+
				"\nAliás, sou um (a) "+ getEspecie()+ " e tenho um porte " +getPorte() + "." );
		
	   }	
}
