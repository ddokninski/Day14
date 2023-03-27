package JUnit;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Slf4j
public class TitleTest extends BaseTest{

    @Test
    @Tag("regression")
    @DisplayName("FILMWEB")
    public void shouldValidateCorrectTitle() {
        String actualTitle = driver.getTitle();
        log.info("Actual title is: " + actualTitle);

        Assertions.assertThat(actualTitle).isEqualTo(System.getProperty("eTitle"));
    }
}
