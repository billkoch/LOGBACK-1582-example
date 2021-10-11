package logback1582;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class LoggingTest {

  @Test
  void name() {
    log.error("Simulated exception", new RuntimeException("BOOM!"));
  }
}
