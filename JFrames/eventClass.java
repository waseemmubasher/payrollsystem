package JFrames;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Waseem
 */
public class eventClass {

void integerEvent(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
        evt.consume();}//only allow integer input
    }
}
