import javax.swing.*;
public class CellPhoneService {

    public static void main(String[] args) {
        int talk;
        int text;
        int data;
        int price;
        final int PLANA = 49;
        final int PLANB = 55;
        final int PLANC = 61;
        final int PLAND = 70;
        final int PLANE = 79;
        final int PLANF = 87;
        final int TALKMIN = 500;
        final int TEXTMIN = 100;
        final int DATAMIN = 2;
        String input, output, plan;

        input = JOptionPane.showInputDialog(null, "Enter amount minutes needed");
        talk = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter amount of messages needed");
        text = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter amount of data needed");
        data = Integer.parseInt(input);
        
    }
}
