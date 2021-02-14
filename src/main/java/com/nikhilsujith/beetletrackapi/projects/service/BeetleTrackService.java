package com.nikhilsujith.beetletrackapi.projects.service;

import com.nikhilsujith.beetletrackapi.projects.dao.BeetleTrackMongoDBRepository;
import com.nikhilsujith.beetletrackapi.projects.model.Project;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BeetleTrackService {
//    Inject Repository
    BeetleTrackMongoDBRepository repository;

//    Constructor
    public BeetleTrackService(BeetleTrackMongoDBRepository repository) {
        this.repository = repository;
    }

//    Get all projects
    public List<Project> getAllProjects(){
        return repository.findAll();
    }

//    Get project by ID
    public Optional<Project> getProjectById(String id){
        return repository.findById(id);
    }

//    Get project by name
    public Project getProjectByName(String project_name){
        System.out.println(repository.findByProjectName(project_name));
        return repository.findByProjectName(project_name);
    }
//    Add New Project
    public void addNewProject(Project project) {
        repository.insert(project);
    }
}