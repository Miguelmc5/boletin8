package boletin8_2;
import java.util.*;
/**
 *
 * @author mmartinezcosta
 */
public class Compra {
  
    Scanner sc=new Scanner (System.in);
    
    private int prezo;
    private int unidades;
    private int cantidade;
    
    // constructor con parámetros
    public void Descuentos (){
        System.out.println("Dime la cantidad de productos:");
    unidades=sc.nextInt();
      System.out.println("Dime el precio:");
    prezo=sc.nextInt();
    
    cantidade=prezo*unidades;
   
    if (unidades<100){
            System.out.println("El precio a pagar es de: "+cantidade);
    }
   else
    if( unidades<200){
        if (prezo>4000){
            cantidade=cantidade-((cantidade*5)/100);
        System.out.println("El precio a pagar es de: "+cantidade);
        }
        else
        cantidade=cantidade-((cantidade*2)/100);
    System.out.println("El precio a pagar es de: "+cantidade);
    }
    else
    if (unidades>=200){
            if (prezo>4000){
                cantidade=cantidade-((cantidade*10)/100);
            System.out.println("El precio a pagar es de: "+cantidade);
        }
        else
            cantidade=cantidade-((cantidade*8)/100);
        System.out.println("El precio a pagar es de: "+cantidade);
    }
    else
       cantidade=cantidade-((cantidade*8)/100);
        System.out.println("El precio a pagar es de: "+cantidade);
    
    }
    
}