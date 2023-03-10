package ma.pfe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationDemarage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationDemarage.class);

    public ApplicationDemarage() {
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemarage.class, new String[0]);
        LOGGER.trace("Start application Log 1");
        LOGGER.debug("Start application Log 2");
        LOGGER.info("Start application Log 3");
        LOGGER.error("Start application Log 4");
        LOGGER.warn("Start application Log 5");
    }
}
