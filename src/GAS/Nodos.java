/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GAS;

import java.util.List;
import javax.swing.tree.TreeNode;

/**
 *
 * @author David
 */
public class Nodos 
{
    List<TreeNode> lista;
    String nombre;
    
    public Nodos(List<TreeNode> lista, String nombre)
    {
        this.lista=lista;
        this.nombre=nombre;
    }
}
