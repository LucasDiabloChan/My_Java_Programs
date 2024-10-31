package Learning.FATEC_ADS_POO.Polimorfism;

public abstract class Alimento implements IAlimento{
    public String nome;
    public String tempoPreparo;
    public float preco;

    @Override
    public void fazer(){
        throw new NotImplementedMethod();
    }

    @Override
    public void assar(){
        throw new NotImplementedMethod();
    }
    
    @Override
    public void vender(){
        throw new NotImplementedMethod();
    }

}