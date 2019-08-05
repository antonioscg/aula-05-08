public class main{
		public static void main(String[] args){
		Persons person1 = new Persons("joao", 20, 2, 60);
		person1.setIdade(33);
		
		System.out.println("A pessoa " + person1.getNome() + " foi cadastrada com sucesso");
		}
		}