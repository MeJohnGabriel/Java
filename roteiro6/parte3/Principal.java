package roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Tempo inicio = new Tempo(10, 0, 0);
        Tempo fim = new Tempo(10, 5, 35);

        
        Ligacao lig = new Ligacao("111111", "222222", "Cidade A", "Cidade B", inicio);
        lig.setHoraFim(fim);


        System.out.println("Número de Origem: " + lig.getNumOrigem());
        System.out.println("Número de Destino: " + lig.getNumDestino());
        System.out.println("Início: " + lig.getHoraInicio().formatarTempo());
        System.out.println("Fim: " + lig.getHoraFim().formatarTempo());

        System.out.println("Faz parte da ligação (111111)? " + lig.verificaNumero("111111"));
        System.out.println("Faz parte da ligação (999999)? " + lig.verificaNumero("999999"));

        System.out.println("Valor (sem arredondamento): R$ " + lig.calcularValorSimples());
        System.out.println("Valor (com arredondamento): R$ " + lig.calcularValorComArredondamento());
    }
}
