package springSessionTest.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import springSessionTest.demo.core.Role;
import springSessionTest.demo.exception.CustomAuthenticationException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.rmi.server.ExportException;

import static springSessionTest.demo.core.SecurityConstants.KEY_ROLE;

@Slf4j
@Component
@RequiredArgsConstructor
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws ExportException{
        log.info("preHandle!!");

        if (request.getSession().getAttribute(KEY_ROLE) != null && request.getSession().getAttribute(KEY_ROLE).equals(Role.USER.name())) {
            return true;
        }
        else {
            throw new CustomAuthenticationException();
        }
    }
}
