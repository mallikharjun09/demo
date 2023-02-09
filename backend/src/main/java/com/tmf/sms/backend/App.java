package com.tmf.sms.backend;

import com.tmf.sms.backend.services.UserServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserServices service = new UserServices();
    	service.menu();
    }
}
