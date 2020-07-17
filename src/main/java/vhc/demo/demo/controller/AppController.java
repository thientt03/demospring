package vhc.demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import vhc.demo.demo.entiti.Lol;
import vhc.demo.demo.service.AppService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class AppController {
    @Autowired
    public AppService appService;

    @RequestMapping("/")
    public String index(Model model){
        List<Lol> lols = appService.getAll();
        model.addAttribute("lols", lols);
        return "index";
    }

    @RequestMapping(value = "add")
    public String add(Model model){
        model.addAttribute("lol", new Lol());
        return "addLol";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(@RequestParam("nonameId") Long nonameId, Model model){
        Optional<Lol> lolEdit = appService.finByUserId(nonameId);
        lolEdit.ifPresent(lol -> model.addAttribute("lol", lol));

        return "editLol";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveUser(Lol lol){
        appService.saveUser(lol);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteUser(@RequestParam("nonameId") Long nonameId, Model model){
        appService.deleteUser(nonameId);
        return "redirect:/";
    }
}
