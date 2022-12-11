import com.itcast.config.CFSpringConfig;
import com.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 11:16:53
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class UserServiceTest01 {

    @Test
    public void testSelect(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpringConfig.class);

        UserService bean = ac.getBean(UserService.class);

        bean.selectUser("kirito");




    }

}
