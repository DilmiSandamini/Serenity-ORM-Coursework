package lk.ijse.gdse72.serenityormcoursework.dao.custom;

import lk.ijse.gdse72.serenityormcoursework.dao.CrudDAO;
import lk.ijse.gdse72.serenityormcoursework.entity.User;

import java.sql.SQLException;

public interface UserDAO extends CrudDAO<User, String> {

    boolean ValidUser(String username, String password) throws SQLException;
}