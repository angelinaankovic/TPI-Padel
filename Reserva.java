import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva
{
    
    private int idReserva;
    private int duracionMinutos = 120;
    private LocalDate fecha;
    private LocalTime horaInicio; 
    private LocalTime horaFin;
    private double monto;
    private Cliente cliente;
    private Cancha cancha;
    private int cantJugadores;
    
    
    
    public Reserva()
    {
        
    }

    public Reserva(int idReserva, String fechaTexto, String horaInicioTexto, double monto, Cliente cliente, Cancha cancha, int cantJugadores){
    
        this.idReserva = idReserva;
        this.fecha = java.time.LocalDate.parse(fechaTexto);
        this.horaInicio = java.time.LocalTime.parse(horaInicioTexto);
        this.monto = monto;
        this.cliente = cliente;
        this.cancha = cancha;
        this.cantJugadores = cantJugadores;
        
    }
    

    
    public void modificarPrecio(double precio){
    
    this.monto = precio;
    }
    
    public void modificarFecha(String fechaNueva){
    
    this.fecha = java.time.LocalDate.parse(fechaNueva);
    
    }
    
    public void modificarHoraInicio(String horaInicioNueva){
    
        this.horaInicio = java.time.LocalTime.parse(horaInicioNueva);
    }

    public int getIdReserva(){
        return this.idReserva;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public LocalTime getHoraInicio(){
        return this.horaInicio;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Cancha getCancha(){
        return this.cancha;
    }

    public int getDuracionMinutos(){
        return this.duracionMinutos;
    }
    
    public LocalTime horaFin(){
    
    return horaFin = horaInicio.plusMinutes(duracionMinutos);
    
    }
    public void registarCliente(){
        System.out.println("--------Registro de Cliente---------");
        System.out.println("");
        System.out.println("Nombre: " + this.cliente.getNombre());
        System.out.println("Apellido: " + this.cliente.getApellido());
        System.out.println("Teléfono: " + this.cliente.getTelefono());
        System.out.println("DNI: " + this.cliente.getDni());
    }
    
    
    public void registrarReserva(Pago pagado){
    if (pagado.estadoSeña() == true){
    System.out.println("-----------RESERVA--------------");
    System.out.println("ID de Reserva: " + this.idReserva);
    System.out.println("Cliente: " + this.cliente.getNombre());
    System.out.println("Fecha del partido: " + this.fecha);
    System.out.println("Hora de inicio del partido: " + this.horaInicio);
    System.out.println("Duración del partido: " + duracionMinutos);
    System.out.println("Juegan en la cancha: " + this.cancha.getNumeroCancha());
    System.out.println("Cantidad de Jugadores: " + this.cantJugadores);
    cambiarEstadoCancha();
    }
    else{
        System.out.println("El cliente no confirmo su reserva debido a la falta de pago de la seña");
    }
    }
}
