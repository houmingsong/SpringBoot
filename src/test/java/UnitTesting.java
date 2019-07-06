import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.entity.UserEntitiy;
import com.lovo.controller.T;
import com.service.IHUserService;
import java.util.List;
import org.junit.Test;
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {T.class})
public class UnitTesting {

	
	@Autowired
	private IHUserService iHUserService;

//	@Test
//	public void show() {	
//		List<MessageEntity> list = messageService.showSql(1);
//		System.out.println(list);
//	}
	
	
	@Test
	public void show() {	
		List<UserEntitiy> list = iHUserService.findAllUser();
		System.out.println(list);
	}
}
