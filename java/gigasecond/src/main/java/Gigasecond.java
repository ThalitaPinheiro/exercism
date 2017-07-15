import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private final LocalDateTime birthDate;
    private static final long GIGASECOND = 1000000000;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDate = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDate.plusSeconds(GIGASECOND);
    }
}
