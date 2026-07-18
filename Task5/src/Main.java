import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

void main() {
    ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    ((ClassPathXmlApplicationContext) container).close();

}