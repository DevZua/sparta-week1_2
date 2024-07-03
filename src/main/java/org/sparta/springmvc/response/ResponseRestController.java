package org.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class ResponseRestController {

    @RestController
    @RequestMapping("/response/rest")
    public class ResponseController {

        @GetMapping("/json/string")
        public String helloStringJson() {
            return "{\"name\":\"zua\",\"age\":94}";
        }

        @GetMapping("/json/class")
        public Star helloClassJson() {
            return new Star("zua", 94);
        }
    }
}
