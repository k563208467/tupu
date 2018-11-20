package com.cn.szl.tupu.configurer;

import com.cn.szl.tupu.interceptor.LoginInterceptor;
import com.cn.szl.tupu.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    private LoginInterceptor loginInterceptor;
    /**
     * 解决用户有效登陆的验证问题
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
//        // excludePathPatterns 用户排除拦截
//        registry.addInterceptor(new MyInterceptor()).excludePathPatterns("/user/*");
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/");
//        super.addInterceptors(registry);

        InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);
        // 拦截路径
        loginRegistry.addPathPatterns("/**");
        // 排除路径
        loginRegistry.excludePathPatterns("/");
        loginRegistry.excludePathPatterns("/registered");
        loginRegistry.excludePathPatterns("/login");
        loginRegistry.excludePathPatterns("/loginOut");
        loginRegistry.excludePathPatterns("/**/*.css");
        loginRegistry.excludePathPatterns("/**/*.js");
        loginRegistry.excludePathPatterns("/**/*.ico");
        loginRegistry.excludePathPatterns("/**/*.jpg");
        loginRegistry.excludePathPatterns("/**/*.font");


    }

    /**
     * 解决服务器跨域问题
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")
                .allowCredentials(true).maxAge(3600);
    }

//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.removeIf(httpMessageConverter -> httpMessageConverter instanceof MappingJackson2HttpMessageConverter); // 删除MappingJackson2HttpMessageConverter
//        converters.add(new GsonHttpMessageConverter()); // 添加GsonHttpMessageConverter
//    }


//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry){
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        super.addResourceHandlers(registry);
//    }
}


