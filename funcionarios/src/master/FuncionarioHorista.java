package master;

public class FuncionarioHorista extends Funcionario {

    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, String cpf, String endereco, String telefone, String setor, String tipo, int horasTrabalhadas, double valorHora)
    {
        super(nome, cpf, endereco, telefone, setor, tipo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario()
    {
        return horasTrabalhadas * valorHora;
    }
    
}
