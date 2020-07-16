package Main;

import Control.*;
import Model.*;
import View.*;

/**
 *
 * @author Cristian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new ModelImpl();
        Control control = new ControlImpl(model);
        View view = new ViewImpl(control);
        view.start();
    }
    
}
