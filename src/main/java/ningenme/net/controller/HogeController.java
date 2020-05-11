package ningenme.net.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HogeController {

    @GetMapping("/hoge")
    public String text1() {
        return "text content?????????????????????????";
    }
}