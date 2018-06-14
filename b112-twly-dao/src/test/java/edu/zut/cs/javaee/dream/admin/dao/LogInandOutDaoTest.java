package edu.zut.cs.javaee.dream.admin.dao;
import edu.zut.cs.javaee.dream.admin.domain.LoginandLogout;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

import static org.junit.Assert.assertEquals;
@SuppressWarnings({ "unused", "rawtypes" })
public class LogInandOutDaoTest extends GenericDaoTestCase {

    @Autowired
    LoginandLogout dao;

    @Test
    public void test() {
        LoginandLogout r = new LoginandLogout();
        r.setUserName("test");
        LoginandLogout test = this.dao.save(r);
        Long id = test.getId();
        LoginandLogout result = this.dao.getOne(id);
        assertEquals(test, result);
        List<LoginandLogout> all = this.dao.findAll();
    }

}
