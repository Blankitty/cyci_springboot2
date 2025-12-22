package kr.soft.shopping.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudyController {

    @GetMapping("/test1")
    public String test1() {

        log.info("TEST ACTION");

        return "Hello World";
    }
}
