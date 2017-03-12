package com.dmar.DAO;

import com.dmar.Entity.Student;
import com.dmar.Main;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dima on 3/9/17.
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    private static Map<Integer,Student> studentMap;

    static {

        studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,new Student (1, "amian", "Computer Science"));
        studentMap.put(2,new Student (1, "Ania", "Music"));
        studentMap.put(3,new Student (1, "Mark", "Art"));

    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.studentMap.values();
    }

    @Override
    public Student getStudentById(int id) {
        if(this.studentMap.get(id) != null)
            return this.studentMap.get(id);
        else return null;
    }

    @Override
    public void deleteStudentById(int id) {
            this.studentMap.remove(id);
    }

    @Override
    public void updateStudentById(Student student) {
        Student s = studentMap.get(student.getId());
        s.setId(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        studentMap.put(student.getId(),s);

    }

    @Override
    public void insertStudent(Student student) {
        studentMap.put(student.getId(), student);
    }
}
