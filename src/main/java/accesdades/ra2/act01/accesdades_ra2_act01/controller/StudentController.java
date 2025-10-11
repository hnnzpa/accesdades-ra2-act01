package accesdades.ra2.act01.accesdades_ra2_act01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public String getStudents() {
        return "Get endpoint";
    }

    @PostMapping("/student/batch")
    public String addStudent(){
        return "Post endpoint";
    }
    
}
