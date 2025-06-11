package roteiro6.parte1;

public class Principal {
    public static void main(String[] args) {
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", "10:15:02");

        System.out.println("Número de Origem: " + lig01.getNumOrigem());
        System.out.println("Número de Destino: " + lig01.getNumDestino());
        System.out.println("Local de Origem: " + lig01.getLocalOrigem());
        System.out.println("Local de Destino: " + lig01.getLocalDestino());
        System.out.println("Hora de Início: " + lig01.getHoraInicio());
        System.out.println("Hora de Fim: " + lig01.getHoraFim());
    }
}
