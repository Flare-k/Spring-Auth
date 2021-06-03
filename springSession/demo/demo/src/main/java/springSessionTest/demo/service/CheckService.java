package springSessionTest.demo.service;

import org.springframework.stereotype.Service;
import springSessionTest.demo.core.CheckDTO;
import springSessionTest.demo.core.CheckUseCase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CheckService implements CheckUseCase {

    @Override
    public Optional<List<CheckDTO>> findAll() {
        return Optional.of(
                Arrays.asList(CheckDTO.builder().name("Kang").phone(123).build(),
                        CheckDTO.builder().name("Yeon").phone(456).build())
        );
    }
}
