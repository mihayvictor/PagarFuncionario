package Model;

import utils.FormatarReal;

public class Funcionarios {
private String nome, cargo;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCargo() {
    return cargo;
}

public void setCargo(String cargo) {
    this.cargo = cargo;
}

public void preencherCheque(double valorPago){
    System.out.printf("Pague em nome de %s \n", nome);
    System.out.printf("(%s)\n", cargo);
    System.out.println(FormatarReal.formatarReal(valorPago));
}



    
}