
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
    public static int sizePassaro[] = { 10, 15,10,16,17,1,2,3,4,5          
    };
    
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
    public static void main()
    {
        Ave aves[];
        aves = new Ave[10];
        for(int i = 0; i < 10; i++) {

            aves[i] = new Ave(nomesCientificos[i], sizePassaro[i],colorPassaro[i],habitatPassaro[i], genderPassaro[i],namePhoto[i]);

        }
        
        for (int j = 0; j < 10; j++){

            System.out.printf("%s  %d  %s  %s  %s  %s %n", aves[j].getName(),aves[j].getSize(), aves[j].getColor(),aves[j].getHabitat(),aves[j].getGender(),aves[j].getNamephoto());

           

        }
    }
    
    
}
