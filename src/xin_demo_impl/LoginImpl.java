package xin_demo_impl;

import xin_demo_constant.Code;
import xin_demo_imp.LoginImp;

public class LoginImpl implements LoginImp
{

	@Override
	public int login(String name, String pwd)
	{

		if ("xin".equals(name) && "123456".equals(pwd))
		{
			return Code.LOGIN_SUCCESS_CODE;
		} else
		{
			return Code.LOGIN_FAIL_CODE;
		}

	}

}
