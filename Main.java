import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static String nomesCientificos[] = {"Patagioenas picazuro", "Patagioenas maculosa", "Zenaida auriculata", 
           "Columbina picui", "Gubernetes yetapa", "Xolmis cinereus",
           "Griseotyrannus aurantioatrocristatus", "Prognet tapera", "Suiriri suiriri", 
           "Pyrocephalus runinus"};
           
    
    /**
     * Dados ficaram salvos dentro dessa classe.
     */
    /*public static void main()
    {
        Ave aves[];
        aves = new Ave[10];
        for(int i = 0; i < 10; i++) {
            aves[i] = new Ave(nomesCientificos[i]);
        }
        
        for (int j = 0; j < 10; j++){
            System.out.printf("%s%n", aves[j].getNome());
        }
    }*/
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Ave aves[];
        aves = new Ave[10];
        int number = 1;
        for(int i = 0; i < 10; i++) {
            aves[i] = new Ave(nomesCientificos[i]);
        }
    
        while(number != 0) {
            number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.printf("%s%n", aves[0].getNome());
                    break;
                case 2:
                    System.out.printf("%s%n", aves[1].getNome());
                    break;
                case 3:
                    System.out.printf("%s%n", aves[2].getNome());
                    break;
                case 4:
                    System.out.printf("%s%n", aves[3].getNome());
                    break;
                case 5:
                    System.out.printf("%s%n", aves[4].getNome());
                    break;
                case 6:
                    System.out.printf("%s%n", aves[5].getNome());
                    break;
                case 7:
                    System.out.printf("%s%n", aves[6].getNome());
                    break;
                case 8:
                    System.out.printf("%s%n", aves[7].getNome());
                    break;
                case 9:
                    System.out.printf("%s%n", aves[8].getNome());
                    break;
                case 10:
                    System.out.printf("%s%n", aves[9].getNome());
                    break;
                    
            }
        }
    }
}