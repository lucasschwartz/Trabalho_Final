import java.util.Scanner;
/**
 * Anotações pedidas no trabalho. 
 * O usuário poderá registrar e acessar informações disponíveis nessa classe.
 *
 * @author (Lavínia)
 * @version (22/06/2022)
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
    
    public String toString(){
        return data + " "+ horario +" "+ local +" "+ passaro.getName()+" "+ passaro.getSize()+" "+ passaro.getColor()+" "+ passaro.getHabitat()+" "+ passaro.getGender()+" "+ passaro.getNamephoto();
    }
    
}
