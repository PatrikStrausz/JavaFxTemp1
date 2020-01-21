package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

   public TextField a ;
   public TextField b ;
    public TextField sum ;
    public CheckBox checkBox;
    public Label label;

    public TextField changeText;


    public void clickBtnResult(ActionEvent event) {


        float one = Float.parseFloat(a.getText());
        float two = Float.parseFloat(b.getText());
        String answer = String.valueOf(one + two);
        sum.setText(answer);

    }

    public void showText(ActionEvent event){

        if(!checkBox.isSelected()) {
            label.setVisible(false);

        }else {
            label.setVisible(true);
        }
    }

    public void changeTextLbl(ActionEvent event){
              if(changeText.getText().trim().isEmpty()){
                  label.getText();
              }else {
                  label.setText(changeText.getText());
              }

    }
}

