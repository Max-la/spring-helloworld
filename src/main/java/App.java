import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catBean = (Cat) applicationContext1.getBean("cat");

        Cat catBean1 = (Cat) applicationContext1.getBean("cat");

        boolean sravnit = bean == secondBean;
        boolean sravnit1 = catBean == catBean1;
        System.out.println(sravnit);
        System.out.println(sravnit1);
    }
}