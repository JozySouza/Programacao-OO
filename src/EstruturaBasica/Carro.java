package EstruturaBasica;
//classe carro criada para o exercicio 1 da aula02
public class Carro {

    String cor, modelo;
    int capacidadeTanque;

//contrutores

     Carro() {

    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


//setters

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }


//geters


    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
