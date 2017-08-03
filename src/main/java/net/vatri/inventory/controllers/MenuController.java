package net.aps.inventory.controllers;

import net.aps.inventory.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController {
    @FXML
    protected void openProducts(ActionEvent event) {
        App.showPage("products");
    }

    @FXML
    protected void dashboardAction(ActionEvent event) {
        App.showPage("dashboard");
    }

    @FXML
    protected void openGroups() {
        App.showPage("groups");
    }

    @FXML
    protected void openOrders() {
        App.showPage("orders");
    }

    @FXML
    protected void openStock() {
        App.showPage("stock");
    }
}