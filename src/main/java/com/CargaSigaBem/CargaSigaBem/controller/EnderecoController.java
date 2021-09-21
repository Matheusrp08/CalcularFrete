package com.CargaSigaBem.CargaSigaBem.controller;

import com.CargaSigaBem.CargaSigaBem.model.EnderecoOrigem;
import com.CargaSigaBem.CargaSigaBem.model.EnderecoOrigem;
import com.CargaSigaBem.CargaSigaBem.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EnderecoController {

  @Autowired
  private EnderecoRepository enderecoRepository;

  @GetMapping("/SigaBem")

  public ModelAndView SigaBem(){
    final ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("SigaBem");

    modelAndView.addObject("SigaBem", new EnderecoOrigem());
    return modelAndView;
  }


  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public EnderecoOrigem adicionar(@RequestBody EnderecoOrigem endereco) {
    return enderecoRepository.save(endereco);
  }
}
