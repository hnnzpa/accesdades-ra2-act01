package accesdades.ra2.act01.accesdades_ra2_act01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accesdades.ra2.act01.accesdades_ra2_act01.model.Student;
import accesdades.ra2.act01.accesdades_ra2_act01.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> llista = studentRepository.findAll();
        return llista;
    }

    @PostMapping("/student/batch")
    public String addStudent(){
        int numReg = studentRepository.save();
        return "S'ha afegit "+numReg+ " alumne";
    }
    
}
