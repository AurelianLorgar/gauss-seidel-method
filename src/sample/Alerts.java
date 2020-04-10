package sample;

import javafx.scene.control.Alert;

class Alerts {

    void alertWrongSymbol() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Ошибка!");
        alert.setContentText("Обнаружен недопустимый символ");
        alert.showAndWait();
    }
}