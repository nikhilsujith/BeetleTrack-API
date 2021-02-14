package com.nikhilsujith.beetletrackapi.projects.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Issue {

//    private final UUID _id;
    private String issue_name;
    private String issue_type;
    private String created_date;
    private String due_date;
    private String assigned_to;
    private String assigned_by;
    private String status;

    public Issue(
//                 UUID _id,
                 String issue_name,
                 String issue_type,
                 String created_date,
                 String due_date,
                 String assigned_to,
                 String assigned_by,
                 String status) {

//        this._id = _id;
        this.issue_name = issue_name;
        this.issue_type = issue_type;
        this.created_date = created_date;
        this.due_date = due_date;
        this.assigned_to = assigned_to;
        this.assigned_by = assigned_by;
        this.status = status;
    }

//    public UUID get_id() {
//        return _id;
//    }

    public String getIssue_name() {
        return issue_name;
    }

    public void setIssue_name(String issue_name) {
        this.issue_name = issue_name;
    }

    public String getIssue_type() {
        return issue_type;
    }

    public void setIssue_type(String issue_type) {
        this.issue_type = issue_type;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getAssigned_by() {
        return assigned_by;
    }

    public void setAssigned_by(String assigned_by) {
        this.assigned_by = assigned_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
