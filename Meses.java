package boletin8_3;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Meses {
       
    public void DiaMes(int num) {

        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:    
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 31");
                break;
            
            case 2:
                System.out.println("Tiene 28");
                break;   
            
            case 4:    
            case 6:
            case 9:
            case 11:
                System.out.println("Tiene 30");
                break;
            
            default:
                System.out.println("No es un mes");   
                    
        }

    }

}
