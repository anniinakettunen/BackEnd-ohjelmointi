package tehtavat.tehtava2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tehtavat.tehtava2.domain.Student;

@Controller
public class StudentController {
    @GetMapping("/student")
    public String studentList(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));
        model.addAttribute("students", students);
        return "studentlist";
    }
}
