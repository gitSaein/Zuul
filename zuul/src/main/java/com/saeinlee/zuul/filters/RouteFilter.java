package com.saeinlee.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

//요청에 대한 라우팅을 다루는 필터. 리본을 사용하여 동적으로 라우팅할수도 있고, url로 정적 라우팅 할 수도 있다.
public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("using route filter...");
        return null;
    }
}
