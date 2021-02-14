package com.nikhilsujith.beetletrackapi.projects.controller;

import com.nikhilsujith.beetletrackapi.projects.model.Project;
import com.nikhilsujith.beetletrackapi.projects.service.BeetleTrackService;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/api/v1/project")
@RestController
public class BeetleTrackController {

//    Inject Service
    BeetleTrackService service;

//    Constructor
    public BeetleTrackController(BeetleTrackService service) {
        this.service = service;
    }

//    Get all projects
    @GetMapping
    public List<Project> getAllProjects(){
        return service.getAllProjects();
    }

//    Get project by ID
    @GetMapping(path = "/byId/{id}")
    public Optional<Project> getProjectById(@PathVariable("id") String id){
        return service.getProjectById(id);
    }

//    Get project by name
    @GetMapping(path = "/byName/{project_name}")
    public Project getProjectByName(@PathVariable String project_name){
        return service.getProjectByName(project_name);
    }

//    Insert new project
    @PostMapping
    public void addNewProject(@NotNull @RequestBody Project project){
        service.addNewProject(project);
    }


}
