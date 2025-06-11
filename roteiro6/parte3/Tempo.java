package roteiro6.parte3;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String formatarTempo() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public int emSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public int diferencaEmSegundos(Tempo outro) {
        return outro.emSegundos() - this.emSegundos();
    }
}
