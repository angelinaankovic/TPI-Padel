import java.time.LocalDate;
public class Pago {
    private int idPago;
    private Reserva idReserva;
    private double monto;
    private TipoPago tipoPago;
    private MedioPago medioPago;
    private LocalDate fechaPago;
    private EstadoPago estadoPago;

    public Pago(int idPago, Reserva idReserva, double monto, TipoPago tipoPago, MedioPago medioPago, LocalDate fechaPago,EstadoPago estadoPago){

        this.idPago = idPago;
        this.idReserva = idReserva;
        this.monto = monto;
        this.tipoPago = tipoPago;
        this.medioPago = medioPago;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;

    }

    public void reembolsar(){
        this.estadoPago = EstadoPago.REEMBOLSADO;
    }

    public void retener(){
        this.estadoPago = EstadoPago.RETENIDO;
    }

    public void modificarMedioPago(MedioPago nuevoPago){
        this.medioPago = nuevoPago;
    }
    public int getIdPago(){
        return this.idPago;
    }

    public Reserva getIdReserva() {
        return this.idReserva;
    }

    public double getMonto() {
        return this.monto;
    }

    public TipoPago getTipoPago() {
        return this.tipoPago;
    }

    public MedioPago getMedioPago() {
        return this.medioPago;
    }

    public LocalDate getFechaPago() {
        return this.fechaPago;
    }

    public EstadoPago getEstadoPago() {
        return this.estadoPago;
    }
}
