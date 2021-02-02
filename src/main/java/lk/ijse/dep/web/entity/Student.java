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
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 * @since : 01/02/2021
 **/
/**
 * @author : Dhanusha Perera
 * @since : 01/02/2021
 **/
package lk.ijse.dep.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "student")
public class Student implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "student_name")
    private String studentName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "date_of_birth")
    private Date dob;
    private String contact;

    public Student(String studentName, Gender gender, Date dob, String contact) {
        this.studentName = studentName;
        this.gender = gender;
        this.dob = dob;
        this.contact = contact;
    }
}
