package ActividadPOO;

public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public String hallarCirculo (double radio){
        double area = 3.1415 * (radio * radio);
        double perimetro = 2 * 3.1415 * radio;
        String texto = "El area del circulo es: " + area + " y el perimetro es: " + perimetro;
        return texto;
    }
    

}  

    
    

