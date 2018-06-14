package edu.zut.cs.javaee.dream.admin.service.impl;

import edu.zut.cs.javaee.dream.LogInandOut.domain.LoginandLogout;
import edu.zut.cs.javaee.dream.admin.service.LoginandOutManager;
import edu.zut.cs.javaee.dream.LogInandOut.domain.LoginandLogout;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class LoginandOutManagerImpl extends GenericManagerImpl<LoginandLogout, Long> implements LoginandOutManager {
    @Override
    public List<LoginandLogout> findByCode(String postCode) {
        List<LoginandLogout> result = new ArrayList<LoginandLogout>();
        for (int i = 0; i < 10; i++) {
            LoginandLogout u = new LoginandLogout();
            result.add(u);
        }
        return result;
    }
}
