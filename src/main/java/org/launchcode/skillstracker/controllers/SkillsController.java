package org.launchcode.skillstracker.controllers;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class SkillsController {

    @GetMapping("/")
    //@ResponseBody
    //public String index() {
        String home() {
        return "<h1>Skills Tracker<h1>"
                + "<h2>We have a few skills we would like to learn. Here is the list!<h2>"
                + "<ol>"
                + "<li>Java</li>"
                + "<li>C#</li>"
                + "<li>JavaScript</li>"
                + "</ol>";
    }

    @GetMapping(value = "form")
   // @ResponseBody
    public String formSkills() {
        return "<form method= 'post'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'name' />" +
                "<br>My favorite language:<br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'C#'>C#</option>" +
                "</select><br>" +
                "<input type = 'submit' name = 'Submit' />" +
                "</form>";
    }

    @PostMapping(value = "form")
   // @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String
            secondChoice, @RequestParam String thirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }
}