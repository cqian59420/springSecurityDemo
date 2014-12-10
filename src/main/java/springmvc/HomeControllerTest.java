package springmvc;

import org.junit.Test;
import springmvc.model.Splittle;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertSame;

/**
 * Created by Terrance on 2014/12/7 2014/12/7.
 * ${todo} describe
 */
public class HomeControllerTest {
@Test
    public void shouldDisplayRencetSpottles(){
        List<Splittle> exceptedSpittles = asList(new Splittle(),new Splittle(),new Splittle());
        assertSame("home", "homes");
    }
}
