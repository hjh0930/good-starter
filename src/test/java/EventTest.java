import com.df.starter.listener.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EventTest extends BaseTest {

    @Autowired
    private UserService userService;
    @Test
    public void EventTest(){
        userService.register("hjh");
    }
}
