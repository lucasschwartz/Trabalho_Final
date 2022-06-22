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
    
    
    public static String colorPassaro[] = {"azuro", "Pata", "Zenaa", 
           "Ci", "Guberpa", "Xolmeus",
           "Griistatus", "Prra", "Siri", 
           "Pus"};
    
    public static String habitatPassaro[] = {"Pro", "Pataga", "Zta", 
           "Cicui", "Gupa", "Xeus",
           "Gatus", "Pra", "Sui si", 
           " rus"};
    
    public static String genderPassaro[] = {"M", "a", "ta", 
           "Ci", "pa", "Xus",
           "Gs", "Pa", "Si i", 
           " rs"};
           
           public static String namePhoto[] = {"Pro", "Pataga", "Zta", 
           "Cicui", "Gupa", "Xeus",
           "Gatus", "Pra", "Sui si", 
           " rus"};
    /**
     * Dados ficaram salvos dentro dessa classe.
     */
    /*public static void main()
    {
        Ave aves[];
        aves = new Ave[10];
        for(int i = 0; i < 10; i++) {

            aves[i] = new Ave(nomesCientificos[i], sizePassaro[i],colorPassaro[i],habitatPassaro[i], genderPassaro[i],namePhoto[i]);

        }
        
        for (int j = 0; j < 10; j++){

            System.out.printf("%s  %d  %s  %s  %s  %s %n", aves[j].getName(),aves[j].getSize(), aves[j].getColor(),aves[j].getHabitat(),aves[j].getGender(),aves[j].getNamephoto());

           

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
                    System.out.printf("%s  %s   %n", aves[0].getName(),aves[0].getSize());
                    break;
                case 2:
                    System.out.printf("%s  %s   %n", aves[1].getName(),aves[1].getSize());
                    break;
                case 3:
                    System.out.printf("%s  %s   %n", aves[2].getName(),aves[2].getSize());
                    break;
                case 4:
                    System.out.printf("%s  %s   %n", aves[3].getName(),aves[3].getSize());
                    break;
                case 5:
                    System.out.printf("%s  %s   %n", aves[4].getName(),aves[4].getSize());
                    break;
                case 6:
                    System.out.printf("%s  %s   %n", aves[5].getName(),aves[5].getSize());
                    break;
                case 7:
                    System.out.printf("%s  %s   %n", aves[6].getName(),aves[6].getSize());
                    break;
                case 8:
                    System.out.printf("%s  %s   %n", aves[7].getName(),aves[7].getSize());
                    break;
                case 9:
                    System.out.printf("%s  %s   %n", aves[8].getName(),aves[8].getSize());
                    break;
                case 10:
                    System.out.printf("%s  %s   %n", aves[9].getName(),aves[9].getSize());
                    break;
                    
            }
        }
    }
}
