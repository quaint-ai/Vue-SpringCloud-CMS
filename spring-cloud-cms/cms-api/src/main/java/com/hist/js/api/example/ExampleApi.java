package com.hist.js.api.example;

import com.hist.js.pojo.example.Users;
import com.hist.js.remote.example.ExampleRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: ExampleApi
 * @Description:
 * @date: 2019-06-22 21:25
 * @author: quaint
 * @version:
 * @since: JDK 1.8
 */
@RestController
@RequestMapping("api")
public class ExampleApi {

    @Autowired
    ExampleRemote exampleRemote;

    @GetMapping(ExampleApiConstant.EXAMPLE_USER+"/{id}")
    Users getUserById(@PathVariable("id") Integer id) throws Exception{

        return exampleRemote.getUserById(id);
    }

}
