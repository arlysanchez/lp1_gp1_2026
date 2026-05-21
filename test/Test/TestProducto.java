/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.ProductoDaoImpl;
import Interface.IProducto;
import Model.Producto;
import java.util.List;

/**
 *
 * @author LAB 2
 */
public class TestProducto {

    public static IProducto dao = new ProductoDaoImpl();

    public static void main(String[] args) {
          TestProducto t = new TestProducto();
          t.listar();
          //t.insertar();
    }

    public static void listar() {
        List<Producto> lista = dao.lista();
        if (lista != null && !lista.isEmpty()) {
            System.out.println("ID\tNombre\tPrecio\tStock");
            for (Producto p : lista) {
                System.out.println(p.getId_producto()
                        + "\t" + p.getNombre() + "\t$"
                        + p.getPrecio() + "\t"
                        + p.getStock());
            }
        } else {
            System.out.println("no hay data");
        }
    }
    
    public static void insertar(){
        Producto p = new Producto();
        
        p.setNombre("Papas");
        p.setDescripcion("Huayro");
        p.setPrecio(2);
        p.setStock(50);
        p.setImagen("/resources/img/papa.jpg");
        
        boolean result = dao.insertar(p);
        
        if (result) {
            System.out.println("Datos correctos");
        }else{
            System.out.println("DatosIncorrectos");
        }
        
    }
}
