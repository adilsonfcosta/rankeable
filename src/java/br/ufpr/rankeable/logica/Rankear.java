/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.modelo.Rankeavel;
import java.util.List;

/**
 *
 * @author cassiele
 */
public interface Rankear {
    
    List<Rankeavel> Top10();
}
