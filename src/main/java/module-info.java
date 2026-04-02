module com.mcrg.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mcrg.studentmanager to javafx.fxml;
    exports com.mcrg.studentmanager;
}