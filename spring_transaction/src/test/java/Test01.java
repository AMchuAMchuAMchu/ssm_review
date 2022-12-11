import com.itcast.config.CFSpringConfig;
import com.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 15:36:29
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class Test01 {


    @Test
    public void test01(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpringConfig.class);

        UserService bean = ac.getBean(UserService.class);

        bean.transferToF(100);
        String s = LocalDateTime.now().toString();
        bean.recordInfo(100,s);


    }

}
