module lk.ijse.gdse.serenityormcoursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires com.jfoenix;
    requires static lombok;
    requires java.mail;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;



    opens lk.ijse.gdse72.serenityormcoursework.controller to javafx.fxml;
    opens lk.ijse.gdse72.serenityormcoursework.tm to javafx.base;
    opens lk.ijse.gdse72.serenityormcoursework.entity to org.hibernate.orm.core;
    opens lk.ijse.gdse72.serenityormcoursework to javafx.fxml;

    exports lk.ijse.gdse72.serenityormcoursework;
    exports lk.ijse.gdse72.serenityormcoursework.controller;
}