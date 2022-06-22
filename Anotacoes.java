import java.util.Scanner;
/**
 * Write a description of class Anotacoes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anotacoes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Anotacoes
     */
    public Anotacoes()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     *  Lugar para definir a data
     */
    public void Data(String[] args)
    {
        int dia, mes, ano;
        Scanner teclado = new Scanner(System.in);
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        teclado.close();
        
        System.out.printf("%d,/ %d,/ %d,/ %n", dia, mes, ano);
    }
    
    public void Hora(String[] args) {
        int hora, min;
        Scanner teclado = new Scanner(System.in);
        hora = teclado.nextInt();
        min = teclado. nextInt();
        teclado.close();
        
        System.out.printf("%d, : %d, %n", hora, min);
    }
}
