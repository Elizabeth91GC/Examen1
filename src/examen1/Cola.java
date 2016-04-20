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
public class Cola {
    
    //ATRIBUTOS
    private int tamanio;
    private Integer [] elementos;
    private int indice;

    //Creación de la cola
    public Cola(int tamanio) {
        this.tamanio = tamanio;
        elementos = new Integer[tamanio];
        indice = 0;
    }
    
    //Agregaron elementos a la cola
    public void agregar(int elemento){
        if(elementos[indice+1]==null){
            elementos[indice] = elemento;
            indice++;    
        }else{
            System.out.println("Ya no hay espacio en la cola");
        }
        System.out.println("Indice: "+indice);
    }
    
    //Obtienes el primer elemento de la cola
    public Integer obtener(){
        int numero = elementos[0];
        for(int i = 0; i<indice; i++){
            if(elementos[i+1]!=null){
                elementos[i] = elementos[i+1];
                elementos[i+1] = null;
                //System.out.println(this);
            }else{
                elementos[i] = null;
                indice--;
                break;
            }  
        }
        System.out.println("Inidce "+indice);
        return numero;  
    }

    //Impresión de la cola
    @Override
    public String toString() { //Represente la impresión de la colas
        String str  = "[";
        for (Integer elemento : elementos) {
            str += elemento + " ";
        }
        str+= "]";
        return str;
    }
    
    //Quién es el primer elemento de la cola
    public Integer cabeza(){
        if(elementos[0]!=null){
            return elementos[0];
        }else{
            System.out.println("No hay elementos en la cola");
            return null;
        }
    }
    //Quién es el último elemento de la cola
    public Integer ultimo(){
        //System.out.println("indice: " +indice);
        if(elementos[indice-1]!=null){
            return elementos[indice-1];
        }else{
            System.out.println("No hay elementos en la cola");
            return null;
        }
    }
    
}
