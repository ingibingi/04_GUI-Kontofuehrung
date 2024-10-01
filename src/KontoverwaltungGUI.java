import javax.swing.*;
import java.util.ArrayList;


public class KontoverwaltungGUI {

    private static boolean istNeuesKonto;
    private JPanel kontoView;
    private JComboBox<KontoType> cbKontotyp;
    private JScrollPane txtmlVertragshistorie;
    private JComboBox cbFunktion;
    private JTextField txtBetrag;
    private JButton btnBuchungBuchen;
    private JTextField txtZusatz1;
    private JTextField txtKontonummer;
    private JTextField txtKontoinhaber;
    private JTextField txtZinsen;
    private JTextField txtKontostand;
    private JTextPane textPane1;
    private JComboBox<Konto> cbKonto;
    private JButton btnKontoAnlegen;
    private JButton btnÄnderungSpeichern;
    private JButton btnBuchungVerwerfen;
    private JButton btnÄnderungVerwerfen;

    public KontoverwaltungGUI() {
        for (KontoType type : KontoType.values()) {
            cbKontotyp.addItem(type);
        }

        for (Konto konto : Konto.getListeAlleKonten()){
            cbKonto.addItem(konto);
        }



        btnKontoAnlegen.addActionListener(e -> {
            istNeuesKonto = true;
            //TODO: felder leeren
            txtKontonummer.setText("");
            txtKontoinhaber.setText("");
            txtKontostand.setText("0");
        });

        btnÄnderungSpeichern.addActionListener(e -> {
            if (istNeuesKonto){
                KontoType kontotype = (KontoType) cbKontotyp.getSelectedItem();
                Konto neuesKonto;
                switch (kontotype) {
                    case KontoType.GIRONKONTO:
                        neuesKonto = new Girokonto(
                                txtKontoinhaber.getText(),
                                txtKontonummer.getText());
                        break;
                    case KontoType.SPARKONTO:
                        neuesKonto = new Sparkonto(
                                txtKontoinhaber.getText(),
                                txtKontonummer.getText());
                        break;
                    case KontoType.KREDITKONTO:
                        neuesKonto = new Kreditkonto(
                                txtKontoinhaber.getText(),
                                txtKontonummer.getText(),
                                Double.parseDouble(txtKontostand.getText()));
                        break;
                    default:
                        System.out.println("Kontyp existiert nicht");
                }
            } else { //kein neues Konto

            }
        });
    }

    public static void main(String[] args) {
        Girokonto konto1 = new Girokonto("testkonto1","kontonr1",420);
        JFrame kontoFrame = new JFrame("Kontoübersicht");
        KontoverwaltungGUI kontoverwaltung = new KontoverwaltungGUI();

        kontoFrame.setContentPane(kontoverwaltung.kontoView);
        kontoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kontoFrame.pack();
        kontoFrame.setVisible(true);

    }
}
