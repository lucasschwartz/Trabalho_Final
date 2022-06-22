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

           
 
    public static int sizePassaro[] = { 10, 15, 10, 16, 17, 1, 2, 3, 4, 5};
    
    
    /**
     * Dados ficaram salvos dentro dessa classe.
     */
    /*public static void main()
    {
        Ave aves[];
        aves = new Ave[10];
        for(int i = 0; i < 10; i++) {

            aves[i] = new Ave(nomesCientificos[i], sizePassaro[i]);

        }
        
        for (int j = 0; j < 10; j++){

            System.out.printf("%s%d%n", aves[j].getName(),aves[j].getSize());

            System.out.printf("%s%n", aves[j].getName());

        }
    }*/
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Ave aves[];
        aves = new Ave[10];
        int number = 1;
        for(int i = 0; i < 10; i++) {
            aves[i] = new Ave(nomesCientificos[i], sizePassaro[i]);
        }
    
        while(number != 0) {
            number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.printf("%s%n", aves[0].getName());
                    break;
                case 2:
                    System.out.printf("%s%n", aves[1].getName());
                    break;
                case 3:
                    System.out.printf("%s%n", aves[2].getName());
                    break;
                case 4:
                    System.out.printf("%s%n", aves[3].getName());
                    break;
                case 5:
                    System.out.printf("%s%n", aves[4].getName());
                    break;
                case 6:
                    System.out.printf("%s%n", aves[5].getName());
                    break;
                case 7:
                    System.out.printf("%s%n", aves[6].getName());
                    break;
                case 8:
                    System.out.printf("%s%n", aves[7].getName());
                    break;
                case 9:
                    System.out.printf("%s%n", aves[8].getName());
                    break;
                case 10:
                    System.out.printf("%s%n", aves[9].getName());
                    break;
                    
            }
        }
    }
}
