package Team6;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LombokTest {
    private String name;
    private int age;

    @Getter @Setter private boolean employed = true;
}
