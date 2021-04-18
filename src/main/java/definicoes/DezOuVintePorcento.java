package definicoes;

public class DezOuVintePorcento implements RegraDeCalculo {

    // Classe coesa, só trata de 1 regra.
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }


}
