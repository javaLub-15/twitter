package pl.sda.persistance.dao;

import org.hibernate.Session;
import pl.sda.persistance.HibernateUtil;
import pl.sda.persistance.entities.TbArticle;
import pl.sda.persistance.entities.TbUser;

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
}
