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
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @since : 02/02/2021
 * @since : 02/02/2021
 * @since : 02/02/2021
 **/
/**
 * @author : Dhanusha Perera
 * @since : 02/02/2021
 **/
package lk.ijse.dep.web.business.custom.impl;

import lk.ijse.dep.web.business.custom.CourseBO;
import lk.ijse.dep.web.dao.DAOFactory;
import lk.ijse.dep.web.dao.DAOTypes;
import lk.ijse.dep.web.dao.custom.CourseDAO;
import lk.ijse.dep.web.dto.CourseDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseBOImpl implements CourseBO {

    private CourseDAO courseDAO;
    private EntityManager entityManager;

    public CourseBOImpl() {
        courseDAO = DAOFactory.getInstance().getDAO(DAOTypes.COURSE);
    }

    @Override
    public void setEntityManager(EntityManager entityManager) throws Exception {
        this.entityManager = entityManager;
    }

    @Override
    public void saveCourse(CourseDTO dto) throws Exception {

    }

    @Override
    public void updateCourse(CourseDTO dto) throws Exception {

    }

    @Override
    public void deleteCourse(String code) throws Exception {

    }

    @Override
    public List<CourseDTO> findAllCourses() throws Exception {
        return null;
    }
}
