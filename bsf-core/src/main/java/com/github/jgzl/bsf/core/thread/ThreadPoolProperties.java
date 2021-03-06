package com.github.jgzl.bsf.core.thread;

import com.github.jgzl.bsf.core.util.PropertyUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: lihaifeng
 * @version: 2019-07-23 21:54
 **/
@ConfigurationProperties
public class ThreadPoolProperties {
    public static String Prefix="bsf.threadpool.";
    public static int getThreadPoolMaxSize() {
        return PropertyUtils.getPropertyCache("bsf.threadpool.max",500);
    }
    public static int getThreadPoolMinSize() {
        return PropertyUtils.getPropertyCache("bsf.threadpool.min",0);
    }
}
