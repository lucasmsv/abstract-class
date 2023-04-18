package master;

public class FuncionarioAssalariado extends Funcionario {

    private double salario;

    public FuncionarioAssalariado(String nome, String cpf, String endereco, String telefone, String setor, double salario, String tipo)
    {
        super(nome, cpf, endereco, telefone, setor, tipo);
        this.salario = salario;
    }

    @Override
    public double calcularSalario()
    {
        return this.salario;
    }
    
}
