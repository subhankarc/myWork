package com.iyouth.common.ServletContextListener;

import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

import com.iyouth.common.dao.hibernate.util.YouthConnectionUtil;

public class InitialServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("-------------------------contextInitialized [Enter]-------------------");
        initLog4j();
        System.out.println("-------------------------Int of  Loading Hibernate Configaration-------------------");
        YouthConnectionUtil.getSessionFactory();
        System.out.println("-------------------------ENd of Loading Hibernate Configaration-------------------");
        System.out.println("--------------contextInitialized [Exit------------------------------]");

    }

    public void contextDestroyed(ServletContextEvent arg0) {
        YouthConnectionUtil.getSessionFactory().close();
        System.out.println("---------------contextDestroyed [Enter]----------------");
        LogManager.shutdown();
        System.out.println("-----------------contextDestroyed [Exit]---------------");

    }

    private void initLog4j() {
        URL url = this.getClass().getClassLoader().getResource("/conf/log4j/CustomizationLog4j.xml");
        DOMConfigurator.configure(url);
    }
}
