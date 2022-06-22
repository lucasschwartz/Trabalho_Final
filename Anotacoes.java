import java.util.Scanner;
/**
 * Write a description of class Anotacoes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anotacoes
{
    public String data;
    public String horario;
    public String local;
    public Ave passaro;
    
    /**
     *  Contrutor de objetos da classe anotação
     */
    public Anotacoes(String data, String horario, String local, Ave passaro)
    {
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.passaro = passaro;
    }
    
    /**
     *  Passa a dada de uma determinada anotação
     */
    public String getData(){
        return this.data;
    }
    
}
