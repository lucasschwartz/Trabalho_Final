import java.util.Scanner;

/**
 * Um caderno de anotações com registro de aves avistadas em determinda data hora e local
 * O usuário poderá registrar e acessar informações disponíveis nessa classe.
 */
public class Anotacoes
{
    public String data;
    public String horario;
    public String local;
    public String passaro;
    
    /**
     *  Contrutor de objetos da classe anotação
     */
    public Anotacoes(String data, String horario, String local, String passaro)
    {
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.passaro = passaro;
    }
    
    /**
     *  Passa a data de uma determinada anotação
     */
    public String getData(){
        return this.data;
    }
    /**
     * Passa o horario de uma determinada anotação
     */
    public String getHorario(){
        return this.horario;
    }
    /**
     * Passa o Local de uma determinada anotação
     */
    public String getLocal(){
        return this.local;
    }
    /**
     * Passa o nome de um passaro na anotação.
     */
    public String getName(){
        return this.passaro;
    }
    
}
