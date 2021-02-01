package lk.ijse.dep.web.util;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 **/
public class JPAUtilTest {

    @Test
    public void getInstance() {
        System.out.println(JPAUtil.getIEntityManagerFactory());
        assertNotNull(JPAUtil.getIEntityManagerFactory());
    }
}
