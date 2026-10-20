import java.util.ArrayList;

public class GestorReserva {
    private Reserva idReserva;
    
    private ArrayList<Cancha> canchas;

    public GestorReserva(Reserva idReserva){
        this.idReserva = idReserva;

    }
    
    public void agregarCancha(Cancha cancha){
        this.canchas.add(cancha);
    }
    

    public ArrayList<Reserva> verListaReservas(){
        return this.reservas;
    }
    public Reserva getIdReserva(){
        return this.idReserva;
    }


}
