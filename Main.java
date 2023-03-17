import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // Cria objeto "teclado" do tipo "Scanner"
        // Criamos o scanner com o objeto "System.in" para especificar
        // que queremos a entrada do teclado (input stream)
        Scanner teclado = new Scanner(System.in);

        // Mostra o texto na tela sem a quebra de linha
        System.out.print("Digite o numero de colunas: ");

        /* Pega valor digitado do teclado 
           (do tipo inteiro) e armazena 
           na variável "colunas" */
        int colunas = teclado.nextInt();

        // Mostra o texto na tela sem a quebra de linha
        System.out.print("Digite o numero de linhas: ");

        /* Pega valor digitado do teclado 
           (do tipo inteiro) e armazena 
           na variável "linhas" */
        int linhas = teclado.nextInt();


        /* Aqui declaramos como criaremos uma matriz. 
           Especificamos as dimensões dela (linhas, colunas) 
           durante a atribuição de valor (depois do =).    
        */
        int[][] matriz = new int[linhas][colunas];


        // Atribuindo valor a primeira linha e primeira coluna
        matriz[0][0] = 30;

        // Atribuindo valor a ultima linha e ultima coluna
        matriz[2][2] = -4;


        // Itera sobre todas as linhas da matriz, que é retornada por matriz.length
        for(int i = 0; i < matriz.length; i++) {
            // Itera sobre todas as colunas de uma linha da matriz, 
            // que é retornada por matriz[i].length
            for(int j = 0; j < matriz[i].length; j++) {

                // Mostramos o valor na tela
                System.out.print(matriz[i][j] + " ");
            }

            // Adicionamos uma quebra de linha para questões de visualização
            System.out.println();
        }
        
        /*
            Após executar o código, considerando uma matriz 3x3, espera-se a
            seguinte saída:

            30 0 0 
            0 0 0 
            0 0 -4 
        */
    }
}
