
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
		
		String saudacao = "Ol�, meu nome � ";
		String nome = "Douglas ";
		String continuacao = "e minha idade � ";
		int idade = 30;
		System.out.println(saudacao+nome+continuacao+idade);
	}
}
