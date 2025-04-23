package lk.ijse.gdse72.serenityormcoursework.bo.custom;

import lk.ijse.gdse72.serenityormcoursework.dto.PatientDTO;

import java.util.List;

public interface PatientsBO {
    List<PatientDTO> getAllPatients() throws Exception;

    boolean deletePatient(String id) throws Exception;

    boolean savePatient(PatientDTO patientDTO) throws Exception;

    boolean updatePatient(PatientDTO patientDTO) throws Exception;
}
