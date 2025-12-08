package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser valUser(String uname, String password);

}
