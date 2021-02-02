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
 * @since : 02/02/2021
 * @since : 02/02/2021
 **/
/**
 * @author : Dhanusha Perera
 * @since : 02/02/2021
 **/
package lk.ijse.dep.web.business.custom.impl;

import lk.ijse.dep.web.business.custom.StudentBO;
import lk.ijse.dep.web.dao.DAOFactory;
import lk.ijse.dep.web.dao.DAOTypes;
import lk.ijse.dep.web.dao.custom.StudentDAO;
import lk.ijse.dep.web.dto.StudentDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    private StudentDAO studentDAO;
    private EntityManager entityManager;

    public StudentBOImpl() {
        studentDAO = DAOFactory.getInstance().getDAO(DAOTypes.STUDENT);
    }

    @Override
    public void setEntityManager(EntityManager entityManager) throws Exception {
        this.entityManager = entityManager;
    }

    @Override
    public void saveStudent(StudentDTO dto) throws Exception {

    }

    @Override
    public void updateStudent(StudentDTO dto) throws Exception {

    }

    @Override
    public void deleteStudent(String customerId) throws Exception {

    }

    @Override
    public StudentDTO findByStudentId(String studentId) throws Exception {
        return null;
    }

    @Override
    public List<StudentDTO> findByStudentName(String studentName) throws Exception {
        return null;
    }

    @Override
    public StudentDTO findByStudentAddress(String studentAddress) throws Exception {
        return null;
    }

    @Override
    public StudentDTO findByStudentContactNo(String studentContactNo) throws Exception {
        return null;
    }

    @Override
    public List<StudentDTO> findAllStudents() throws Exception {
        return null;
    }
}
