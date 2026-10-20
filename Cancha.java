import java.time.LocalDate;
import java.time.LocalTime;
public class Cancha {

    private int numeroCancha;
    private boolean disponible;

    public Cancha(int numeroCancha, boolean disponible){

        this.numeroCancha = numeroCancha;
        
        this.disponible = disponible;

    }

    public int getNumeroCancha(){

        return this.numeroCancha;
    }
    public void cambiarDisponibilidad(){

        if(this.disponible == true){
             this.disponible = false;
        }
        else if (this.disponible == false){
            this.disponible = true;
        }
    }
    public boolean estaDisponible(LocalDate fecha, LocalTime hora){

        if(!this.disponible){
            return false;
        }

        //Aqui tendria que recorrer todos las reservas y verificar que ninguno este ocupada en esa fecha
        // si la franja de -120 min y +120 min esta desocupada entonces la cancha a tal hora está libre
        //
        return true;
    }
}
