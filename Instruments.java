
public class Instruments {
    // Seul attribut necessaire
    public String Son;
    // Un petit nom pour les differencier #bonus
    public String NomInstrument;
    // Générateur, puisqu'il en faut bien un
    public Instruments(String vibra, String nomine){
        this.Son = sound;
        this.NomInstrument = nom;
    }
    
    public void musique(){
      System.out.println("L'instrument " + NomInstrument
              + " fait : " + Son);
    }
}
