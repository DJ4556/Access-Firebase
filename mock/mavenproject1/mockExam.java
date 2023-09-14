package mock.mavenproject1;

import java.util.Scanner;

public class mockExam {
    
    /*Definir las variable a usar*/
    static Scanner opt = new Scanner(System.in);
    static Scanner quan = new Scanner(System.in);
    static Scanner save = new Scanner(System.in);
    static int numb1;  
    static int numb2;
    static int numb3;
    static int numb4;
    static int fact;

    public static void main(String[] args) {
        
        showMenu();
        
    }
    
    private static void showMenu(){
        
        /*Mostrar en la consola las opciones y sus precios*/
        System.out.println("¿Qué quiere elegir del menú?");
        
        System.out.println("Eliga cualquiera de las opciones que aparezca en pantalla (1, 2, 3)");
        System.out.println("1. Arroz con pollo ($18.500)");
        System.out.println("2. Pasta a la marinera ($25.000)");
        System.out.println("3. Sopa  de costilla (14.000)");
        System.out.println("4. Jugo natural ($4.000)");
        
        String elt = String.valueOf(opt.nextInt());  
        
        /*Elección de platos del menú*/
        if(elt.equals("1")){
            
            System.out.println("Eligió arroz con pollo. ¿Cuántos platos quiere?");
            
            numb1 = quan.nextInt();
            
            System.out.println("¿Quiere agregar algo más al pedido? Sí = 1, No = 2");
            
            String rep = String.valueOf(save.nextInt());
            
                if(rep.equals("1")){
                    
                    showMenu();
                    
                }
                else if(rep.equals("2")){
            
                    System.out.println("Terminó su pedido");
                    
                }
        }else if(elt.equals("2")){
            
            System.out.println("Eligió pasta a la marinera. ¿Cuántos platos quiere?");
            
            numb2 = quan.nextInt();
            
            System.out.println("¿Quiere agregar algo más al pedido? Sí = 1, No = 2");
            
            String rep = String.valueOf(save.nextInt());
            
                if(rep.equals("1")){
                    
                    showMenu();
                    
                }
                else if(rep.equals("2")){
            
                    System.out.println("Terminó su pedido");
                    
                }
        }else if(elt.equals("3")){
            
            System.out.println("Eligió sopa de costilla. ¿Cuántos platos quiere?");
            
            numb3 = quan.nextInt();
            
            System.out.println("¿Quiere agregar algo más al pedido? Sí = 1, No = 2");
            
            String rep = String.valueOf(save.nextInt());
            
                if(rep.equals("1")){
                    
                    showMenu();
                    
                }
                else if(rep.equals("2")){
            
                    System.out.println("Terminó su pedido");
                    
                }
        }else if(elt.equals("4")){
            
            System.out.println("Eligió jugo natural. ¿Cuántos vasos quiere?");
            
            numb4 = quan.nextInt();
            
            System.out.println("¿Quiere agregar algo más al pedido? Sí = 1, No = 2");
            
            String rep = String.valueOf(save.nextInt());
            
                if(rep.equals("1")){
                    
                    showMenu();
                    
                }
                else if(rep.equals("2")){
            
                    System.out.println("Terminó su pedido");
                    
                }
        }
        
        Report();
        
    }
    
    private static void Report(){
        
        /*Conteo de platos de la factura*/
        if(numb1 != 0 && numb2 != 0 && numb3 != 0 && numb4 != 0){
            System.out.println("Pidió:");
            System.out.println(numb1 + " platos de arroz con pollo, ");
            System.out.println(numb2 + " platos de pasta a la marinera, ");
            System.out.println(numb3 + " platos de sopa de costilla, ");
            System.out.println(numb4 + " vasos de jugo natural.");
        }
        
        fact = numb1*18500 + numb2*25000 + numb3*14000 + numb4*4000;
        
        /*Mostrar en la consola la factura total*/
        System.out.println("La factura total es de $"+ fact);
        
    }
}