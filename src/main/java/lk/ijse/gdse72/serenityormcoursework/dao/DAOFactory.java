package lk.ijse.gdse72.serenityormcoursework.dao;

import lk.ijse.gdse72.serenityormcoursework.dao.custom.impl.PatientDAOImpl;
import lk.ijse.gdse72.serenityormcoursework.dao.custom.impl.TherapyProgramsDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOType {
        USER , THERAPY_PROGRAM , PATIENT
    }

    public SuperDAO getDAO(DAOType daoType) {
        switch (daoType) {
            case PATIENT:
                return new PatientDAOImpl();
            case THERAPY_PROGRAM:
                return new TherapyProgramsDAOImpl();
            default:
                return null;
        }
    }
}
