package org.example;

import org.example.model.Pessoa;

public class Main {
    static void main() {

        Pessoa pessoa = new Pessoa("João");
        System.out.println(pessoa.getNome());

    }

    static int soma(int a, int b){
        return a+b;
    }

}
