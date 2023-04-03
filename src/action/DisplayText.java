package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class DisplayText implements ActionListener{
    private JLabel resultLabel;
    private JLabel actionLabel;
    private String value;

    public DisplayText(JLabel actionLabel, String value) {
        this.actionLabel = actionLabel;
        this.value = value;
        this.resultLabel = null;
    }

    public DisplayText(JLabel actionLabel, JLabel resultLabel, String value) {
        this.actionLabel = actionLabel;
        this.resultLabel = resultLabel;
        this.value = value;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!value.equals("=")) {
            String labelString = actionLabel.getText();
            labelString += value;
            actionLabel.setText(labelString);

            //add syntax check (ex. + after + is forbidden)
        } else {
            String labelString = actionLabel.getText();
            labelString += value;
            actionLabel.setText(labelString);
            //compute and show result

            resultLabel.setText("69");
        }
        
    }
    
}
