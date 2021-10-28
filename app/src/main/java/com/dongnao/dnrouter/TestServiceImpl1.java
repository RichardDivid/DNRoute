package com.dongnao.dnrouter;

import android.util.Log;

import com.dongnao.base.TestService;
import com.dongnao.router.annotation.Route;

/**
 * @author Lance
 * @date 2018/3/6
 */

@Route(path = "/main/service1")
public class TestServiceImpl1 implements TestService {


    @Override
    public void test() {
        Log.i("Service", "我是app模块测试服务通信1");
    }
}
