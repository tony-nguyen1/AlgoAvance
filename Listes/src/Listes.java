class Liste {
    private int val;
    private Liste suiv;

    public Liste(){
        suiv = null;
    }

    public Liste(int val, Liste suiv) {
        this.val = val;
        this.suiv = suiv;
    }

    public boolean estVide(){
        return suiv==null;
    }

    public void afficheListe() {
        //action : affiche les valeurs de this avec un espace dans l'ordre

        if (!this.estVide())
        {
            System.out.print(this.val + " ");
            suiv.afficheListe();
        }
    }

    public void afficheListeInverse() {
        //action : idem mais dans l'autre sens
        if (!this.estVide())
        {
            suiv.afficheListeInverse();
            System.out.print(this.val + " ");
        }

    }

    public int longueur() {
        if (!this.estVide())
            return suiv.longueur() + 1;
        return 0;
    }

    public boolean recherche(int x) {
        if (!this.estVide())
            if (val == x) return true;
        else
            return false;

        return suiv.recherche(x);
    }

    public boolean croissant()
    {
        if (this.estVide())
            return true;
        else if (this.suiv.estVide())
            return true;
        else if (this.val <= this.suiv.val)
            return this.suiv.croissant();
        else
            return false;
    }

    public void ajoutTete(int x){
        Liste aux = new Liste();
        aux.val = val;
        aux.suiv = suiv;
        this.val = x;
        this.suiv = aux;
    }

    public void supprimeTete(){
        //sur liste non vide
        this.val = suiv.val;
        this.suiv = this.suiv.suiv;
    }

    public void ajoutFin(int x)
    {
        if (this.estVide()) {
            this.val = x;
            this.suiv = new Liste();
        } else
            this.suiv.ajoutFin(x);
    }
}
