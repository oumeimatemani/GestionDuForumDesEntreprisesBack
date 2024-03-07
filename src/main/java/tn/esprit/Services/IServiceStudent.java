package tn.esprit.Services;

import org.springframework.stereotype.Service;
import tn.esprit.Repository.StudentRepository;
import tn.esprit.enties.Student;

import java.time.LocalDate;
import java.util.List;

@Service
public class IServiceStudent implements StudentService {

    private final StudentRepository repo ;

    public IServiceStudent(StudentRepository repo) {
        this.repo = repo;
    }


    @Override
    public Student save(Student s) {
        return repo.save(s);
    }

    @Override
      public List<Student> findAllStudents() {
            return repo.findAllStudents() ;

                 //   List.of(
                 //  new Student(
                 //         "Oumeima",
                     //       "Temani" ,
                       //     LocalDate.now() ,
                         //   "oumeima.temani@gmail.com",
                           // 23 )
          //  );

    }

    @Override
    public Student findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repo.update(s);
    }

    @Override
    public void delete(String email) {
           repo.delete(email);
    }
}
