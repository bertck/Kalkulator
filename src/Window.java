//--- singleton Window class for displaying window

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Window {
    private static final Integer WINDOW_WIDTH = 480;
    private static final Integer WINDOW_HEIGHT = 640;
    private static final String ICON_PATH = "./resources/images/calculator_icon.png";

    private static JFrame windowFrame;

    //colors from: https://www.canva.com/colors/color-palettes/here-at-home/
    Color gray = new Color(0x746C70); //background
    Color coolGray = new Color(0x4E4F50); //buttons
    Color ivory = new Color(0xE2DED0); //text
    Color blueGray = new Color(0x647C90); //result

    //icon from: "https://www.flaticon.com/free-icons/calculator"
    ImageIcon calculatorIcon;


    //--- no args contructor creating window
    public Window() {
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
    }

    private static JFrame getWindowFrame() {
        if (windowFrame == null) windowFrame = new JFrame();

        return windowFrame;
    }
}
