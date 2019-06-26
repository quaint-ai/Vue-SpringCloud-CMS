package com.hist.js.remote.example.fallback;

import com.hist.js.remote.example.ExampleRemote;
import com.hist.js.pojo.example.Users;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ExampleApiFallback
 * @Description:
 * @date: 2019-06-22 19:53
 * @author: quaint
 * @version:
 * @since: JDK 1.8
 */
@Component
public class ExampleRemoteFallback implements ExampleRemote {

    @Override
    public Users getUserById(Integer id) throws Exception {
        Users user = new Users(-500,"发成错误，进行回调");
        user.setUserName("回调");
        return user;
    }
}
