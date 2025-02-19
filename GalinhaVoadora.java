package Interfaces2;

public class GalinhaVoadora implements Voador{
    public void comeMilho(){
        System.out.println("Come milho galinha.");
    }

    @Override
    public double voar() {
        System.out.println("Voa voa Galinha");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana Galinha");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa Galinha");
        return true;
    }
}
