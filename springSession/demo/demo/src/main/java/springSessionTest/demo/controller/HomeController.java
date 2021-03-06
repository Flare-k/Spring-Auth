package springSessionTest.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequestMapping("/api/v1/hello")
public class HomeController {

    @GetMapping
    public String getSession(HttpSession session, HttpServletRequest httpServletRequest) {

        log.info(session.getId());

        return "hello";
    }
}
