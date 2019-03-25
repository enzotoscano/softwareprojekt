public class Vokabelpaar{
  String vokabelM;
   String vokabelF;
   int zaehler;
  // Ende Attribute
  public Vokabelpaar(String vokabelM, String vokabelF, int zaehler){
    this.vokabelM = vokabelM;
    this.vokabelF = vokabelF;
    this.zaehler = zaehler;
  }
  // Anfang Methoden
  public void setVokabelM(String vokabelM){
    this.vokabelM = vokabelM;
    }
  public void setVokabelF(String vokabelF){
    this.vokabelF = vokabelF;
  }
  public void erhoeheZaehler(){
    this.zaehler = zaehler + 1;
  }  
  public String getVokabelM() {
    return vokabelM;
  }

  public String getVokabelF() {
    return vokabelF;
  }

  public int getZaehler() {
    return zaehler;
  }

  // Ende Methoden
}