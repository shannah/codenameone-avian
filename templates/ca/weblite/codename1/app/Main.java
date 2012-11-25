package ca.weblite.codename1.app;

import com.codename1.ui.Display;
/**
 *
 * @author shannah
 */
public class Main implements Runnable {
    private APPLICATION_CLASS ma;
    public static void main(String[] args ){
        Display.init(new Main());
    }
    
    
    public void run(){
        ma = new APPLICATION_CLASS();
        ma.init(this);
        ma.start();
    }
}
