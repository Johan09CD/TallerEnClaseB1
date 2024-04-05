package ActividadPOO;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    
    private LocalDate fechaNacimientoPersona;

    public Persona() {

    }

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimientoPersona = fechaNacimiento;
    }
        

    public LocalDate getFechaNacimiento() {
        return fechaNacimientoPersona;
    }

    public void setFechaNacimiento(LocalDate fechaNacimientoP) {
        this.fechaNacimientoPersona = fechaNacimientoP;
    }

    public String diasVida () {
        LocalDate fechaActual = LocalDate.now();
        Period vida = Period.between(fechaNacimientoPersona, fechaActual);

        int años = vida.getYears();
        int meses = vida.getMonths();
        int dias = vida.getDays();

        return "Tu tienes " + años + " años, " + meses + " meses y " + dias + " dias de nacido.";
    }

    
    public String toString() {
        return "Persona [Dias de vida = " + diasVida() + "]";
    }
}

