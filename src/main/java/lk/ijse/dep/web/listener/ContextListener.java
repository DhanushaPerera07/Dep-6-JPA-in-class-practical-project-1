/**
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 **/
package lk.ijse.dep.web.listener;

import lk.ijse.dep.web.util.JPAUtil;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@WebListener()
public class ContextListener implements ServletContextListener {
    org.slf4j.Logger logger = LoggerFactory.getLogger(ContextListener.class);

    public ContextListener() {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Session factory is being initialized");
        EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
        sce.getServletContext().setAttribute("emf", emf);

        /* Logger configurations */
        String logFilePath;
        if (JPAUtil.loadDatabaseProperties().getProperty("app.log_dir") != null) {
            logFilePath = JPAUtil.loadDatabaseProperties().getProperty("app.log_dir") + File.separator + "logs" + File.separator +
                    "app-logger.log";
        } else {
            logFilePath = System.getProperty("catalina.home") + File.separator + "logs" + File.separator +
                    "app-logger.log";
        }

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(logFilePath, true);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        
        fileHandler.setLevel(Level.INFO);
        fileHandler.setFormatter(new SimpleFormatter());
        Logger.getLogger("").addHandler(fileHandler);


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        EntityManagerFactory emf = (EntityManagerFactory) sce.getServletContext().getAttribute("emf");
        emf.close();
    }
}
