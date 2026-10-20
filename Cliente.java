public class Cliente extends Persona {
    private int inasistencias;

    public Cliente(String nombre, String apellido, String telefono, int dni, int inasistencias) {
    
        super(nombre, apellido, telefono, dni); // Llama al constructor de Persona
        this.inasistencias = inasistencias;
    }

    public int getInasistencias(){
        return this.inasistencias;
    }

    public void registrarInasistencia(){

    }
    public Reserva consultarReservas(){
        
    }
    public double calcularDeuda(){

    }








}

// Metodos propios de la clase
