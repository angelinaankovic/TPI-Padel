public enum TipoCancha {
    
    PARED(35000.0),    // Precio base para canchas de pared
    BLINDEX(45000.0);  // Precio base para canchas de blindex (más caras)
    
    private double precioBase;
    
    // Constructor del Enum
    TipoCancha(double precioBase) {
        this.precioBase = precioBase;
    }
    
    // Getter para obtener el precio
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double nuevoPrecio){
        this.precioBase = nuevoPrecio;
    }
}
