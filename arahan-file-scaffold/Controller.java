package {{package}};

import com.example.arahansa.domain.TestDomain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {


    @GetMapping
    public String main(){
        return "test/main";
    }

    @GetMapping("/form")
    public String form(){
        return "test/form";
    }

    @PostMapping("/form")
    public String postForm(TestDomain test){
        return "redirect:test";
    }


}
