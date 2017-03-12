package com.dmar.service;

import com.dmar.DAO.StudentDAO;
import com.dmar.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by dima on 3/9/17.
 */
@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents() {
        return this.studentDAO.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDAO.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.studentDAO.deleteStudentById(id);
    }

    public void updateStudentById(Student student) {
        this.studentDAO.updateStudentById(student);
    }

    public void insertStudent(Student student) {
        this.studentDAO.insertStudent(student);
    }
}
