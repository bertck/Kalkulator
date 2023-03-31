import layout.Window;

//--- Main class ---


public class Calculator {
    public static void main(String[] args) {
        Window window = new Window();
        if(!window.widnowExists()) throw new RuntimeException("Window doesn't exits, something bad happend");

        
    }
}
