/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresioneslambda;

import java.util.*;


/**
 *
 * @author Rafae
 */
public class ExpresionesLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TreeSet <Integer> prueba=new TreeSet<>(new Comparator <Integer>(){ //FUNCION LAMBDA SUPER GUAY, SOLO LA USAMOS UNA VEZ Y LA DEFINIMOS AHI
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
      
      prueba.add(5);
        prueba.add(2);
        prueba.add(55);
        prueba.add(8);
        
        System.out.println("Prueba 1: "+prueba);
        
        TreeSet <Integer> prueba2=new TreeSet<>((Integer o1, Integer o2) -> o2-o1 );//DESPUES DE DEFINIRLA LA SIMPLFICAMOS DE ESTA MANERA SE HACE AUTOATICO
  
        prueba2.add(5);
        prueba2.add(2);
        prueba2.add(55);
        prueba2.add(8);
        
        System.out.println("Prueba2: "+prueba2);
    
    }
    
}
