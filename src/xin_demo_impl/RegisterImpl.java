package xin_demo_impl;

import xin_demo_imp.RegisterImp;

public class RegisterImpl implements RegisterImp
{

	@Override
	public void register(String name, String pwd)
	{
		System.out.println("name = " + name + " pwd = " + pwd);
		
	}

}
