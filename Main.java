
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
    
    /**
     * Dados ficaram salvos dentro dessa classe.
     */
    public static void main()
    {
        Ave c[];
        c = new Ave[10];
        for(int i = 0; i < 10; i++) {
            c[i] = new Ave(nomesCientificos[i], sizePassaro[i]);
        }
        
        for (int j = 0; j < 10; j++){
            System.out.printf("%s%d%n", c[j].getNome(),c[j].getSize());
        }
    }
    
    
}
