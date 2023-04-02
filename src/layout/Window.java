package layout;
//--- singleton Window class for displaying window

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Window {
    private static final Integer WINDOW_WIDTH = 480;
    private static final Integer WINDOW_HEIGHT = 640;
    private static final String ICON_PATH = "../resources/images/calculator_icon.png";

    private static JFrame windowFrame;

    private LayoutElements layoutElements;

    //colors from: https://www.canva.com/colors/color-palettes/here-at-home/
    Color gray = new Color(0x746C70); //background
    Color coolGray = new Color(0x4E4F50); //buttons
    Color ivory = new Color(0xE2DED0); //text
    Color blueGray = new Color(0x647C90); //result

    //icon from: "https://www.flaticon.com/free-icons/calculator"
    ImageIcon calculatorIcon;


    //--- no args contructor creating window
    public Window() {
        layoutElements = new LayoutElements();

        //finding image
        if (getClass().getResource(ICON_PATH) == null) 
            System.out.println("Cannot find icon image!");
        else
            calculatorIcon = new ImageIcon(getClass().getResource(ICON_PATH));

        //create frame if not exists
        getWindowFrame();

        //adding frame properties
        windowFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        windowFrame.setVisible(true);
        windowFrame.setTitle("Calculator");
        windowFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windowFrame.getContentPane().setBackground(gray);
        windowFrame.setResizable(false);
        windowFrame.setIconImage(calculatorIcon.getImage());
        windowFrame.setLocationRelativeTo(null); //centers window

        windowFrame.setLayout(null);
        
        
        //drawing buttons and number fields
        JPanel labelsPanel = new JPanel(); //panel for labels
        labelsPanel.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT/4);
        labelsPanel.setBackground(coolGray);
        labelsPanel.setBorder(BorderFactory.createLineBorder(gray));

        JLabel resultLabel = layoutElements.getLabel("4", blueGray, gray, SwingConstants.RIGHT, 50, (int) WINDOW_WIDTH-25, (int) WINDOW_HEIGHT/8);
        JLabel actionLabel = layoutElements.getLabel("2+2=", ivory, gray, SwingConstants.RIGHT, 44, (int) WINDOW_WIDTH-25, (int) WINDOW_HEIGHT/8);
        
        resultLabel.setLocation(0, 0);
        actionLabel.setLocation(0, WINDOW_HEIGHT/8);

        //adding labels to panel
        labelsPanel.add(resultLabel);
        labelsPanel.add(actionLabel);

        //adding panel to window
        windowFrame.getContentPane().add(labelsPanel);

        //drawing buttons
        drawButtons();
        
    }

    private static JFrame getWindowFrame() {
        if (windowFrame == null) windowFrame = new JFrame();

        return windowFrame;
    }

    public boolean widnowExists() {
        return windowFrame != null;
    }

    private void drawButtons() {
        final int BUTTON_SIZE = WINDOW_WIDTH/4 - 10;
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, WINDOW_HEIGHT/4, WINDOW_WIDTH, WINDOW_HEIGHT * 3/4);
        buttonPanel.setBackground(blueGray);

        
        GridLayout grid = new GridLayout(4, 4, WINDOW_WIDTH/4, WINDOW_WIDTH/4);
        
        buttonPanel.setLayout(grid);
        
        buttonPanel.add(layoutElements.getButton("9", ivory, coolGray, 30, BUTTON_SIZE));
        buttonPanel.add(layoutElements.getButton("8", ivory, coolGray, 18, BUTTON_SIZE));
        buttonPanel.add(layoutElements.getButton("7", ivory, coolGray, 18, BUTTON_SIZE));
        buttonPanel.add(layoutElements.getButton("+", ivory, coolGray, 18, BUTTON_SIZE));
        
        
        windowFrame.getContentPane().add(buttonPanel);
        

    }
}
