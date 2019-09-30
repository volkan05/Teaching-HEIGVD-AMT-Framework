package ch.heigvd.amt.framework.services;

import ch.heigvd.amt.framework.exceptions.InvalidOperationException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ClockServiceTest {

  @Test
  void itShouldProvideAnAddOperation() throws InvalidOperationException {
    ClockService service = new ClockService();
    String value = service.execute(ClockService.OPERATION_GET_DATE, Arrays.asList());
    Pattern p = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
    Matcher m = p.matcher(value);
    assertTrue(m.matches());
  }
}