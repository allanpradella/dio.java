public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2024;
        int cep = 14804083;
        double salario = 1975.25;
        long grande = 99999999;
        boolean numeros = true;
        char unicode = 'A'; 
        float outroSalario = 5000.00f;

        // Criando uma instância da classe Impressora
        Impressora impressora = new Impressora();
        
        // Criando uma instância da classe Concurso
        Impressora.Concurso concurso = impressora.new Concurso();
        String comp1 = concurso.questoesConcurso();

        // Imprimindo os dados usando a classe Impressora
        impressora.imprimirDados(idade, ano, cep, salario, grande, numeros, unicode, outroSalario, comp1);
    }
}

// A classe contém o método imprimirDados que aceita os tipos de dados
class Impressora {
    // Método para imprimir os dados
    public void imprimirDados(byte idade, short ano, int cep, double salario, long grande,
                              boolean numeros, char unicode, float outroSalario, String comp1) {
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("Salário: " + salario);
        System.out.println("Número Grande: " + grande);
        System.out.println("Números: " + numeros);
        System.out.println("Unicode: " + unicode);
        System.out.println("Outro Salário: " + outroSalario);
        System.out.println("Questão do concurso: " + comp1);
    }

    // Classe Concurso
    class Concurso {
        public String questoesConcurso() {
            String questao1 = "Na linguagem Java, os tipos primitivos de dados são: ";
            String resposta1 = "byte, short, int, long, float, double, boolean e char.";
            return questao1 + resposta1; 
        }
    }
}
