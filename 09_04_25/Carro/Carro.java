package Carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para acelerar o carro
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    // Método para frear o carro
    public void frear() {
        System.out.println("O carro está freando.");
    }

    // Método para mostrar as informações do carro
    public void mostrarInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}