package dataBase;

import entity.JobExperience;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class JobExperienceDao implements JobExperienceDaoInterface {
    private Transaction transaction = null;
    JobExperience jobExperience;

    @Override
    public JobExperience getJobExperienceById(long idJe) {
        jobExperience = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            jobExperience = session.get(JobExperience.class, idJe);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return jobExperience;
    }

    @Override
    public boolean deleteJobExperience(JobExperience jobExperience) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(jobExperience);
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
    public boolean createJobExperience(JobExperience jobExperience) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(jobExperience);
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
    public boolean updateJobExperience(JobExperience jobExperience) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(jobExperience);
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
