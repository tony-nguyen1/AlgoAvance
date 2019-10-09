class DessinFractale{
    private final Turtle bob;
    
    private final static int LARGEUR = 800;
    private final static int HAUTEUR = 600;
    //taille de la fenetre graphique

    public DessinFractale(){
	//bob  = new Turtle();
	//bob  = new Turtle(-400,-299);//pour flocon
		bob  = new Turtle(0,0);
	Turtle.setCanvasSize(LARGEUR,HAUTEUR);//à appeler APRES création de la tortue
    }

    public DessinFractale(int v){
	//attention, plus v est grand, plus bob va lentement !
	this();
	bob.speed(v);
    }


    public void reset(){
	bob.clear();
	bob.up();
	bob.setPosition(0,0);
	bob.setDirection(0);
	bob.down();

    }

    public void close(){
	bob.exit();
    }


    public void carre(double l){
		for (int i = 0; i < 4; i++) {
			bob.forward(l);
			bob.left(90.0);
		}
    }

    public void floconVonKoch(int n)
	{
		if (n == 0)
		{
			bob.forward(5);
		}
		if (n >= 1)
		{
			floconVonKoch(n - 1);
			bob.left(60);
			floconVonKoch(n - 1);
			bob.right(120);
			floconVonKoch(n - 1);
			bob.left(60);
			floconVonKoch(n - 1);

		}
	}

	public void arbre(int tailleBranche, int n)
	{
		if (n == 0){
		bob.forward(tailleBranche);
		}
		else if (n > 0){
			bob.forward(tailleBranche);

			bob.left(40);
			arbre(tailleBranche*1/2,n-1);
			bob.backward(tailleBranche*1/2);

			bob.right(40);
			arbre(tailleBranche*1/2,n-1);
			bob.backward(tailleBranche*1/2);

			bob.right(40);
			arbre(tailleBranche*1/2,n-1);
			bob.backward(tailleBranche*1/2);
			bob.left(40);
		}

	}

	public void triangle(int distance, int n)
	{
		if (n == 0)
		{
			bob.forward(distance);

			bob.left(120);
			bob.forward(distance);

			bob.left(120);
			bob.forward(distance);

			bob.left(120);
		}

		else
		{
			triangle(distance,n-1);

		}
	}


    public static void main(String[] args){
	/*DessinFractale d = new DessinFractale(500);
	d.carre(90);
	d.reset();
	d.carre(60);
	d.reset();
	d.close();*/

	/*DessinFractale e = new DessinFractale(10);
	e.floconVonKoch(4);
	e.close();*/

	/*DessinFractale f = new DessinFractale(10);
	f.arbre(100, 6);
	f.close();*/

	DessinFractale g = new DessinFractale(300);
	g.triangle(300,1);
	g.close();

    }
}