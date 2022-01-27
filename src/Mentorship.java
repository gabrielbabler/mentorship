import java.time.LocalDate;
import java.util.Scanner;

public class Mentorship {

    public static void main(String[] args) {

        /**
         * TIPOS PRIMITIVOS
         */
//        int number; // NUMERO INTEIRO
//        number = 10;
//
//        System.out.println(number / 3);
//
//        double number2; // NUMERO 64BIT - MAIS PRECISO, MAIS CASAS DECIMAIS
//        number2 = 10d;
//
//        System.out.println(number2 / 3);
//
//        float number3; // NUMERO 32BIT - MENOS PRECISO QUE O DOUBLE, MENOS CASAS DECIMAIS
//        number3 = 10f;
//
//        System.out.println(number3 / 3);

//        System.out.println(eMaiorDeIdade);

        /**
         * WRAPPERS
         */
//        String nome = "Gabriel";
//        String sobrenome = "Babler";
//        String nomeCompleto = nome + " " + sobrenome;
//        Integer idadeBabler = 26;
//        String frase = "O " + nomeCompleto + " tem: " + idadeBabler + " anos.";
//
//        //CONCATENAÇÃO - SOMAR UMA PALAVRA COM A OUTRA
//        System.out.println(frase);
//
//        Integer idade = 20;
//
//        String idadeString = idade.toString();
//
//        Boolean eMaiorDeIdade = false;
//
//        Double idadeDouble = 20d;
//
//        Float idadeFloat = 20f;

        /**
         * CONDICIONAIS - IF / ELSE IF / ELSE
         */

//        Integer idadePessoa;
//
//        System.out.println("Digite sua idade: ");
//
//        Scanner entrada = new Scanner(System.in);
//        idadePessoa = entrada.nextInt();

        //Se a pessoa tiver MENOS que 18 anos -> Mostre no console "NÃO PODE DIRIGIR, MUITO NOVO"
        //Se a pessoa tiver ENTRE 18 anos e 70 anos -> Mostre no console "PODE DIRIGIR"
        //Se a pessoa tiver MAIS que 70 anos -> Mostre no console "NÃO PODE DIRIGIR, MUITO VELHO"

        /**
         * < significa MENOR
         * > significa MAIOR
         * == significa IGUAL
         * <= significa MENOR ou IGUAL
         * >= significa MAIOR ou IGUAL
         * != significa NÃO É IGUAL (! é como se fosse uma negação)
         * && significa E - uma condição E outra
         * || significa OU - uma condição OU outra
         */

//        Integer id = 10;
//        if(id < 5 || id == 10 || (id == 10 && id > 5)) {
//            System.out.println("ENTREI NA CONDIÇÃO");
//        }

        //Dentro dos parenteses do IF colocamos a condição - ela retornará VERDADEIRO ou FALSO
        //O código dentro das chaves do IF só irá executar quando a condição for VERDADEIRA
//        if(idadePessoa < 18) {
//            //codigo
//            System.out.println("NÃO PODE DIRIGIR, MUITO NOVO");
//        } else if (idadePessoa >= 18 && idadePessoa <= 70) { //se a idade da pessoa for maior ou igual a 18 E a idade da pessoa for menor ou igual a 70 - eu executo o código
//            //codigo
//            System.out.println("PODE DIRIGIR");
//        } else {
//            //codigo
//            System.out.println("NÃO PODE DIRIGIR, MUITO VELHO");
//        }

        /**
         * SWITCH / CASE
         */

//        System.out.println("Digite seu genero [M ou F]:");
//
//        String genero;
//
//        Scanner entrada = new Scanner(System.in);
//        genero = entrada.next();
//
//        switch (genero.toUpperCase()) {
//            case "M":
//                System.out.println("VOCÊ SE DEFINE COMO MASCULINO.");
//                break;
//            case "F":
//                System.out.println("VOCÊ SE DEFINE COMO FEMININO");
//                break;
//            default:
//                System.out.println("VOCÊ ESCOLHER UM GENERO INVALIDO");
//                break;
//        }

        /**
         * DO / WHILE
         */

//        Integer loading = 0;
//
//        do {
//            System.out.println("Sistema carregando..");
//            loading++;
//        } while (loading < 5);
//
//        System.out.println("Sistema esta pronto!");
//
//    }

//    public static int pegarIdade(int anoNascimento){
//        int idade = LocalDate.now().getYear() - anoNascimento;
//        System.out.println("Minha idade é: " + idade);
//        return idade;
//    }

    }
}