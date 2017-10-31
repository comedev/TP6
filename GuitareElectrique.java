public class GuitareElectrique extends Guitare{

    public GuitareElectrique(int nbreCorde, String s){      //Constructeur
        super(nbreCorde,s);
    }

    public String maj(){
        son = son.toUpperCase();
        return super.son;
    }

    public String disto(){      //Méthode
        son += " OUUUIIINNGGG";
        return super.son;
    }

    public static void main(String [] args){
        GuitareElectrique rollingStones;
        rollingStones= new GuitareElectrique(6,"tsing");
        rollingStones.maj();
        rollingStones.jouer();
        rollingStones.disto();
        rollingStones.jouer();
    }
}
