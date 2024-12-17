import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private Scanner sc = null;

    public static void main(String[] args){
        List<Funcionario> listaFuncionarios;
        int qtdFuncionarios = 0;

        System.out.println("Digite a quantidade de funcionários a serem cadastrados: ");
        qtdFuncionarios = sc.nextInt();
        
        listaFuncionarios = coletarDadosFuncionarios(qtdFuncionarios);
        listarDadosFuncionarios(listaFuncionarios);
    }

    public static List<Funcionario> coletarDadosFuncionarios(int qtdFuncionarios){
        List<Funcionario> listaFuncionarios = null;
        sc = new Scanner(System.in);

        for(int i = 1; i <= qtdFuncionarios; i++){
            int idFunc = 0;
            String nomeFunc = null;
            double salarioFunc = 0.0;

            System.out.println("# "+ i +"º Funcionário(a) ");
            System.out.println("Id: ");
            idFunc = sc.nextInt();

            System.out.println("Nome: ");
            nomeFunc = sc.nextString();

            System.out.println("Salário: ");
            salarioFunc = sc.nextDouble();

            listaFuncionarios.add(new Funcionario(idFunc, nomeFunc, salarioFunc));
        }

        return listaFuncionarios;
    }
}