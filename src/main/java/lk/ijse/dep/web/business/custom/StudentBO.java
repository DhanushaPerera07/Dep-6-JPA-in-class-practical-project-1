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
 * @author : Dhanusha Perera
 * @since : 02/02/2021
 * @since : 02/02/2021
 * @since : 02/02/2021
 * @since : 02/02/2021
 **/
/**
 * @author : Dhanusha Perera
 * @since : 02/02/2021
 **/
package lk.ijse.dep.web.business.custom;


import lk.ijse.dep.web.business.SuperBO;
import lk.ijse.dep.web.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {
    void saveStudent(StudentDTO dto) throws Exception;

    void updateStudent(StudentDTO dto) throws Exception;

    void deleteStudent(String studentId) throws Exception;

    StudentDTO findByStudentId(String studentId) throws Exception;

    List<StudentDTO> findByStudentName(String studentName) throws Exception;

    StudentDTO findByStudentAddress(String studentAddress) throws Exception;

    StudentDTO findByStudentContactNo(String studentContactNo) throws Exception;

    List<StudentDTO> findAllStudents() throws Exception;
}
