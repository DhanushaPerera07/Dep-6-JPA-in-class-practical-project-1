/**
 * MIT License
 * <p>
 * Copyright (c) 2021 Dhanusha Perera
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 **/

/**
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 **/
package lk.ijse.dep.web.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

public class JPAUtil {
    /* Logger */
    private static final Logger logger = LoggerFactory.getLogger(JPAUtil.class);
    /* Load properties file / resource bundle */
    private static Properties properties = loadDatabaseProperties();
    /* build EntityManagerFactory */
    private static final EntityManagerFactory emf = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        /* Setting up DataSource, Apache DBCP */
        // hibernate.connection.datasource
        properties.getProperty("hibernate.dialect");
        properties.put(Environment.DATASOURCE, getDataSource());
        return Persistence.createEntityManagerFactory("dep-6", properties);
    }

    /** This method will expose the EntityManagerFactory instance */
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    private static DataSource getDataSource() {
        /* load properties file */
//        properties = loadDatabaseProperties();

        /* set up Apache DBCP configurations */
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName(properties.getProperty("dbcp.jdbc.driver_class_name"));
        bds.setUrl(properties.getProperty("dbcp.jdbc.url"));
        bds.setUsername(properties.getProperty("dbcp.jdbc.user"));
        bds.setPassword(properties.getProperty("dbcp.jdbc.password"));
        bds.setInitialSize(Integer.parseInt(properties.getProperty("dbcp.initial_size")));
        bds.setMaxTotal(Integer.parseInt(properties.getProperty("dbcp.max_size")));

        return bds;
    }

    public static Properties loadDatabaseProperties() {
        if (properties == null) {
            properties = new Properties();
        }

        try {
            properties.load(JPAUtil.class.getResourceAsStream("/application.properties"));
            return properties;

        } catch (IOException exception) {
            exception.printStackTrace();
            logger.error("failed to load database properties file...!");
            throw new RuntimeException("failed to load database properties file...!", exception);
        }

    }


}
