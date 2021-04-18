package definicoes;

// Esse Enum força que, se alguém inserir um novo Cargo, o Java irá forçar que
// exista a nova regra de negócio para esse cargo (ou usar uma já existente).
public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVintePorcento()),
    TESTER(new QuinzeOuVintePorcento());

    private final RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}