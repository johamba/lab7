package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

     void saveStudent(Student student){
        this.studentRepository.save(student);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Transcript transcript = new Transcript("BS Computer Science");
        Classroom classroom = new Classroom("McLaughlin building", "M105");
       Student student1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019,5,24), transcript,classroom);
       saveStudent(student1);
    }

}
