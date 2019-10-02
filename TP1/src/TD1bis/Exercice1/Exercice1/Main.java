package TD1bis.Exercice1.Exercice1;

public class Main {

    /*public static int maxDebFixe(int[] t, int i) {
        if (i < t.length-1) {
            if (t[i] < t[i + 1]) {
                return maxDebFixe(t, i + 1) + 1;
            } else {
                return 1;
            }
        }
        return 1;
    }*/

    public static int maxDebFixe(int[] t, int i) {
        if (i < t.length-1 && t[i] < t[i + 1])
                return maxDebFixe(t, i + 1) + 1;
        return 1;
    }

    public static int sousSuiteCons(int []t, int i){
        int max, rep;
        max = 0;
        if (i == t.length)
            return 0;
        else {
            for (int indice = 0; indice < t.length-1; indice++) {
                rep = maxDebFixe(t,indice);
                if (rep > max)
                    max = rep;
            }
        }
        return max;
    }

    public static int sousSuiteNonCons(int []t,int i,int x){
        if (i != t.length-1)
        {
            if (t[i + 1] > x)
                return sousSuiteNonCons(t, i + 1, t[i + 1]) + 1;
            else
                return sousSuiteNonCons(t, i + 1, x);
        }
        return 1;
    }

    public static void main(String[] args) {
        int [] t = {5,6,2,5,3,7,8,9,1,11};

        System.out.println(maxDebFixe(t,8));
        System.out.println("answer = " + sousSuiteCons(t,0));

        t = new int[]{-1,3,10,5,3,4,8,6,7};
        System.out.println("suiteNonConsécutive " + sousSuiteNonCons(t,2,0) + " réponse = 4");
        System.out.println("suiteNonConsécutive " + sousSuiteNonCons(t,2,4) + " réponse = 3");
    }
}
