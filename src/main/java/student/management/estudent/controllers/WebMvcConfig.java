//package student.management.estudent.controllers;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/student/dashboard").setViewName("student/student");
//        registry.addViewController("/teacher/dashboard").setViewName("teacher/teacher");
//    }
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**") // Define the URL pattern to serve resources
//                .addResourceLocations("classpath:/static/"); // Define the location of the static files, corrected to '/static/'
//    }
//
//}
