package stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        context.getBean(Java.class).getTeachingHours();
        context.getBean(Agile.class).getTeachingHours();
        context.getBean(Selenium.class).getTeachingHours();





    }
}
