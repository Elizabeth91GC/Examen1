/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Elizabeth
 */
public class Main {
    public static void main(String[] args) {
        
        //Creación de la cola
        Cola c = new Cola(5);
        
        //Pruebas de la cola
        c.agregar(1);
        c.agregar(2);
        c.agregar(3);
        c.agregar(4);
                
        System.out.println(c);
        //Pruebas para sacar elementos de la cola
        System.out.println("sacando numero: "+c.obtener());
        System.out.println("sacando numero: "+c.obtener());
        System.out.println("sacando numero: "+c.obtener());
        System.out.println("sacando numero: "+c.obtener());
        System.out.println("Cola: "+c);
        
        c.agregar(100);
        c.agregar(200);
        System.out.println("Cola: "+c);
        System.out.println("sacando numero: "+c.obtener());
        c.agregar(500);
        c.agregar(1000);
        c.agregar(1500);
       
        System.out.println("sacando numero: "+c.obtener());
        System.out.println(c);
        
        System.out.println("Cabeza: "+c.cabeza());//Muestra el primer elemento de la cola
        System.out.println("Ultimo: "+c.ultimo());//Muestra el ultimo elemento de la cola
        
    }
}
