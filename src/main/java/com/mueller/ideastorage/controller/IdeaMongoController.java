package com.mueller.ideastorage.controller;

import com.mueller.ideastorage.document.Idea;
import com.mueller.ideastorage.service.IdeaMongoService;
import com.mueller.ideastorage.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mongo/idea")
public class IdeaMongoController {

    private IdeaMongoService ideaService;

    @Autowired
    public IdeaMongoController(IdeaMongoService ideaService) {
        this.ideaService = ideaService;
    }

    @GetMapping("/list")
    public String getIdeas(Model model) {
        List<Idea> theIdeas = ideaService.findAll();
        System.out.println("Ideas: " + theIdeas);
        model.addAttribute("ideas", theIdeas);
        return "list-ideas";
    }

    @GetMapping("/addForm")
    public String showAddEntryForm(Model model) {
        Idea idea = new Idea("", "headline", "description", new ArrayList<String>(), 0);
        model.addAttribute("idea", idea);
        return "new-idea";
    }

    @PostMapping("/save")
    public String saveIdea(@ModelAttribute("idea") Idea newIdea) {
        ideaService.save(newIdea);
        return "redirect:/idea/list";
    }
}
