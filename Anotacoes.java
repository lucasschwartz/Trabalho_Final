import java.util.Scanner;

/**
 * Um caderno de anotações com registro de aves avistadas em determinda data hora e local
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
     *  Passa a data de uma determinada anotação
     */
    public String getData(){
        return this.data;
    }
    
    public String getHorario(){
        return this.horario;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public String getAveNome(){
        return passaro.getName();
    }
    
}
