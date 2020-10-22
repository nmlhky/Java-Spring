package LogBackTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {
    private final static Logger log = LoggerFactory.getLogger(LogBackTest.class);
    public static void main(String[] args) {
        System.out.println("aa");
        log.info("hello");
        log.debug("hello  maven");
    }
}
