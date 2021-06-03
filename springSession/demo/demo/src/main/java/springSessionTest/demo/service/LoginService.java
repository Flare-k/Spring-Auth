package springSessionTest.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springSessionTest.demo.core.LoginUseCase;
import springSessionTest.demo.core.MemberDTO;
import springSessionTest.demo.core.Role;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginUseCase {
    public Optional<MemberDTO> login(String email, String password) {

        //TODO: 로그인 연동

        //로그인 성공했다고 가정하고..
        MemberDTO memberDTO = MemberDTO.builder()
                .userName("jade")
                .email(email)
                .role(Role.USER)
                .build();

        return Optional.ofNullable(memberDTO);
    }
}
