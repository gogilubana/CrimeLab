/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimelab.controller;

import com.crimelab.service.AssignmentService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Acer
 */
@Controller
public class FileManagementController {
 
//    private final AssignmentService assignmentService;
//
//    @Autowired
//    public AssignmentController(AssignmentService assignmentService) {
//        this.assignmentService = assignmentService;
//    }

    @RequestMapping(value = "/{division}/FileManagement", method = RequestMethod.GET)
    public String folderAndFileModifications(Model model, @PathVariable String division) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());    
//        model.addAttribute("resultTypes", assignmentService.getResultTypes());
        return "assignment";
    }   
    
    
}
