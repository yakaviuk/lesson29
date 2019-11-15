package dataBase;

import entity.JobExperience;

public interface JobExperienceDaoInterface {
    JobExperience getJobExperienceById(long idJe);
    boolean deleteJobExperience(JobExperience jobExperience);
    boolean createJobExperience(JobExperience jobExperience);
    boolean updateJobExperience (JobExperience jobExperience);
}
