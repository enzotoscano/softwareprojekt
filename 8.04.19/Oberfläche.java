import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 29.03.2019
  * @author 
  */

public class Oberfläche extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton1 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private Vokabelliste vokabelliste = new Vokabelliste();
  private JButton jButton2 = new JButton();
  // Ende Attribute
  
  public Oberfläche(String title) { 
    // Frame-Initialisierung
    super(title);
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
    
    jTextField1.setBounds(56, 96, 198, 36);
    cp.add(jTextField1);
    jTextField2.setBounds(56, 168, 193, 33);
    cp.add(jTextField2);
    jButton1.setBounds(296, 136, 75, 25);
    jButton1.setText("Hinzufügen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jLabel1.setBounds(56, 72, 110, 20);
    jLabel1.setText("Muttersprache:");
    cp.add(jLabel1);
    jLabel2.setBounds(56, 144, 110, 20);
    jLabel2.setText("Zweitsprache:");
    cp.add(jLabel2);
    jButton2.setBounds(360, 248, 75, 25);
    jButton2.setText("Abfragen anfangen");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Oberfläche
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    Vokabelpaar p = new Vokabelpaar(jTextField1.getText(),jTextField2.getText());
    vokabelliste.fuegeVokabelpaarHinzu(p);
  } // end of jButton1_ActionPerformed
  
  // AbfrageOberflaeche aof = new AbfrageOberflaeche("Abfrage", this.vokabelliste);
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    AbfrageOberflaeche aof = new AbfrageOberflaeche("Abfrage", this.vokabelliste);
  } // end of jButton2_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new Oberfläche("Oberfläche");
  } // end of main
  
} // end of class Oberfläche
