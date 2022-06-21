public class Ave
{
    String nome; // decidir se devemos fazer mais de uma variavel para nome
    int size; // Tamanho do passaro
    String color; // Cor predominante do passsaro
    String habitat; // Habitat do passaro 
    String gender; // Genero M ou F
    String namephoto; // Nome do fotagrafo que tirou a foto

    /**
     * Constructor for objects of class Avianos
     */
    public Ave(String nome)
    {
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;
    }

    /**
     * Campo para definir o tamanho do passaro 
     */
    public void AveSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    /**
     * Campo para definir a cor predominante do passaro
     */
    public void AveColor(String color)
    {
        this.color = color;

    }

    public String getColor(){
        return this.color;
    }

    /**
     * Campo para definir o habitat do passaro
     */
    public void AveHabitat(String habitat)
    {
        this.habitat = habitat;

    }

    public String getHabitat(){
        return this.habitat;
    }

    /**
     * Campo para definir o genero do passaro
     */
    public void AveGender(String gender)
    {
        this.gender = gender;

    }

    public String getGender(){
        return this.gender;
    }

    /**
     * Campo para definir o nome do fotografo
     */
    public void AveNamephoto(String namephoto)
    {
        this.namephoto = namephoto;

    }

    public String getNamephoto(){
        return this.namephoto;
    }

}
