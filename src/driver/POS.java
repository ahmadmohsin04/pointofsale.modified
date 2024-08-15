package driver;

import design_panel.LoadingScreen;
import design_panel.Welcome;
import entities.Product;
import entities.Store;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POS {
    public static void main(String[] args) {
        // TODO code application logic here
        Store.dummyProducts();
        LoadingScreen loading = new LoadingScreen();
        loading.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            loading.loading_num.setText(String.valueOf(i));
            loading.progressBar.setValue(i);
            //delay
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }//end loop        
        loading.setVisible(false);
        loading.dispose();
        new Welcome().setVisible(true);                                
    }
    
}
