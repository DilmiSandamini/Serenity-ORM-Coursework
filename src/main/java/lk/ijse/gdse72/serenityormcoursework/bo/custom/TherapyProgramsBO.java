package lk.ijse.gdse72.serenityormcoursework.bo.custom;

import lk.ijse.gdse72.serenityormcoursework.dto.TherapyProgramsDTO;

import java.util.List;

public interface TherapyProgramsBO {

    List<TherapyProgramsDTO> getAllTherapyPrograms() throws Exception;

    boolean deleteTherapyProgram(String id) throws Exception;

    boolean saveTherapyProgram(TherapyProgramsDTO therapyProgramsDTO) throws Exception;

    boolean updateTherapyProgram(TherapyProgramsDTO therapyProgramsDTO) throws Exception;
}
