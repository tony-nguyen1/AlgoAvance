import java.util.ArrayList;

public class Hanoi {
    public static int p = 0;

    public static void resoudreAux(int n, int i, int j)
    {
        int k; //le poteau intermédiaire ou k = 6 - i - j
        if (i==1)
        {
            if (j==2)
                k = 3;  // i = 1 et j = 2
            else
                k = 2;  // i = 1 et j = 3
        }
        else if (i == 2)
        {
            if (j==1)
                k = 3; // i = 2 et j = 1
            else
                k = 1; // i = 2 et j = 3
        }
        else
        {
            if (j == 2)
                k = 1; // i = 3 et j = 2
            else
                k = 2; // i = 3 et j = 1
        }

        if (n == 0) {}

        else {
            resoudreAux(n-1,i,k);
            p++;
            System.out.println(p + " : " + i + "-> " + j);
            resoudreAux(n-1,k,j);
        }
    }

    public static int calculeNbHanoi(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return calculeNbHanoi(n-1)*2+1;
    }

    public static void remplir(int n) {
        if (n == 1)
        {
            System.out.println("remplir 1");
        }
        else if (n == 2)
        {
            remplir(n-1);
            System.out.println("remplir 2");
        }
        else {
            remplir(n-1);
            vider(n-2);
            System.out.println("remplir " + n);
            remplir(n-2);
        }
    }

    public static void vider(int n) {
        if (n == 1)
            System.out.println("vider " + n);
        else if (n == 2) {
            System.out.println("vider " + n);
            vider(n - 1);
        } else {
            vider(n-2);
            System.out.println("vider " + n);
            remplir(n-2);
            vider(n-1);
        }

    }

    public static void resoudre(int n) {resoudreAux(n,1,3);}

    public static void main(String [] args)
    {
        resoudre(3);
        System.out.println("nb coup pour résoudre hanoi : " + calculeNbHanoi(4));
        System.out.println("\nBaguenaudier");
        remplir(4);
    }
    /**
     *
     * 2^(n)-1
     *
     *q1.2 un = (un-1)*2+1
     */
}
