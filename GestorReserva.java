import java.util.ArrayList;

public class GestorReserva {
    private Reserva idReserva;
    private ArrayList<Reserva> reservas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Cancha> canchas;

    public GestorReserva(Reserva idReserva){
        this.idReserva = idReserva;
        this.reservas = new ArrayList<>();
    }
    public void agregarCliente(Cliente c){
        this.clientes.add(c);
    }
    public void agregarCancha(Cancha cancha){
        this.canchas.add(cancha);
    }
    public void agregarReserva(Reserva r){
        this.reservas.add(r);
    }

    public ArrayList<Reserva> verListaReservas(){
        return this.reservas;
    }
    public Reserva getIdReserva(){
        return this.idReserva;
    }


}
