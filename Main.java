
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    /**
     * Dados ficaram salvos dentro dessa classe.
     */
    public static void main()
    {
        Ave a1 = new Ave("T-rex");
        Ave a2 = new Ave("Teste");
        Ave a3 = new Ave("Teste2");
        System.out.printf("%s%n",a1.getNome());
        System.out.printf("%s%n",a2.getNome());
        System.out.printf("%s%n",a3.getNome());
    }
}
