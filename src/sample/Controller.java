package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button btn;

    @FXML
    void click(ActionEvent event) {
        btn.setText("Done :)");
    }
}
