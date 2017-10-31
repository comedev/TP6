public class TableauInstruments {
    
    public static void main(String[] args){
        int size = 3
        Instruments[] array1;
        
        array1 = new Instruments[3];
        array1[0] = new Instruments("Boom", "Grosse caisse");
        array1[1] = new Instruments("Tac", "CaisseClaire");
        array1[2] = new Instruments("Doom", "Basse");
        
        for(int i=0;i<size;i++)
            array1[i].musique();
    }

}
