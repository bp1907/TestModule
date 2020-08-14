package com.wanma.base.autoservice;

import java.util.ServiceLoader;

/**
 * author: wanma
 * Date: 2020/8/11
 * Description
 */
public class MyServiceLoader {
    private MyServiceLoader() {
    }

    public static <S> S load(Class<S> service) {
        try{
            return ServiceLoader.load(service).iterator().next();
        }catch (Exception e) {
            return null;
        }
    }
}
