package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ClearLabel implements ActionListener{
    private JLabel actionLabel;
    private JLabel resultLabel;

    public ClearLabel(JLabel actionLabel, JLabel resultLabel) {
        this.actionLabel = actionLabel;
        this.resultLabel = resultLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        actionLabel.setText("");
        resultLabel.setText("");
    }
    
}
