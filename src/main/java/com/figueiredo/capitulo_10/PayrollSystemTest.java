package com.figueiredo.capitulo_10;



public class PayrollSystemTest {
 public static void main(String[] args) 
 {
 // cria objetos de subclasse 
 FuncionarioSalario  funcionarioSalario =  new  FuncionarioSalario("John", "Smith", "111-11-1111", 800.00); 
 FuncionarioPorHora funcionarioPorHora = new FuncionarioPorHora("Karen", "Price", "222-22-2222", 16.75, 40);
 FuncionarioComissao funcionarioComissao = new FuncionarioComissao(  "Sue", "Jones", "333-33-3333", 10000, .06); 
 FuncionarioComissaoExtra funcionarioComissaoExtra =  new FuncionarioComissaoExtra(  "Bob", "Lewis", "444-44-4444", 5000, .04, 300); 

 System.out.printf("%n%s%n","Funcionario processado individualmente:");

 System.out.printf("%n%s%n%s: $%,.2f%n%n", funcionarioSalario, "ganhou",  funcionarioSalario.ganhos());
 System.out.printf("%s%n%s: $%,.2f%n%n", funcionarioPorHora, "ganhou", funcionarioPorHora.ganhos());
 System.out.printf("%s%n%s: $%,.2f%n%n", funcionarioComissao, "ganhou", funcionarioComissao.ganhos());
 System.out.printf("%s%n%s: $%,.2f%n%n", funcionarioComissaoExtra, "ganhou", funcionarioComissaoExtra.ganhos());

 // cria um array Employee de quatro elementos
 Funcionario[] funcionarios = new Funcionario[4];

 // inicializa o array com funcionario 
 funcionarios[0] = funcionarioSalario; 
 funcionarios[1] = funcionarioPorHora; 
 funcionarios[2] = funcionarioComissao; 
 funcionarios[3] = funcionarioComissaoExtra;

 System.out.printf("funcionario processado polimorficamente:%n%n");
 

// processa genericamente cada elemento no employees
 for (Funcionario funcionarioAtual : funcionarios) 
 {
 System.out.println(funcionarioAtual); // invoca toString

 // determina se elemento é um BasePlusCommissionEmployee
 if (funcionarioAtual instanceof FuncionarioComissaoExtra)
 {

 FuncionarioComissaoExtra funcionario =  (FuncionarioComissaoExtra) funcionarioAtual;

 funcionario.setsalarioBase(1.10 * funcionario.getsalarioBase());

 System.out.printf( "new base salary with 10%% increase is: $%,.2f%n", funcionario.getsalarioBase());
 } // fim do if
 

 System.out.printf( "ganhou $%,.2f%n%n", funcionarioAtual.ganhos());
 } // for final

 // obtém o nome do tipo de cada objeto no array funcionario
 for (int j = 0; j < funcionarios.length; j++) 
  System.out.printf("Empregada %d é um %s%n", j,  funcionarios[j].getClass()); 
 } // fim de main
 } // fim da classe PayrollSystemTest