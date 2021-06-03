package springSessionTest.demo.core;

import java.util.List;
import java.util.Optional;

public interface CheckUseCase {
    Optional<List<CheckDTO>> findAll();
}
