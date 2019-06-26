package com.hist.js.spi;

import com.hist.js.api.example.ExampleApiConstant;
import com.hist.js.remote.example.ExampleRemote;
import com.hist.js.pojo.example.Users;
import com.hist.js.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"Test","分类:测试类"}, description = "返回单个对象数据")
@RestController
public class UsersSpi implements ExampleRemote {

    @Autowired
    private UserService userService;

    /*
    paramType：表示参数放在哪个地方
    header-->请求参数的获取：@RequestHeader(代码中接收注解)
    query-->请求参数的获取：@RequestParam(代码中接收注解)
    path（用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
    body-->请求参数的获取：@RequestBody(代码中接收注解)
    form（不常用）
    */

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "query")
    @GetMapping(ExampleApiConstant.EXAMPLE_USER)
    public Users getUserById(@RequestParam("id") Integer id) throws Exception {
        if(id==-404){
            throw new Exception("用户id不存在");
        }
        if(id==8){
            Thread.sleep(2000);
        }
        Users user = userService.selectByPrimaryKey(id);
        return user;
    }
}
