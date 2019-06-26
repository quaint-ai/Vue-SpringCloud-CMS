package com.hist.js.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TokenFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE; // 可以在请求被路由之前调用  pre
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER-1; // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;// 是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() {
        // 获取request对象
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        //        获取请求路径，后期可以根据请求路径进行处理转发路径
        //        String newUrl = request.getRequestURL().toString();
        //        输出--> http://localhost/api/user/1
        //        String newUri = request.getRequestURI();
        //        输出--> /api/user/1
        //        System.out.println(newUri+"------------");
        //        ctx.put(FilterConstants.REQUEST_URI_KEY, newUri);

        // 模拟需要token认证权限
        String token = request.getParameter("token");

        if (StringUtils.isNotBlank(token)) {
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(HttpStatus.OK.value());
            ctx.set("isSuccess", true);
            return null;
        } else {
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }

}