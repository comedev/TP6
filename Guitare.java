public class Guitare {

    public int nombreCorde;     //Liste des attributs
    public String son;

    public Guitare(){
        nombreCorde = 6;
        son = "la";
    }

    public Guitare(int nbreCorde, String s){    //Constructeurs
        nombreCorde = nbreCorde;
        son = s;
    }

    public void jouer(){            //Méthode
        for(int i=0; i<nombreCorde; i++)
            System.out.print(son + " ");
    }


    public static void main(String[] args){
        Guitare ukulele ;
        ukulele = new Guitare(4, "dring");  // Création d'un nouvel objet
        ukulele.jouer();    //Appel de la méthode 
    }


}
