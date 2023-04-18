package master;

public abstract class Funcionario {
    
    private String nome, cpf, endereco, telefone, setor, tipo;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
        this.tipo = tipo;
    }

    public abstract double calcularSalario();

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void calcularAumento(double valor_porcentagem)
    {
        double aumento = calcularSalario() * (valor_porcentagem / 100);
        double novo_salario = calcularSalario() + aumento;
        System.out.printf("\tNovo salário: R$ %.2f \n\n", novo_salario);
    }

    public void descrever()
    {
        System.out.println("\tNome: "+ nome);
        System.out.println("\tCPF: "+ cpf);
        System.out.println("\tEndereço: "+ endereco);
        System.out.println("\tTelefone: "+ telefone);
        System.out.println("\tSetor: "+ setor);
        System.out.println("\tTipo: "+ tipo);
        System.out.printf("\tSalário antigo: R$ %.2f \n", calcularSalario());
    }

}
