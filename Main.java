import java.util.Scanner;
    /**
     * Aqui foi onde tudo começou...
     *
     * @Gabriel @Hélio @Lavínia @Lucas @Matheus
     */
public class Main
{
        public static String nomesCientificos[] = {"Patagioenas picazuro", "Patagioenas maculosa", "Zenaida auriculata", 
                "Columbina picui", "Gubernetes yetapa", "Xolmis cinereus",
                "Griseotyrannus aurantioatrocristatus", "Prognet tapera", "Suiriri suiriri", 
                "Pyrocephalus runinus"};
    
     
        public static int sizePassaro[] = {10, 15, 10, 16, 17, 1, 2, 3, 4, 5};
    
        public static String colorPassaro[] = {"azuro", "Pata", "Zenaa", 
                "Ci", "Guberpa", "Xolmeus",
                "Griistatus", "Prra", "Siri", 
                "Pus"};
    
        public static String habitatPassaro[] = {"Pro", "Pataga", "Zta", 
                "Cicui", "Gupa", "Xeus",
                "Gatus", "Pra", "Sui si", 
                " rus"};
    
        public static String genderPassaro[] = {"M", "a", "ta", 
                "Ci", "pa", "Xus",
                "Gs", "Pa", "Si i", 
                " rs"};
    
        public static String namePhoto[] = {"Pro", "Pataga", "Zta", 
                "Cicui", "Gupa", "Xeus",
                "Gatus", "Pra", "Sui si", 
                " rus"};
        /**
         * Dados ficaram salvos dentro dessa classe.
         * Aqui ficará o Menu(por enquanto).
         */

        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            Ave aves[];
            aves = new Ave[10];
            Anotacoes anotacoes[] = new Anotacoes[100];
            int countAnotacoes = 0;
            int number = 1, option = 1, numbering = 0;
            
            for(int i = 0; i < 10; i++) {
                aves[i] = new Ave(nomesCientificos[i], sizePassaro[i]);
            }
            
            // FAZER UM WHILE A PARTIR DAQUI PRO PROGRAMA CONTINUAR RODANDO ATÉ A CONDIÇÃO 0!!!
            
            // Inicio do menu
            System.out.printf("\f");
            System.out.printf("MENU %n");
            System.out.printf("1 - Acessar Catálogo%n");
            System.out.printf("2 - Pesquisar no Catálogo%n");
            System.out.printf("3 - Criar Anotações%n");
            System.out.printf("4 - Acessar Anotações%n");
            System.out.printf("0 - Sair%n");
            option = sc.nextInt();
            System.out.printf("\f");
                        
        
            switch(option) {
                case 1: 
                    System.out.println("Informe o Pássaro");
                    for(int i = 0; i < 10; i++) {
                        System.out.printf("%d - %s %n",numbering, aves[i].getName());
                        numbering++;
                    }
                    number = sc.nextInt();
                    System.out.printf("Nome: %s%nTamanho: %s%nCor: %s%n Habitat: %s%nGênero: %s%n Foto: %s  %n", aves[number].getName(), aves[number].getSize(), aves[number].getColor(), aves[number].getHabitat(), aves[number].getGender(), aves[number].getNamephoto());
                
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
                        if(nome.equalsIgnoreCase(aves[i].getName()))
                            aux = aves[i];
                    }
                    anotacoes[countAnotacoes] = new Anotacoes(data, horario, local, aux);
                    countAnotacoes++;
                    break;
                case 4:
                    for(int i = 0; i < countAnotacoes; i++) {
                        System.out.println(anotacoes[i].toString());
                    }
                    
                    break;
                }
            //Fim do menu
    }
}