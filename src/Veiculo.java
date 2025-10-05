public class Veiculo {
    protected String placa;
    protected String marca;
    protected double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
    }

    // Sobrecarga: mostra o preço com desconto
    public void mostrarDados(double desconto) {
        double precoFinal = preco - (preco * desconto / 100);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preço com desconto de " + desconto + "%: R$" + precoFinal);
    }
}
