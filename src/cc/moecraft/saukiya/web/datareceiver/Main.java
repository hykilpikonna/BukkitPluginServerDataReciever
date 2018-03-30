package cc.moecraft.saukiya.web.datareceiver;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 此类由 Hykilpikonna 在 2018/03/29 创建!
 * Created by Hykilpikonna on 2018/03/29!
 * Github: https://github.com/hykilpikonna
 * QQ/Wechat: admin@moecraft.cc
 */
public class Main implements ServletContextListener
{
    private static Main instance;

    public static Main getInstance()
    {
        return instance;
    }

    private TheDatabase database;

    public static TheDatabase database()
    {
        return getInstance().database;
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0)
    {
        //Notification that the servlet context is about to be shut down.
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0)
    {
        // do all the tasks that you need to perform just after the server starts
        //Notification that the web application initialization process is starting

        instance = this;

        database = new TheDatabase();

        System.out.println(1);
    }
}
