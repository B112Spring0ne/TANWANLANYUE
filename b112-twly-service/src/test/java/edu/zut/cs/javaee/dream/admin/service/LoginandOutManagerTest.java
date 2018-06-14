package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.LogInandOut.domain.LoginandLogout;
import edu.zut.cs.javaee.dream.LogInandOut.domain.LoginandLogout;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class LoginandOutManagerTest extends GenericManagerTestCase {

    public LoginandOutManagerTest() {
        super(LoginandLogout.class);
    }

    @Autowired
    LoginandOutManager Manager;

    @Test
    public void testFindByPostcode() {
        String code = "NR74DU";
        List<LoginandLogout> result = this.Manager.findByCode(code);
        List<LoginandLogout> expected = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            LoginandLogout u = new LoginandLogout();
            expected.add(u);
        }
        assertEquals(expected.size(), result.size());

    }

}