package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField upis;
    public Label labela;
    String razmak="";
    public void sumaCifara (int n) {
        int suma=0;
        int x=n;
        while (x!=0){
            suma=suma+(x%10);
            x=x/10;
        }
        for (int i=1; i<=n; i++ ) {
            if(i%suma==0){
              razmak += i + " ";
            }
        }
    }

    public void ispis(ActionEvent actionEvent) {
    int n;
    n = Integer.parseInt(upis.getText());
    sumaCifara(n);
    labela.setText(razmak);
    }
}
