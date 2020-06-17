package services;

import java.nio.file.OpenOption;
import java.util.Optional;

public interface SandwichService {
    String show(Optional<String[]> openOption);
}
