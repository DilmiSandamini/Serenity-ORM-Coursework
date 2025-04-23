package lk.ijse.gdse72.serenityormcoursework.bo.custom;

import lk.ijse.gdse72.serenityormcoursework.dto.UserDTO;

import java.util.List;

public interface UserBO {
    boolean isValidUser(String username, String password) throws Exception;

    boolean deleteUser(String id) throws Exception;

    boolean saveUser(UserDTO userDTO) throws Exception;

    boolean updateUser(UserDTO userDTO) throws Exception;

    List<UserDTO> getAllUsers() throws Exception;
}
