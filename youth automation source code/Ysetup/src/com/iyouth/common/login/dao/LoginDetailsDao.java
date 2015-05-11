/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.login.dao;

import com.iyouth.common.login.vo.LoginDetails;
import com.iyouth.common.login.vo.User;

/**
 *
 * @author sumanta
 */
public interface LoginDetailsDao {

    public User getUserDetails(LoginDetails loginDetails);

    public boolean saveLogOutDetails(User loginDetails);

    public boolean saveLoginDetails(User loginDetails);
}
