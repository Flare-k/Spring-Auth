package springSessionTest.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springSessionTest.demo.controller.dto.LoginRequestDTO;
import springSessionTest.demo.exception.LoginFailedException;
import springSessionTest.demo.service.LoginService;

import javax.servlet.http.HttpSession;

import static springSessionTest.demo.core.SecurityConstants.KEY_ROLE;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class LoginController {

    private LoginService loginService;

    @PostMapping
    public String login(HttpSession httpSession, @RequestBody LoginRequestDTO loginRequestDTO) {

        var optionalMember = loginService.login(loginRequestDTO.getEmail(), loginRequestDTO.getPassword());

        if (optionalMember.isPresent()) {
            httpSession.setAttribute(KEY_ROLE, optionalMember.get().getRole().name());
            httpSession.setAttribute("email", optionalMember.get().getEmail());
            httpSession.setMaxInactiveInterval(1800);
        } else {
            throw new LoginFailedException();
        }

        return "ok";
    }
}
