package AlgoAvance;

public class Polynome {
    private int coeff;
    private int deg; //deg >= 0
    private Polynome suiv;
    //represente le monosme coeff∗x^{deg}
    //suiv==null represente le polynome nul

    public Polynome(){
        suiv = null;
    }

    public boolean estVide(){
        return suiv==null;
    }


    public Polynome(int coeff, int deg, Polynome suiv) {
        this.coeff = coeff;
        this.deg = deg;
        this.suiv = suiv;
    }

    public Polynome(Polynome p){
    //constructeur par copie en profondeur
        if(p.estVide()){
            suiv=null;
        }
        else{
            coeff = p.coeff;
            deg = p.deg;
            suiv = new Polynome(p.suiv);
        }
    }

    @Override
    public String toString() {
        String s = "";

        if (coeff == 0)
        {
            if (this.estVide())
                return suiv.toString();
        }
        else if (coeff == 1)
            s = "x";
        else
            s = coeff + "x";

        if (deg != 0 && deg != 1 && coeff != 0)
            s = s.concat("^"+ deg);

        if (this.suiv.estVide())
            return s;

        return s + "+" + suiv.toString();
    }

    public int eval (int x)
    {
        int val = coeff*(int)(Math.pow(x,deg));

        if (this.suiv.estVide())
            return val;

        return val + suiv.eval(x);
    }

    public int degre()
    {
        int degMaxDuSuiv;
        if (suiv.estVide())
        {}
        else {
            degMaxDuSuiv = suiv.degre();
            if (this.deg < degMaxDuSuiv)
            {
                return degMaxDuSuiv;
            }
            else
                return this.deg;
        }

        return this.deg;
    }

    public Polynome simplifie() {
        if (this.estVide()) {
            return new Polynome();
        } else {
            if (this.coeff == 0) {
                return suiv.simplifie();
            } else {
                return new Polynome(this.coeff, this.deg, suiv.simplifie());
            }
        }
    }

    public Polynome deriver()
    {
        if (this.suiv.estVide())
        {
            return new Polynome();
        }
        else
        {
            return new Polynome(this.coeff*this.deg,this.deg-1,suiv.deriver());
        }
    }
}
