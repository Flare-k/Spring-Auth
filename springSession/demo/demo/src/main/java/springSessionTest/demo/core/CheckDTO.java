package springSessionTest.demo.core;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CheckDTO {
    private String name;
    private Integer phone;
}
