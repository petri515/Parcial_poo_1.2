/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_poo;


import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Parcial_poo {
  
    
    public static void main(String[] args) {
        OUTER:
        while (true) {
            System.out.println("Ingrese el numero segun la operacion que desee realizar \n 1. Registrar nuevo libro \n 2. Registrar nuevo usuario \n 3. buscar por categoria \n 0.Salir del programa ");
            Scanner sc = new Scanner(System.in);
            int ejecutar = sc.nextInt();
            
            switch (ejecutar) {
                case 1 -> {
                    libros libro1 = new libros();
                    
                    System.out.print("El libro se llamara: ");
                    
                    String nombre = sc.next();
                    
                    libro1.setNombreLibro(nombre);
                    
                    System.out.print("El libro es de tipo: \n 1. Drama \n 2.Comedia \n 3. Aventura \n ");
                    
                    int tipo_ = sc.nextInt();
                    
                    String tipo = null;
                    
                    switch(tipo_){
                        case 1 ->{                            
                            tipo = "Drama";                                   
                        }
                        case 2 ->{
                            tipo = "Comedia";
                        }
                        case 3 ->{
                            tipo = "Aventura";
                        }
                    }
                    libro1.setTipoLibro(tipo);
                }
                case 2 -> {
                    Usuario user_1 = new Usuario();
                    System.out.print("El nuevo usuario se llama: ");
                    String name_user = sc.next();
                    user_1.setname(name_user);
                    System.out.print("Con la identificacion: ");
                    String id_user = sc.next();
                    user_1.setId_user(id_user);
                }

                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    break OUTER;
                }
                default -> {
                }
            }
        }
    }   
     

    
    
   
}
