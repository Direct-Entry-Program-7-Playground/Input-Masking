package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainFormController {
    @FXML
    private JFXTextField txtNIC;
    @FXML
    private JFXTextField txtCC;
    @FXML
    private JFXTextField txtDoB;
    @FXML
    private JFXTextField txtMobileNo;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private TableView tblData;
    @FXML
    private TableColumn colNIC;
    @FXML
    private TableColumn colCC;
    @FXML
    private TableColumn colDoB;
    @FXML
    private TableColumn colMobile;

    public void initialize() {

        Platform.runLater(() -> {
            tableDataColumAutoSize();

        });
    }

    private void tableDataColumAutoSize() {
        DoubleBinding autoWith = tblData.widthProperty().divide(4);
        colNIC.prefWidthProperty().bind(autoWith);
        colCC.prefWidthProperty().bind(autoWith);
        colDoB.prefWidthProperty().bind(autoWith);
        colMobile.prefWidthProperty().bind(autoWith);
    }

    @FXML
    private void btnAdd_onAction(ActionEvent actionEvent) {
    }
}
