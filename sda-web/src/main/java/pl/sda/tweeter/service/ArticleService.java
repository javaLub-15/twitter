package pl.sda.tweeter.service;

import pl.sda.persistance.dao.ArticleDao;
import pl.sda.persistance.entities.TbUser;

import java.util.List;

public class ArticleService {
    private ArticleDao articleDao = new ArticleDao();

    public void addArticle(TbUser user, String content) {
        articleDao.add(user, content);
    }

    public List getArticles() {
        return articleDao.getArticles();
    }
}
