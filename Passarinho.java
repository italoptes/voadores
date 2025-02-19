package Interfaces2;

public class Passarinho implements Voador{
    private String tamanho;

    public void beberAgua(){
        System.out.println("Passarinho bebe água.");
    }
    @Override
    public double voar() {
        System.out.println("Passarinho " + tamanho + " voando.");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Passarinho " + tamanho + " planando.");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa Passarinho.");
        return true;
    }
}
