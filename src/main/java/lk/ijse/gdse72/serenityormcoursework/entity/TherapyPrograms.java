package lk.ijse.gdse72.serenityormcoursework.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TherapyPrograms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ProgramID;
    private String ProgramName;
    private String programDuration;
    private double programFee;
}
