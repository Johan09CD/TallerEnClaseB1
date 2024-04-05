package ActividadPOO;

public class Cuadrado {
    private int lado;
    private double area; 

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + ", area=" + area + '}';
    }
    
    public String hallarCuadrado (int lado){
        int area = lado + lado + lado + lado;
        int perimetro = lado * lado;
        String texto = "El area del cuadrado es: " + area + " y el perimetro es: " + perimetro;
        return texto;   
    }
}

 

    

