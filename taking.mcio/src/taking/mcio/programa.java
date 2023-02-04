	package taking.mcio;
	
	import java.util.ArrayList;
	import java.util.IntSummaryStatistics;
	

	public class programa {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Pessoa> listaPessoas = new ArrayList<>();
			listaPessoas.add(new Pessoa("Jessica", 'F', 29));
			listaPessoas.add(new Pessoa("Lucas", 'M', 34));
			listaPessoas.add(new Pessoa("Feminino", 'F', 61));
			listaPessoas.add(new Pessoa("Masc", 'M', 65));
			
			IntSummaryStatistics estaticas= listaPessoas.stream()
				.mapToInt(Pessoa::getIdade)
				.summaryStatistics(); //metodo
			
			System.out.println(estaticas.getMax());
			System.out.println(estaticas.getMin());
			System.out.println(estaticas.getSum());
			System.out.println(estaticas.getAverage());
			System.out.println(estaticas.getCount());

		}

	}