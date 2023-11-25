import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String estado = "";

        System.out.println("Qual é o nome do primeiro aluno?");
        String nome= scanner.next();
        System.out.println("Qual é o email do primeiro aluno?");
        String email= scanner.next();
        System.out.println("Quais sao as notas desse aluno?");

        double pri_aluno1= scanner.nextDouble();
        double pri_aluno2= scanner.nextDouble();
        double pri_aluno3= scanner.nextDouble();

        double media= (pri_aluno1+pri_aluno2+pri_aluno3)/3;


        if(media <10 && media >=0);{
            if (media >=7){
                estado= "Aprovado!";
            } else if (media<=7 && media<= 4){
                estado= "Recuperaçao";
            } else{
                estado= "Reprovado!";
            }
        }
        String mediafinal= String.format("%.1f", media);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Media do aluno: " + media);
        System.out.println("Estado do aluno: " + estado);

        System.out.println("---------------------------");

        String estado2 = "";

        System.out.println("Qual é o nome do Segundo aluno?");
        String nome2= scanner.next();
        System.out.println("Qual é o email do segundo aluno?");
        String email2= scanner.next();
        System.out.println("Quais sao as notas do segundo aluno?");


        double seg_aluno1= scanner.nextDouble();
        double seg_aluno2= scanner.nextDouble();
        double seg_aluno3= scanner.nextDouble();

        double media2= (seg_aluno1+seg_aluno2+seg_aluno3)/3;


        if(media2 <10 && media2 >=0);{
            if (media2 >=7){
                estado2= "Aprovado!";
            } else if (media2<=7 && media2<= 4){
                estado2= "Recuperaçao";
            } else{
                estado2= "Reprovado!";
            }
        }
        String mediafinal2= String.format("%.1f", media2);
        System.out.println("Nome: " + nome2);
        System.out.println("Email: " + email2);
        System.out.println("Media do aluno: " + media2);
        System.out.println("Estado do aluno: " + estado2);

        String estado3= "";

        System.out.println("-------------------------------");

        System.out.println("Qual é o nome do terceiro aluno?");
        String nome3= scanner.next();
        System.out.println("Qual é o email do segundo aluno?");
        String email3= scanner.next();
        System.out.println("Quais sao as notas do terceiro aluno?");

        double ter_aluno1= scanner.nextDouble();
        double ter_aluno2= scanner.nextDouble();
        double ter_aluno3= scanner.nextDouble();

        double media3= (ter_aluno1+ter_aluno2+ter_aluno3)/3;

        if (media3<=10 && media3>=0){
            if(media3>=7){
                estado3= "Aprovado!";
            }else if (media3<=7 && media3>=4){
                estado3= "Recuperação!";
            } else{
                estado3= "Reprovado!";
            }
        }
        String mediafinal3= String.format("%.1f", media3);
        System.out.println("Nome: "+nome3);
        System.out.println("Email: "+email3);
        System.out.println("Media do terceiro aluno: "+ media3);
        System.out.println("Estado: "+ estado3);
        }
    }