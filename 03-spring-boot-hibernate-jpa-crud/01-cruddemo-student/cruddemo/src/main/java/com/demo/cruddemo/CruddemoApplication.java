package com.demo.cruddemo;

import com.demo.cruddemo.dao.StudentDAO;
import com.demo.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
			return runner -> {
				//createStudent(studentDAO);
				//createMultipleStudents(studentDAO);
				//readStudent(studentDAO);
				//queryforStudent(studentDAO);
				//queryForStudentsByLastName(studentDAO);
				//updateStudent(studentDAO);
				//deleteStudent(studentDAO);
				//deleteAllStudents(studentDAO);
			};
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul","Doe","Paul@2002");

		System.out.println("saving student object...");
		studentDAO.save(tempStudent);

		System.out.println("saved student.Generated id: "+tempStudent.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO){
		System.out.println("Creating 3 student object...");
		Student tempStudent1 = new Student("Jhon","Doe","Paul@2002");
		Student tempStudent2 = new Student("Brook","Lee","lee@2003");
		Student tempStudent3 = new Student("parker","peter","Parker@2004");

		System.out.println("saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void readStudent(StudentDAO studentDAO){
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("tony","starc","tony@2002");

		System.out.println("saving student object...");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("saved student. generated id: "+theId);

		System.out.println("retrieving student with id: "+ theId);
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Found the student: "+ myStudent);
	}

	private void queryforStudent(StudentDAO studentDAO){
		List<Student> theStudents= studentDAO.findAll();

		for(Student studs: theStudents){
			System.out.println(studs);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO){
		List<Student> theStudents = studentDAO.findByLastName("peter");

		for(Student stud: theStudents){
			System.out.println(stud);
		}
	}

	private void updateStudent(StudentDAO studentDAO){
		 int studentId=1;
		System.out.println("getting student with id: "+studentId);
		Student myStudent =studentDAO.findById(studentId);

		System.out.println("updating student...");
		myStudent.setFirstName("paul");
		studentDAO.update(myStudent);

		System.out.println("updated student: "+myStudent);
	}

	private void deleteStudent(StudentDAO studentDAO){
		int studentId=3;
		System.out.println("deleting student with id: "+ studentId);

		studentDAO.delete(studentId);
	}

	private  void deleteAllStudents(StudentDAO studentDAO){
		System.out.println("deleting all the students");
		int numRowsDeleted=studentDAO.deleteAll();
		System.out.println("Dleted row count: "+ numRowsDeleted);
	}




}
