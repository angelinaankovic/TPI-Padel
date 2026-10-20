import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Empleado extends Persona {
    private GestorReserva gestor;
    private int idEmpleado;
    private RolEmpleado rol;

    public Empleado(String nombre, String apellido, String telefono, int dni, int idEmpleado,RolEmpleado rol) {
        super(nombre, apellido, telefono, dni); // Llama al constructor de Persona
        this.idEmpleado = idEmpleado;
        this.rol = rol;
    }
    
    // Getter y Setter exclusivo de Empleado
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public RolEmpleado getRol(){
        return this.rol;
    }

    //Metodos de empleado en duda:
    
    // RF01 - Registrar un nuevo cliente en el sistema
    public void registrarCliente(GestorReserva gestor, String nombre, String apellido, String telefono, int dni) {[cite: 11, 12]
        gestor.agregarCliente(new Cliente(nombre, apellido, telefono, dni));
    }

    // RF03 - Registrar la reserva solicitada por un cliente
    public void registrarReserva(GestorReserva gestor, Cliente cliente, Cancha cancha, LocalDate fecha, LocalTime hora) {[cite: 11, 12]
        gestor.crearReserva(this, cliente, cancha, fecha, hora);
    }

    // RF04 - Registrar el pago de la seña (50%) para confirmar la reserva
    public void confirmarReserva(GestorReserva gestor, Reserva reserva, double monto, String medioPago) {
        gestor.confirmarReserva(reserva, monto, medioPago);
    }

    // RF05 - Cancelar la reserva aplicando las reglas de 24 horas
    public void cancelarReserva(GestorReserva gestor, Reserva reserva){
        gestor.cancelarReserva(reserva);
    }

    // RF07 - Registrar si el cliente asistió o no al turno
    public void registrarAsistencia(GestorReserva gestor, Reserva reserva, boolean asistio){ 
        gestor.registrarAsistencia(reserva, asistio);
    }
}


