public abstract class Empleado extends Persona {
    
    protected int idEmpleado;

    public Empleado(String nombre, String apellido, String telefono, int dni, int idEmpleado) {
        super(nombre, apellido, telefono, dni); // Llama al constructor de Persona
        this.idEmpleado = idEmpleado;
    }
    
    // Getter y Setter exclusivo de Empleado
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}

// Metodos propios de la clase
