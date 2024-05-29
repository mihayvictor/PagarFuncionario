package main;

import java.util.Scanner;

import Model.Funcionarios;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //Leitor de arquivo.
        Scanner file = new Scanner(new File("/home/mihay96/Documentos/Git/MeusProjetos/Exercícios/PagarFuncionario/src/Funcionarios.txt"));

        for(int i=1; i <= 3; i++){
            Funcionarios umFuncionario = new Funcionarios();

            umFuncionario.setNome(file.nextLine());
            umFuncionario.setCargo(file.nextLine());
            umFuncionario.preencherCheque(file.nextDouble());
            file.nextLine();
        }
    }
}
