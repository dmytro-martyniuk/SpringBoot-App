package com.dmar.DAO;

import com.dmar.Entity.Student;

import java.util.Collection;

/**
 * Created by dima on 3/10/17.
 */
public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudentById(Student student);

    void insertStudent(Student student);
}
