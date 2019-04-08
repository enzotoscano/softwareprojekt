import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 
 import java.util.Random;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 01.04.2019
  * @author 
  */

public class AbfrageOberflaeche extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton1 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JTextField jTextField3 = new JTextField();
  private Vokabelliste vokabelliste;;
  private JLabel jLabel3 = new JLabel();
  private JButton jButton2 = new JButton();
  Random rand = new Random();
  // Ende Attribute
  
  public AbfrageOberflaeche(String title, Vokabelliste vl) { 
    // Frame-Initialisierung
    super(title);
    this.vokabelliste = vl;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 550; 
    int frameHeight = 335;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(56, 72, 150, 20);
    cp.add(jTextField1);
    jTextField2.setBounds(56, 128, 150, 20);
    cp.add(jTextField2);
    jButton1.setBounds(240, 88, 91, 49);
    jButton1.setText("Überprüfe");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jLabel1.setBounds(56, 48, 110, 20);
    jLabel1.setText("Muttersprache:");
    cp.add(jLabel1);
    jLabel2.setBounds(56, 104, 110, 20);
    jLabel2.setText("Zweitsprache");
    cp.add(jLabel2);
    jTextField3.setBounds(352, 152, 190, 28);
    cp.add(jTextField3);
    jLabel3.setBounds(232, 160, 110, 20);
    jLabel3.setText("Ergebnis:");
    cp.add(jLabel3);
    jButton2.setBounds(240, 48, 89, 25);
    jButton2.setText("Neue Vokabel");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    Vokabelpaar test = new Vokabelpaar("Katze", "cat");
    this.vokabelliste.fuegeVokabelpaarHinzu(test);
    this.jTextField1.setText(this.vokabelliste.gibVokabelZuIndex(0).getVokabelM());
    setVisible(true);
  } // end of public AbfrageOberflaeche
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    if (vokabelliste.gibVokabelZuIndex(rand.nextInt(vokabelliste.getAnzahl())).pruefeVokabelF(jTextField2.getText())) {
      jTextField3.setText("Richtig");
    } // end of if
    else{
      jTextField3.setText("Falsch");
    }
    
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    int index = rand.nextInt(vokabelliste.getAnzahl());
    this.jTextField1.setText(this.vokabelliste.gibVokabelZuIndex(index).getVokabelM());               
    jTextField2.setText(" ");
  } // end of jButton2_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    //new AbfrageOberflaeche("AbfrageOberflaeche");
  } // end of main
  
} // end of class AbfrageOberflaeche
