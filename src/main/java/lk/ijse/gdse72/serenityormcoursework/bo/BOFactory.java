package lk.ijse.gdse72.serenityormcoursework.bo;

import lk.ijse.gdse72.serenityormcoursework.bo.custom.impl.PatientsBOImpl;
import lk.ijse.gdse72.serenityormcoursework.bo.custom.impl.TherapyProgramsBOImpl;
import lk.ijse.gdse72.serenityormcoursework.bo.custom.impl.UserBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    public enum BOType {
        USER , THERAPY_PROGRAM , PATIENT , PAYMENT , THERAPIST , APPOINTMENT , THERAPY_SESSION
    }

    public <T> T getBO(BOType boType) {
        switch (boType) {
            case PATIENT:
                return (T) new PatientsBOImpl();
            case THERAPY_PROGRAM:
                return (T) new TherapyProgramsBOImpl();
            case USER:
                return (T) new UserBOImpl();
            default:
                return null;
        }
    }
}
