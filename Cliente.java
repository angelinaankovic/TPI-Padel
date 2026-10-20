public class Cliente extends Persona {
    private int inasistencias;
    private GestorReserva gestor;
    public Cliente(String nombre, String apellido, String telefono, int dni, int inasistencias,GestorReserva gestor) {
    
        super(nombre, apellido, telefono, dni); // Llama al constructor de Persona
        this.inasistencias = inasistencias;
        this.gestor = gestor;
    }

    public int getInasistencias(){
        return this.inasistencias;
    }

    public void registrarInasistencia(){
        this.inasistencias++;
    }
    public void consultarReservas(){
        boolean encontroReserva = false;

        for (Reserva reserva : gestor.verListaReservas()) {
            Cliente clienteReserva = reserva.getCliente();
            if (clienteReserva != null && clienteReserva.getDni() == this.getDni()) {
                System.out.println("Reserva: " + reserva.getIdReserva());
                System.out.println("Fecha: " + reserva.getFecha());
                System.out.println("Hora de inicio: " + reserva.getHoraInicio());
                encontroReserva = true;
            }
        }

        if (!encontroReserva) {
            System.out.println("No tenés reservas registradas.");
        }
    }
    public double calcularDeuda(){

    }








}

// Metodos propios de la clase
