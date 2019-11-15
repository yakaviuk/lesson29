package dataBase;

import entity.Info;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class InfoDao implements InfoDaoInterface {
    private Transaction transaction = null;
    Info info;

    @Override
    public Info getInfoByUserId(long id) {
        info = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            info = session.get(Info.class, id);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return info;
    }

    @Override
    public boolean deleteInfoById(Info info) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(info);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean createInfo(Info info) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(info);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateInfo(Info info) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(info);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
