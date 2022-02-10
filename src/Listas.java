import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listas {

    public static void main(String[] args) {
        //List

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); //indice 0
        numbers.add(2); //indice 1
        numbers.add(3); //indice 2
        numbers.add(4); //indice 3

        System.out.println("Minha lista:" + numbers);
        System.out.println("Tamanho da minha lista: " + numbers.size());
        System.out.println("Meu indice 0 (primeiro valor da lista) é: " + numbers.get(0));

        /**
         * Percorrer pela lista, e se o valor for PAR (divisivel por 2 de resto 0)
         * Eu devo deletar da lista
         */

        for(int i=0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
            }
        }

        //ForEach
        numbers.forEach(number -> {
            if(number % 2 == 0) {
                numbers.remove(number);
            }
        });

        System.out.println("Minha lista após o for remover os numeros pares: " + numbers);

        List<Integer> idades = new ArrayList<>();
        idades.add(24);
        idades.add(25);
        idades.add(10); //indice 2
        idades.add(30);
        idades.add(44);
        idades.add(54);
        idades.add(30);
        idades.add(25);
        idades.add(10); //indice 8

        //Set é uma coleção que ordena e não permite repetidos
        Set<Integer> idadesSemRepetidos = new HashSet<>();

        idades.forEach(idade -> {
            idadesSemRepetidos.add(idade);
        });

        System.out.println("Lista sem idades repetidas: " + idadesSemRepetidos);

        if(idadesSemRepetidos.contains(24)) {
            idadesSemRepetidos.remove(24);
        }

        System.out.println("Lista sem idades repetidas e o 24: " + idadesSemRepetidos);

        //Chave e valor
        //RG e NOME
        Map<Integer, Pessoa> pessoas = new HashMap<>();

        Pessoa p1 = new Pessoa("Gabriel", 26, LocalDate.now());
        pessoas.put(1234, p1);

        Pessoa p2 = new Pessoa("Vanessa", 22, LocalDate.now());
        pessoas.put(3333, p2);

        System.out.println("Meu map: " + pessoas);
        System.out.println("Meu valor da chave 1234: " + pessoas.get(1234).toString());
        System.out.println("Meu valor da chave 3333: " + pessoas.get(3333).toString());

        pessoas.forEach((chave,valor) -> {
            if(chave == 1234){
                System.out.println("Seja bem-vindo " + valor.getNome());
            } else {
                System.out.println("Seja bem-vinda " + valor.getNome());
            }
        });

//        System.out.println("Lista de idades: " + idades);

//        BUG
//        for(int i=0; i < idades.size(); i++) {
//            for(int j=1; j < idades.size(); j++){
//                if(idades.get(i) == idades.get(j)) {
//                    idades.remove(idades.get(j));
//                }
//            }
//        }
//        System.out.println("Lista sem idades repetidas: " + idades);
    }

}
