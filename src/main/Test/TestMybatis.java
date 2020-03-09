import com.qmm.dao.UserMapper;
import com.qmm.dao.impl.LoginImpl;
import com.qmm.entity.User;
import org.junit.Test;

import java.util.List;

public class TestMybatis {

    @Test
    public void TestSelect() {

        UserMapper userMapper = new LoginImpl();
        List list = userMapper.selectAll();

    }


    public void TestInsert() {

        UserMapper userMapper = new LoginImpl();
        User user = new User();
        user.setUsername("qxxmm");
        user.setPassword("778899");
        int result = userMapper.insert(user);

        System.out.println(result);

    }
}
