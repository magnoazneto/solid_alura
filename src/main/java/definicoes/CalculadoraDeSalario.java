package definicoes;

// na refatoração essa classe chega a ser inútil
public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
       // return funcionario.getCargo().getRegra().calcula(funcionario);
        return funcionario.calculaSalario();
    }

}