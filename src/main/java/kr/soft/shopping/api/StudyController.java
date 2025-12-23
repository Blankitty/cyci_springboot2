package kr.soft.shopping.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.soft.shopping.dto.CalcDTO;
import kr.soft.shopping.dto.DataDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class StudyController {

    @GetMapping("/test1")
    public String test1() {

        log.info("TEST ACTION");

        return "Hello World";
    }

    // 데이터를 건네는 것부터
    @GetMapping("/data1")
    public void data1(HttpServletRequest request) {
        String data = request.getParameter("text");
        log.info("data: {}",data);

    }

    @GetMapping("/data2")
    public void data2(DataDTO dto) {
        log.info("data: {}", dto.toString());
    }

    @GetMapping("/data3")
    public void data2(CalcDTO calcDTO) {
        log.info("plus: {}", calcDTO.getNum1() + calcDTO.getNum2());
        log.info("plus: {}", calcDTO.getNum1() - calcDTO.getNum2());
    }

    @PostMapping("/post1")
    public void post1(@RequestBody DataDTO dto) {
        log.info("data: {}", dto.toString());
    }

    @GetMapping("res1")
    public DataDTO res1(HttpServletResponse Response, DataDTO dataDTO) {
        log.info("res: {}", dataDTO);

        return dataDTO;
    }
}
