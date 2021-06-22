package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.tm.InputsTM;

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
    private TableView<InputsTM> tblData;
    @FXML
    private TableColumn colNIC;
    @FXML
    private TableColumn colCC;
    @FXML
    private TableColumn colDoB;
    @FXML
    private TableColumn colMobile;

    public void initialize() {

        tblData.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("NIC"));
        tblData.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("creditCardNo"));
        tblData.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("dob"));
        tblData.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("mobileNo"));

        tblData.getItems().add(new InputsTM("936245960V", "1111-1111-1111-1111", "25/05/1993", "(+94) 77 258-4568"));
        tblData.getItems().add(new InputsTM("968855758V", "5568-5569-5588-5558", "12/02/1996", "(+94) 70 268-3578"));
        tblData.getItems().add(new InputsTM("884466229V", "1596-4856-1257-2586", "04/06/1988", "(+94) 71 153-4586"));
        tblData.getItems().add(new InputsTM("456813269V", "1235-2568-1596-1257", "30/08/1945", "(+94) 71 358-4568"));

        Platform.runLater(() -> {
            tableDataColumAutoSize();

        });
    }

    private void tableDataColumAutoSize() {
        DoubleBinding autoWith = tblData.widthProperty().subtract(4).divide(4);
        colNIC.prefWidthProperty().bind(autoWith);
        colCC.prefWidthProperty().bind(autoWith);
        colDoB.prefWidthProperty().bind(autoWith);
        colMobile.prefWidthProperty().bind(autoWith);
    }

    @FXML
    private void btnAdd_onAction(ActionEvent actionEvent) {
    }
}
