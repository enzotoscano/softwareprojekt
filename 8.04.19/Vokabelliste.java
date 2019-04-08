import java.util.ArrayList;
import java.util.List;
public class Vokabelliste{
  ArrayList<Vokabelpaar> vokabelliste = new ArrayList<>();
  
  public void fuegeVokabelpaarHinzu(Vokabelpaar vokabelpaar){
    vokabelliste.add(vokabelpaar);
    System.out.println(vokabelpaar.getVokabelM()+" hinzugefügt");
  }
  
  public Vokabelpaar gibVokabelZuIndex(int index)
  {
    return this.vokabelliste.get(index);
  }
  public int getAnzahl(){
     return vokabelliste.size();
    }

}