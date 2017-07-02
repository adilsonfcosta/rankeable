/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.dao.CRUDCategoria;
import br.ufpr.rankeable.dao.JdbcCategoriaDao;
import br.ufpr.rankeable.logica.CadastroCategorias;
import br.ufpr.rankeable.logica.GerenciamentoCategorias;
import br.ufpr.rankeable.logica.Navegacao;
import br.ufpr.rankeable.modelo.Categoria;
import br.ufpr.rankeable.modelo.Rankeavel;
import java.util.List;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author helio
 */
@Controller
public class VotacaoController {

    //Navegacao navegacao;  //"setado" por injeção de dependência
    
    public VotacaoController() {
        
    }
    public VotacaoController(Navegacao navegacao) {
        
    }
     
    @RequestMapping("/telaVotacao")
    public String telaVotacao(Model model){
        
       //Rankeavel rankeavel = navegacao.getProximo();
        //model.addAttribute("rankeavel", rankeavel);
        
        CadastroCategorias dbCategoria = new GerenciamentoCategorias();  
      //  CRUDCategoria dbCategoria = new JdbcCategoriaDao();
        //dbCategoria.adiciona(categoria);
        List<Categoria> categorias = dbCategoria.listar();
        model.addAttribute("categorias", categorias );

                //   List<Categoria> categorias = pegaCategorias.getCategorias();
       // model.addAttribute("categorias",categorias);
        
        return "Votacao/tela-principal";
    }
}
