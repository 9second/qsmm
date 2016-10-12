package moudles.user;

import com.moudles.service.user.UserService;

import javax.annotation.Resource;

/**
 * Created by admin on 2016/10/7.
 */
public class UserTest {
    @Resource(name="userService")
    private UserService userService;

}
