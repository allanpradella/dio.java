package edu.allan.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediafinal = 7;
        if(mediafinal<6)
            System.out.println("Reprovado");
        else if(mediafinal==6)
            System.out.println("PROVA MINERVA");
        else 
            System.out.println("APROVADO");
    }
}
