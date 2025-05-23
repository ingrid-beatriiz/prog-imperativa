import java.util.Random;

public class Ex01 {
    public static Random gerar = new Random();

    public static void main(String[] args) {

        int [] vetor = new int[5];
        gerarNum(vetor);
        System.out.println();
        imprimir(vetor);
        System.out.println();
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

