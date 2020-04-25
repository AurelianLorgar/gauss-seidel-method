package sample;

import javafx.scene.control.Alert;

class Alerts {

    void alertWrongSymbol(String fieldName) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Ошибка!");
        alert.setContentText("Обнаружен недопустимый символ в поле " + fieldName);
        alert.showAndWait();
    }
}