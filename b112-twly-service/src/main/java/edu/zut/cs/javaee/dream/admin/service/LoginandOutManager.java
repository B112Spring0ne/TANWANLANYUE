package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.FindPasswd.domain.FindPasswd;
import edu.zut.cs.javaee.dream.Inquire.domain.Inquire;
import edu.zut.cs.javaee.dream.LogInandOut.domain.LoginandLogout;
import edu.zut.cs.javaee.dream.base.service.GenericManager;

import java.util.List;


public interface LoginandOutManager extends GenericManager<LogInandLOut, Long> {
    List<LoginandLogout> findByCode(String code);
}