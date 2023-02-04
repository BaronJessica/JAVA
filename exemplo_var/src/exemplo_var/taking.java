package exemplo_var;
import java.util.ArrayList;
import java.util.Map;

public class taking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		listaPessoas.add(new Pessoa("Jessica", 'F', 34));
		listaPessoas.add(new Pessoa("Lucas", 'M', 34));
		listaPessoas.add(new Pessoa("Marlene", 'F', 61));
		listaPessoas.add(new Pessoa("Jamir", 'M', 65));
		
		Integer resultado = listaPessoas.stream()
				.maptoInt(Pessoa::getIdade);
				.sum();
				
		System.out.println(resultado);
				

	}

}
