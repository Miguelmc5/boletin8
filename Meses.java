package boletin8_3;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Meses {
      Scanner teclado = new Scanner(System.in);
    private int mes;
    private int dias;

    public Meses() {
    }

    public Meses(int mes, int dias) {
        this.mes = mes;
        this.dias = dias;
    }

    public int getMes() {
        return mes;
    }

    public int getDias() {
        return dias;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public void datos(){
        System.out.println("Escribe o número do mes:");
        mes = teclado.nextInt();
        
    }
    
    public String diasMes(){
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        }
        else{
            dias = 30;
        }
        return ("O mes "+mes+" ten "+dias+" dias");
    }
}