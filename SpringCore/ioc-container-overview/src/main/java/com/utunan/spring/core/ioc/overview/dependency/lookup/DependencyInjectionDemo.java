package com.utunan.spring.core.ioc.overview.dependency.lookup;

import com.utunan.spring.core.ioc.overview.dependency.annotation.Super;
import com.utunan.spring.core.ioc.overview.dependency.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 依赖查找
 *
 * 1.通过名称查找
 */
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");

        // 1.通过名称查找

        // User user= (User) beanFactory.getBean("user");
        // System.out.println(user);
        lookupInLazy(beanFactory);
        lookupInRealTime(beanFactory);

        // 2.通过类型查找
        lookupByType(beanFactory);
        lookupCollectionByType(beanFactory);
        // 3.通过注解查找
        lookupByAnnotationType(beanFactory);
    }

    private static  void lookupInLazy(BeanFactory beanFactory){
        ObjectFactory<User> objectFactoryCreatingFactoryBean= (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user=objectFactoryCreatingFactoryBean.getObject();
        System.out.println("延时查找"+user);
    }

    private static  void lookupInRealTime(BeanFactory beanFactory){
         User user= (User) beanFactory.getBean("user");
         System.out.println("实时查找"+user);
    }

    private static  void lookupByType(BeanFactory beanFactory){
        User user=beanFactory.getBean(User.class);
        System.out.println("类型查找"+user);
    }
    private static  void lookupCollectionByType(BeanFactory beanFactory){
        if(beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory= (ListableBeanFactory) beanFactory;
            Map<String,User> users=listableBeanFactory.getBeansOfType(User.class);
            System.out.println(users);
        }
    }


    private static  void lookupByAnnotationType(BeanFactory beanFactory){
        if(beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory= (ListableBeanFactory) beanFactory;
            Map<String,User> users=(Map)listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println(users);
        }
    }
}
