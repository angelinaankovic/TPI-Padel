public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected int dni;

    public Persona(String nombre, String apellido, String telefono, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }
    
//GETTERS COMUNES
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getDni() {
        return dni;
    }
    
//SETTERS COMUNES
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    //Actualizar datos
    public void actualizarDatos(){
        
    }
}
