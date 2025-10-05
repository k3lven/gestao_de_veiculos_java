public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}
