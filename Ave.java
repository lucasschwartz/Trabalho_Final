public class Ave
{
    String name; // decidir se devemos fazer mais de uma variavel para name
    int size; // Tamanho do passaro
    String color; // Cor predominante do passsaro
    String habitat; // Habitat do passaro 
    String gender; // Genero M ou F
    String namephoto; // name do fotagrafo que tirou a foto

    /**
     * Constructor for objects of class Avianos
     */
    public Ave(String name,int size/*, String color, String habitat, String gender, String namephoto*/)
    {
        this.name = name;
        this.size = size;
        this.color = color;
        this.habitat = habitat;
        this.gender = gender;
        this.namephoto = namephoto; 
    }

    /**
     *  Passa o nomme do Passaro (cientifico)
     */
    public String getName(){
        return this.name;
    }

    /**
     * Passa o tamanho do passaro em centimentros
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Passa a cor predominante do passaro
     */

    public String getColor(){
        return this.color;
    }

    /**
     * Passa o habitat do passaro
     */

    public String getHabitat(){
        return this.habitat;
    }

    /**
     * Passa o genero do passaro
     */
    public String getGender(){
        return this.gender;
    }

    /**
     * Passa o name do fotografo
     */
    
    public String getNamephoto(){
        return this.namephoto;
    }

}
