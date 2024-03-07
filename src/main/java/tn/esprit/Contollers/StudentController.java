package tn.esprit.Contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Services.StudentService;
import tn.esprit.enties.Student;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/V1/Students")
public class StudentController {

    // autowired : yaani n7b ninjectii e Service f wsst el controller
    @Autowired
    private StudentService service ;

     public StudentController(StudentService service ) {
         this.service = service ;
     }


     @PostMapping
     public  Student save ( @RequestBody Student student ) {
         return  service.save(student) ;
     }

     @GetMapping ("/{email}" )
     public Student findByEmail(@PathVariable String email ) {
         return service.findByEmail(email);
     }
    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents() ;
    }

    @PutMapping
    public Student updateStudent(
            Student student
    ) {
         return service.update(student) ;
    }

    @DeleteMapping("/{email}")
    public void delete ( @PathVariable("email") String email ) {
         service.delete(email);
     }
}
