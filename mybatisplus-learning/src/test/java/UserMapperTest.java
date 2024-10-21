import com.itheima.mp.MpDemoApplication;
import com.itheima.mp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: Song Laixiong
 * @Create: 2024-10-22
 * @Description:
 */

@SpringBootTest(classes = MpDemoApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelectById() {
        System.out.println(userMapper.selectById(1L));
    }
}
