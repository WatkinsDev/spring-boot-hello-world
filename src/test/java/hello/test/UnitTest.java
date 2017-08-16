package hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hello.Unit;

@SpringBootTest
public class UnitTest {

    @Test
    public void unitExists() throws Exception {
        Unit unit = new Unit();
    }

    @Test
    public void canGetListOfHoldings() throws Exception {
        Unit unit = new Unit();
        assertThat( unit.getHoldings().equals("1 and 2") ); 
    }
}
