package poo.principiopoo;

public class Carro {
    private void conferirCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void conferirCambio(){
        System.out.println("Conferindo o cambio");
    }

    public void ligar(){
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado");
    }
}
