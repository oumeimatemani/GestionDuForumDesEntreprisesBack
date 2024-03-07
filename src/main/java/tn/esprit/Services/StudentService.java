package tn.esprit.Services;

import org.springframework.stereotype.Service;
import tn.esprit.enties.Student;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

     Student save(Student s ) ;
     List<Student> findAllStudents() ;
     Student findByEmail( String email ) ;
     Student update (Student s) ;
     void delete( String email) ;

}
