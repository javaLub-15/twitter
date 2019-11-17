package pl.sda.persistance.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.sda.persistance.HibernateUtil;
import pl.sda.persistance.entities.TbArticle;
import pl.sda.persistance.entities.TbUser;

import java.util.List;

public class ArticleDao {

    public void add(TbUser user, String content) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.beginTransaction();
            TbArticle tbArticle = new TbArticle();
            tbArticle.setContent(content);
            tbArticle.setUser(user);
            session.save(tbArticle);
            session.getTransaction().commit();
        }
    }

    public List getArticles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query query = session.createQuery("select o from TbArticle o");
            session.getTransaction().commit();
            return query.getResultList();
        }
    }
}
