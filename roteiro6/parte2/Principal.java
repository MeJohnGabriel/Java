package roteiro6.parte2;

public class Principal {
    public static void main(String[] args) {
        Tempo horaInicio = new Tempo(10, 15, 2);
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", horaInicio);

        System.out.println("Número de Origem: " + lig01.getNumOrigem());
        System.out.println("Número de Destino: " + lig01.getNumDestino());
        System.out.println("Local de Origem: " + lig01.getLocalOrigem());
        System.out.println("Local de Destino: " + lig01.getLocalDestino());
        System.out.println("Hora de Início: " + lig01.getHoraInicio().formatarTempo());

        Tempo horaFim = new Tempo(10, 20, 35);
        lig01.setHoraFim(horaFim);
        System.out.println("Hora de Fim: " + lig01.getHoraFim().formatarTempo());
    }
}
