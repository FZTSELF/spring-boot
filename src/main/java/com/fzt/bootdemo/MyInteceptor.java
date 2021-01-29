package com.fzt.bootdemo;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@Component
public class MyInteceptor implements HandlerInterceptor {
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws java.lang.Exception {
       System.out.println("preHandle");
       return true;
   }

   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws java.lang.Exception {
       /* compiled code */
       System.out.println("postHandle");
   }

   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws java.lang.Exception {
       /* compiled code */
       System.out.println("afterCompletion");
   }
}
