package com.minispotify.controller;

import com.minispotify.model.Cancion;
import com.minispotify.service.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private CancionService cancionService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("canciones", cancionService.listarTodas());
        return "index";
    }

    @GetMapping("/agregar")
    public String mostrarFormularioAgregar(Model model) {
        model.addAttribute("cancion", new Cancion());
        return "formulario";
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute Cancion cancion) {
        cancionService.agregar(cancion);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        model.addAttribute("cancion", cancionService.buscarPorId(id));
        return "formulario";
    }

    @PostMapping("/editar")
    public String editar(@ModelAttribute Cancion cancion) {
        cancionService.editar(cancion);
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        cancionService.eliminar(id);
        return "redirect:/";
    }
}