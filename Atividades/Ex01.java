// Vetores
// 1. Faca um programa que possua um vetor denominado A que armazene 6 numeros intei- ´
// ros. O programa deve executar os seguintes passos:
// (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
// (b) Armazene em uma variavel inteira (simples) a soma entre os valores das posic¸ ´ oes ˜
// A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
// (c) Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
// (d) Mostre na tela cada valor do vetor A, um em cada linha.


import java.util.Random;

public class Ex01 {
    public static Random gerar = new Random();

    public static void main(String[] args) {

        int [] A = {1, 0, 5, -2, -5, 7};
        soma(A);
        // gerarNum(vetor);
        System.out.println();
        imprimir(A);
        System.out.println();
    }

    public static void soma(int[] A) {

        int soma = 0;
        soma = A[0] + A[1] + A[5];
        System.out.println(soma);
    }

    public static void gerarNum( int [] v) {

        for (int i = 0;  i < v.length; i++) {
            v[i] = gerar.nextInt(5);
            // System.out.print(i);
        }
    }

    public static void imprimir(int [] v) {

        for (int i = 0; i < v.length; i++) {

            if(i < v.length - 1) {

                System.out.print(v[i] + ",");

            } else {

                System.out.print(v[i]);
            }
        }
    }
}

