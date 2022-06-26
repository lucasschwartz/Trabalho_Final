import java.util.Scanner;

/**  
 * Dados ficaram salvos dentro dessa classe.
 * Aqui ficará o Menu(por enquanto).
 * @Gabriel @Hélio @Lavínia @Lucas @Matheus
 */

public class FontanaApp
{
    public static String nomesCientificos[] = {"Patagioenas picazuro", "Patagioenas maculosa", 
            "Zenaida auriculata", "Columbina picui", "Gubernetes yetapa", "Xolmis cinereus",
            "Griseotyrannus aurantioatrocristatus", "Prognet tapera", "Suiriri suiriri", 
            "Pyrocephalus runinus"};

    public static String sizePassaro[] = {"24", "35", "22", "15", "40", "20", "18", "16", "13", "13"};

    public static String colorPassaro[] = {"Cinza", "Cinza", "Cinza", "Cinza", "Cinza", 
            "Cinza", "Cinza", "Cinza", "Cinza", "Cinza"};

    public static String habitatPassaro[] = {"Diversos", "Campo com arvores", "Diversos",
            "Campo seco alto/campo com arvores", "Campo seco alto/banhado com vegetaçao",
            "Campo seco alto/campo com arvores", "Campo com arvores", "Diversos", "Diversos", 
            "Campo seco baixo/campo com arvores"};

    public static String genderPassaro[] = {"Não observável", "Não observável",
            "Não observável", "Não observável","Não observável", 
            "Não observável", "Não observável","Não observável",
            "Não observável", "Femea"};

    public static String namePhoto[] = {"E. Chiarani", "M.Repenning", "C. Beier", 
            "M.Repenning", "C.B. Andretti", "M. Bettio", "E.Chiarani", "E.Chiarani", 
            "M.Repenning", "E.Chiarani"};
    /**
     * Mostra o menu inicial do programa no terminal
     */
    public static void printMenu() {
        System.out.printf("\f");
        System.out.printf("MENU %n");
        System.out.printf("1 - Acessar Catálogo%n");
        System.out.printf("2 - Pesquisar no Catálogo%n");
        System.out.printf("3 - Criar Anotações%n");
        System.out.printf("4 - Acessar Anotações%n");
        System.out.printf("0 - Sair%n");
    }

    /***
     * Mostra informaçẽos de um catálogo de aves e premite a criação de anotações sobre aves
     * avistadas
     */
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Ave aves[];
        aves = new Ave[10];
        Anotacoes anotacoes[] = new Anotacoes[100];
        int countAnotacoes = 0;
        int number = 1, option = 1, option2 = 0, numbering = 0;

        for(int i = 0; i < 10; i++) {
            aves[i] = new Ave(nomesCientificos[i], sizePassaro[i], colorPassaro[i], 
                habitatPassaro[i], genderPassaro[i], namePhoto[i]);
        }

        String k = "N";
        while (!(k.equals("S"))) {
            printMenu();
            option = sc.nextInt();
            System.out.printf("\f");

            switch(option) {
                case 0:
                    break;
                case 1: 
                    System.out.println("Informe o Pássaro");
                    for(int i = 0; i < 10; i++) {
                        System.out.printf("%d - %s %n",numbering, aves[i].getName());
                        numbering++;
                    }
                    number = sc.nextInt();
                    System.out.printf("\f");
                    System.out.printf("Nome: %s%nTamanho: %s%nCor: %s%nHabitat: %s%nGênero: %s%nFoto: %s  %n", 
                        aves[number].getName(), aves[number].getSize(), 
                        aves[number].getColor(), aves[number].getHabitat(), 
                        aves[number].getGender(), aves[number].getNamephoto());
                    break;

                case 2:
                    System.out.println("Tamo trabalhando nisso");
                    break;

                case 3:
                    System.out.println("Insira a data");
                    String data = sc.next();
                    System.out.println("Insira o horario");
                    String horario = sc.next();
                    System.out.println("Insira o local");
                    String local = sc.next();
                    System.out.println("Insira o passaro");
                    String nome = sc.next();
                    Ave aux = null;
                    for(int i = 0; i < aves.length; i++){
                        if(nome.equalsIgnoreCase(aves[i].getName())){
                            aux = aves[i];
                        }
                    }
                    anotacoes[countAnotacoes] = new Anotacoes(data, horario, local, aux);
                    countAnotacoes++;
                    break;

                case 4:
                    for(int i = 0; i < countAnotacoes; i++) {
                        System.out.println(anotacoes[i].toString());
                    }   
            }
            numbering = 0;
            System.out.println("\nSair? (S / N)");
            k = (sc.next()).toUpperCase();
        }
        sc.close();
        System.out.println("Programa encerrado");
    }
    //Fim do menu
}
