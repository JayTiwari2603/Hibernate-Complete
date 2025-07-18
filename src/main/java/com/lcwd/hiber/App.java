package com.lcwd.hiber;

import com.lcwd.hiber.util.HibernateUtil;
import org.hibernate.SessionFactory; // ✅ CORRECT

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println("We are going to learn Hibernate tool!!");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
    }
}
