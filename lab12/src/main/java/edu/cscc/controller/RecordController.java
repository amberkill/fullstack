package edu.cscc.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.cscc.repository.RecordRepository;



@Controller
public class RecordController {
    @Autowired
    private RecordRepository repository;
    
    @GetMapping("/") 
    public String getRecords(Model model) {
		/* var records = repository.findAll(); */
        model.addAttribute("records",repository.findAll());
        return "records";
    }
    
    @GetMapping("/records/{id}")
    public String getRecordsId(@PathVariable long id, Model model) {
    	var record = repository.findById(id);
    	if (record.isPresent()) {
    		model.addAttribute("record", record.get());
    	}
    	return "redirect:/records";
    }
}

