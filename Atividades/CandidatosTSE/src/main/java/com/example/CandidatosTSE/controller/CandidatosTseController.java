package com.example.CandidatosTSE.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CandidatosTSE.model.Candidato;
import com.example.CandidatosTSE.service.CandidatosTseService;

/**
 * Controlador da tela única de consulta de candidatos.
 *
 * Um único endpoint (GET /) atende tanto o carregamento inicial da página
 * quanto os filtros, que chegam como parâmetros de query string
 * (?cargo=...&partido=...&texto=...).
 */
@Controller
public class CandidatosTseController {

    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService) {
        this.candidatosTseService = candidatosTseService;
    }

    @GetMapping("/")
    public String index(
            @RequestParam(required = false) String cargo,
            @RequestParam(required = false) String partido,
            @RequestParam(required = false) String texto,
            Model model) {

        List<Candidato> candidatos = candidatosTseService.filtrar(cargo, partido, texto);

        // lista filtrada + total encontrado
        model.addAttribute("candidatos", candidatos);
        model.addAttribute("totalEncontrado", candidatos.size());

        // opções de filtro para popular os <select>
        model.addAttribute("cargos", candidatosTseService.listarCargos());
        model.addAttribute("partidos", candidatosTseService.listarPartidos());

        // valores atualmente selecionados, para o formulário "lembrar" o que
        // o usuário digitou/selecionou (nunca null, para não aparecer na tela)
        model.addAttribute("cargoSelecionado", cargo != null ? cargo : "");
        model.addAttribute("partidoSelecionado", partido != null ? partido : "");
        model.addAttribute("textoSelecionado", texto != null ? texto : "");

        return "index";
    }
}
