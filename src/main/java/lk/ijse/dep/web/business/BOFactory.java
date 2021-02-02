package lk.ijse.dep.web.business;

import lk.ijse.dep.web.dao.custom.impl.CourseDAOImpl;
import lk.ijse.dep.web.dao.custom.impl.StudentDAOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        return (boFactory == null) ? (boFactory = new BOFactory()) : boFactory;
    }

    public static <T extends SuperBO> T getDAO(BOTypes boType) {
        switch (boType) {
            case COURSE:
                return (T) new CourseDAOImpl();
            case STUDENT:
                return (T) new StudentDAOImpl();
            default:
                return null;
        }
    }
}
