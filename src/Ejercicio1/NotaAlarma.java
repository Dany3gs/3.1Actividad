package Ejercicio1;

public class NotaAlarma extends Nota{
    private String horaAlarma;

    public NotaAlarma(int nota, String texto, String horaAlarma) {
        super(nota, texto);
        this.horaAlarma = horaAlarma;
    }

    public String getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(String horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota=" + getNota() +
                ", texto='" + getTexto() + '\'' +
                "NotaAlarma{" +
                "horaAlarma='" + horaAlarma + '\'' +
                '}';
    }
}
