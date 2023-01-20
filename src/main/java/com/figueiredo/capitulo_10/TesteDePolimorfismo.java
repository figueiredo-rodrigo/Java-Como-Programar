package com.figueiredo.capitulo_10;



// Atribuindo referências de superclasse e subclasse a variáveis de superclasse e
// de subclasse.

public class TesteDePolimorfismo {
    public static void main(String[] args) {
        // atribui uma referência de superclasse à variável de superclasse
        FuncionarioComissao funcionarioComissao = new FuncionarioComissao("Sue", "Jones", "222-22-2222", 10000, .06);

        // atribui uma referência de subclasse à variável de subclasse
        FuncionarioComissaoExtra funcionarioComissaoExtra = new FuncionarioComissaoExtra("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // invoca toString no objeto de superclasse utilizando a variável de superclasse
        System.out.printf("%n%n%s %s:%n%n%s%n%n", "Call funcionarioComissao's toString with superclass reference ", "to superclass object", funcionarioComissao.toString());

        // invoca toString no objeto de subclasse utilizando a variável de subclasse
        System.out.printf("%s %s:%n%n%s%n%n", "Call funcionarioComissaoExtra's toString with subclass", "reference to subclass object", funcionarioComissaoExtra.toString());

        // invoca toString no objeto de subclasse utilizando a variável de superclasse
        FuncionarioComissaoExtra funcionarioComissao2 = funcionarioComissaoExtra;
        System.out.printf("%s %s:%n%n%s%n", "Call funcionarioComissaoExtra's toString with superclass", "reference to subclass object", funcionarioComissao2.toString());
    } // fim de main
} // fim da classe PolymorphismTest