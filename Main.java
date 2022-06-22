
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
    public static void main()
    {
        Ave aves[];
        aves = new Ave[10];
        for(int i = 0; i < 10; i++) {
            aves[i] = new Ave(nomesCientificos[i]);
        }
        
        for (int j = 0; j < 10; j++){
            System.out.printf("%s%n", aves[j].getNome());
        }
    }
}
