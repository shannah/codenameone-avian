package ca.weblite.codename1.app;

import com.codename1.ui.Display;
/**
 *
 * @author shannah
 */
public class Main implements Runnable {
    private com.codename1.demos.kitchen.KitchenSink ma;
    public static void main(String[] args ){
        Display.init(new Main());
    }
    
    
    public void run(){
        ma = new com.codename1.demos.kitchen.KitchenSink();
        ma.init(this);
        ma.start();
    }
}
