
public class IPhone {
    // Basic properties and methods for an iPhone
    private String modelo;
    private String cor;

    public IPhone() {
        this.modelo = "IPhone";
        this.cor = "Preto";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligarIphone() {
        System.out.println("iPhone está ligando.");
    }

    public void desligarIphone() {
        System.out.println("iPhone está desligando.");
    }
}


