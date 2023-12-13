package fr.efrei.project;

import fr.efrei.project.domain.entity.Student;
import fr.efrei.project.entrypoint.StudentEntryPoint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class StudentEntryPointTest extends AbstractTest {
    @Autowired
    private StudentEntryPoint studentEntryPoint;

    @Test
    void getItems() {
        assertNotNull(studentEntryPoint.getStudents());
    }

    @Test
    void getItemById() {
        assertNotNull(studentEntryPoint.getStudent(1));
    }

    @Test
    void createItem() {
        var student = new Student();
        student.setId(3);
        student.setAge(10);
        student.setName("test");
        assertNotNull(studentEntryPoint.saveStudent(student));
    }

    @Test
    void updateItem() {
        var student = new Student(1, "test", 10);
        assertNotNull(studentEntryPoint.updateStudent(1, student));
    }

    @Test
    void deleteItem() {
        studentEntryPoint.deleteStudent(1);
        var student = studentEntryPoint.getStudent(1);
        assertNull(student);
    }
}