import org.example.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class APP {
    public static void main(String[] args) {
        // 1.得到 Spring 上下⽂对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        // 2.加载某个 bean
        User user = (User) context.getBean("user");
        user.sayHi("Tianlang");
    }
}
