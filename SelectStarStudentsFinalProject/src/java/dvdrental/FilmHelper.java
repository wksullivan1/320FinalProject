/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrental;

import org.hibernate.Session;

/**
 *
 * @author Taylor
 */
public class FilmHelper {
    
    Session session = null;

    public FilmHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

}
