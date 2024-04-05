
package ActividadPOO;

import java.time.LocalDate;


public class Main {
    
    public static void main (String[] Args){
        
        System.out.print("Metodo persona: ");
        
        LocalDate fechaNacimientoPersona = LocalDate.of(2005, 11, 9);
        
        Persona Persona = new Persona (fechaNacimientoPersona);
        
        System.out.print(Persona.toString());
        
        System.out.println(" ");
        
        
        System.out.print("Metodo cuadrado: ");
        
        Cuadrado Cuadrado = new Cuadrado(7);
        
        System.out.print(Cuadrado.toString());
        
        
        System.out.println(" ");
        
        
        System.out.print("Metodo circulo: ");
        
        Circulo Circulo = new Circulo(5);
        
        System.out.print(Circulo.toString());
        
        
        System.out.println(" ");
        
        
        System.out.print("Metodo triangulo: ");
        
        Triangulo Triangulo = new Triangulo(6, 15);
        
        System.out.print(Triangulo.toString());
        
        
        
        
    }
}
