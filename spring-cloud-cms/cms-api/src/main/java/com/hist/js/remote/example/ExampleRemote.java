package com.hist.js.remote.example;

import com.hist.js.api.example.ExampleApiConstant;
import com.hist.js.pojo.example.Users;
import org.springframework.cloud.openfeign.FeignClient;
import com.hist.js.remote.example.fallback.ExampleRemoteFallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * name 填写服务名称，fallback 为接口调用失败后需要执行的回调函数
 */
@FeignClient(name = ExampleApiConstant.EXAMPLE_SERVER, fallback = ExampleRemoteFallback.class)
public interface ExampleRemote {

    @GetMapping(ExampleApiConstant.EXAMPLE_USER)
    Users getUserById(@RequestParam("id") Integer id) throws Exception;
}
