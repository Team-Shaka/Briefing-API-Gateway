package eureka.api_gateway.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "I'm healthy!!!!!";
    }

    @GetMapping("/")
    public String welcome(){
        return "this is api gateway, I'm health!!";
    }
}
