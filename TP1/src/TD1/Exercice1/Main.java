package TD1.Exercice1;

public class Main {

    public static int factorielle(int n)
    {
        if (n>1)
        {
            return n*factorielle(n-1);
        }
        else
        {
            return 1;
        }
    }

    public static boolean pair(int n) {
        if (n>0) return pair(n-2);
        else return n==0;
    }

    public static int sommeImpairs(int n) {
        if (n>= 1) {
            if (n%2 ==1) return n+sommeImpairs(n-2);
            else return sommeImpairs(n-1);
        }
        else return 0;
    }

    public static int puiss(int x, int n) {
        if (n >= 1) return x*puiss(x,n-1);
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(factorielle(5));
        System.out.println(pair(5));
        System.out.println(pair(6));
        System.out.println(sommeImpairs(5));
        System.out.println("puissance : " + puiss(5,2));
    }
}
