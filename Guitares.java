public class Guitares {

    public static void main(String [] args){
        int size = 3;
        Guitare[] array;        //Création du tableau
        array = new Guitare[3];
        array[0] = new Guitare(3,"tin");        //Remplissage du tableau
        array[1] = new Guitare(5,"drin");
        array[2] = new GuitareElectrique(5,"daon");

        for(int i=0;i<size;i++)
            array[i].jouer();

    }

}
