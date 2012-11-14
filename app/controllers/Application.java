package controllers;

import play.*;
import play.db.jpa.JPA;
import play.mvc.*;
import play.mvc.results.RenderTemplate;

import java.util.*;

import javax.persistence.Parameter;
import javax.persistence.Query;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void form(Formdb obj){
    	    	
    	obj.save();
    	 String hql = "from Formdb";
    	Query query = JPA.em().createQuery(hql);
         List<Formdb>  articles =query.getResultList();
         /* Iterator iterator = articles.iterator();
         Iterator i=(Iterator) iterator.next();
         while(i.hasNext()){
        	 
               
        	 System.out.println( i.next() );
                 //renderTemplate("Application/displaydata.html",iterator.next());
         }
        System.out.println(articles);
    	 List<Formdb> fromele=obj.find("select fname from Formdb").fetch();
         
      
       
         System.out.println(articles.size()); */ 
    	  render(articles); 
    	
    	
    	
    }
    
    

}