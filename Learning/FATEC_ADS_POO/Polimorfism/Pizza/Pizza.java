package Learning.FATEC_ADS_POO.Polimorfism.Pizza;

public class Pizza extends Alimento{

    public Pizza(String nome, String tempoPreparo, float valor){
        this.super(nome, tempoPreparo, valor);
    }

    @Override
    public void fazer(){
        System.out.println("Preparando a pizza...");
        System.out.println("Pizza preparada!");
    }

    @Override
    public void assar(){
        System.out.println("Assando a pizza...");
        System.out.println("Pizza assada!");
    }

    @Override
    public void vender(){
        System.out.println("Pizza vendida!");
    }
}