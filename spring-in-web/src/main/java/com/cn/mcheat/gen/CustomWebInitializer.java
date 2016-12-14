package com.cn.mcheat.gen;

import com.cn.mcheat.gen.config.RootConfig;
import com.cn.mcheat.gen.config.WebConfig;
import com.cn.mcheat.gen.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by Administrator on 2016/11/9.
 */
public class CustomWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class, WebSecurityConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    /**
     * 自定义servlet的配置
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //super.customizeRegistration(registration);
        registration.setMultipartConfig(new MultipartConfigElement("/upload"));
    }

    /**
     * 配置filter
     * @return
     */
    @Override
    protected Filter[] getServletFilters() {
        return super.getServletFilters();
    }
}
