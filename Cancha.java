import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Cancha {
    private TipoCancha tipoCancha;
    private int numeroCancha;
    private boolean disponible;

    public Cancha(int numeroCancha, boolean disponible, TipoCancha tipoCancha){

        this.numeroCancha = numeroCancha;
        this.tipoCancha = tipoCancha;
        this.disponible = disponible;

    }
    public TipoCancha getTipoCancha(){
        return this.tipoCancha;
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
    public boolean estaDisponible(LocalDate fecha, LocalTime hora, List<Reserva> reservas){
        if (!this.disponible){
            return false;
        }

        LocalDateTime inicioSolicitado = LocalDateTime.of(fecha, hora);
        LocalDateTime finSolicitado = inicioSolicitado.plusMinutes(120);

        for (Reserva reserva : reservas){
            if (reserva.getCancha() != this){
                continue;
            }

            LocalDateTime inicioReserva = LocalDateTime.of(
                reserva.getFecha(),
                reserva.getHoraInicio()
            );
            LocalDateTime finReserva = inicioReserva.plusMinutes(reserva.getDuracionMinutos());

            if (inicioSolicitado.isBefore(finReserva) && finSolicitado.isAfter(inicioReserva)){
                return false;
            }
        }

        return true;
    }
}
