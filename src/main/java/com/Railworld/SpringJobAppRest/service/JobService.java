package com.Railworld.SpringJobAppRest.service;

import com.Railworld.SpringJobAppRest.model.JobPost;
import com.Railworld.SpringJobAppRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public JobPost addJob(JobPost jobPost){
        return jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }

    public JobPost getJob(int id) {
        return jobRepo.getJob(id);
    }

    public void updateJob(JobPost jobPost) {
          jobRepo.updateJob(jobPost);
    }
    public void deleteJob(JobPost jobPost){
        jobRepo.deleteJob(jobPost);
    }
}
