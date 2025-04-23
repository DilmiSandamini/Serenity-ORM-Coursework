package lk.ijse.gdse72.serenityormcoursework.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentTM {
    private int paymentId;
    private String date;
    private String time;
    private int programId;
    private int patientId;
    private String amount;
}

