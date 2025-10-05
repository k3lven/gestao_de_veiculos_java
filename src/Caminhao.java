public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}