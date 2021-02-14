package com.nikhilsujith.beetletrackapi.projects.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection="projects")
public class Project {

//    @Id
//    private final UUID _id;
    private String id;
    private String project_name;
    private String project_owner;
    private List<Issue> issues;
    private String start_date;
    private String target_end_date;
    private String actual_end_date;
    private String created_on;
    private String status;

    public Project(
                   String id,
                   String project_name,
                   String project_owner,
                   List<Issue> issues,
                   String start_date,
                   String target_end_date,
                   String actual_end_date,
                   String created_on,
                   String status) {

        this.id = id;
        this.project_name = project_name;
        this.project_owner = project_owner;
        this.issues = issues;
        this.start_date = start_date;
        this.target_end_date = target_end_date;
        this.actual_end_date = actual_end_date;
        this.created_on = created_on;
        this.status = status;
    }

//    public UUID get_id() {
//        return _id;
//    }

    public String getId(){
        return id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_owner() {
        return project_owner;
    }

    public void setProject_owner(String project_owner) {
        this.project_owner = project_owner;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getTarget_end_date() {
        return target_end_date;
    }

    public void setTarget_end_date(String target_end_date) {
        this.target_end_date = target_end_date;
    }

    public String getActual_end_date() {
        return actual_end_date;
    }

    public void setActual_end_date(String actual_end_date) {
        this.actual_end_date = actual_end_date;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
