import javax.swing.*;
public class CellPhoneService {

    public static void main(String[] args) {
        int talk;
        int text;
        int data;
        int price;
        final int PRICEA = 49;
        final int PRICEB = 55;
        final int PRICEC = 61;
        final int PRICED = 70;
        final int PRICEE = 79;
        final int PRICEF = 87;
        final int TALKMIN = 500;
        final int TEXTMIN = 100;
        final int DATAMIN = 2;
        String input, message, plan;

        input = JOptionPane.showInputDialog(null, "Enter amount minutes needed");
        talk = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter amount of messages needed");
        text = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter amount of data needed");
        data = Integer.parseInt(input);
        if(data > 0)
            if(data <= DATAMIN)
            {
                plan = "E";
                price = PRICEE;
            }
            else
            {
                plan = "F";
                price = PRICEF;
            }
        else
        if(talk < TALKMIN)
            if(text == 0 && data == 0)
            {
                plan = "A";
                price = PRICEA;
            }
            else
            {
                plan = "B";
                price = PRICEB;
            }
        else
        if(text < TEXTMIN)
        {
            plan = "C";
            price = PRICEC;
        }
        else
        {
            plan = "D";
            price = PRICED ;
        }
        message = "Plan " + plan + "  $" + price + " per month";
        JOptionPane.showMessageDialog(null, message);
    }
}