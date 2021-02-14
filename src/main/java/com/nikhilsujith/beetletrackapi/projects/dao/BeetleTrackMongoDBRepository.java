package com.nikhilsujith.beetletrackapi.projects.dao;

import com.nikhilsujith.beetletrackapi.projects.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BeetleTrackMongoDBRepository extends MongoRepository<Project, String> {


    @Query(value="{'project_name':?0}")
    Project findByProjectName(String project_name);
}
