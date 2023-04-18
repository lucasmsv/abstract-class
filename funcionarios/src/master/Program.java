package master;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Funcionario> funcionario = new ArrayList<>();

        String nomeFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, setorFuncionario, tipoFuncionario;
        double salario, valorHora, valorPorcentagem;
        int horasTrabalhadas;

        System.out.print("Quantidade de funcionários: ");
        int qtdFuncionarios = Integer.parseInt(in.nextLine());

        System.out.println();
        for (int i = 0; i < qtdFuncionarios; i++)
        {
            System.out.print("Nome: ");
            nomeFuncionario = in.nextLine();
            System.out.print("CPF: ");
            cpfFuncionario = in.nextLine();
            System.out.print("Endereço: ");
            enderecoFuncionario = in.nextLine();
            System.out.print("Telefone: ");
            telefoneFuncionario = in.nextLine();
            System.out.print("Setor: ");
            setorFuncionario = in.nextLine();
            System.out.print("[1] Assalariado - [2] Horista: ");
            tipoFuncionario = in.nextLine();

            switch (tipoFuncionario)
            {
                case "1":
                    System.out.print("Salário: R$ ");
                    salario = Double.parseDouble(in.nextLine());
                    Funcionario funcionario_assalariado = new FuncionarioAssalariado(nomeFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, setorFuncionario, salario, tipoFuncionario);
                    funcionario.add(funcionario_assalariado);
                    funcionario.get(i).setTipo("Assalariado");
                break;

                case "2":
                    System.out.print("Horas trabalhadas: ");
                    horasTrabalhadas = in.nextInt();
                    System.out.print("Valor hora: ");
                    valorHora = in.nextDouble(); in.nextLine();
                    Funcionario funcionario_horista = new FuncionarioHorista(nomeFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, setorFuncionario, tipoFuncionario, horasTrabalhadas, valorHora);
                    funcionario.add(funcionario_horista);
                    funcionario.get(i).setTipo("Horista");
                break;
            }
            System.out.println();
        }

        System.out.print("Valor para aumento (%): ");
        valorPorcentagem = in.nextDouble();
        System.out.println();

        System.out.println("[Funcionários]");
        for (Funcionario func : funcionario) 
        {
            func.descrever();
            func.calcularAumento(valorPorcentagem);
        }

        in.close();

    }

}
