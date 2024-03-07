package org.iesvdm.jpql;

import jakarta.persistence.*;
import org.iesvdm.jpql.domain.Fabricante;
import org.iesvdm.jpql.domain.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpqlApplicationTests {

    @PersistenceContext
    EntityManager em;

//    Lista el nombre de todos los productos que hay.
//
    @Test
    void test1() {
        TypedQuery<String> query = em.createQuery("select P.nombre from Producto P",
                String.class);

        List<String> list = query.getResultList();
        list.forEach(System.out::println);

    }
//    Lista los nombres y los precios de todos los productos de producto.
    @Test
    void test2() {
        record Tupla(String nombre, Double precio){};
        List<Tupla> list = em.createQuery("""
                                select P.nombre, P.precio 
                                        from Producto P
                                """
                ,Tupla.class).getResultList();

        list.forEach(System.out::println);


    }

    //    Lista los nombres y los precios de todos los productos de producto.
    @Test
    void test3() {


    }


    //    Lista los nombres y los precios de todos los productos de producto.
    @Test
    void test4() {

    }


    @Test
    void test5() {

    }
    //    Lista todas las columnas de la tabla producto.
    @Test
    void test6() {

    }
//    Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
    @Test
    void test7() {


    }

    //    Lista los nombres y los precios de todos los productos de producto, convirtiendo los nombres a mayúscula.
    @Test
    void test8() {

    }
    //    Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a minúscula.
    @Test
    void test9() {


    }
    //    Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en mayúsculas los dos primeros caracteres del nombre del fabricante.
    @Test
    void test10() {


    }

//    Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
    @Test
    void test11() {


    }

    //    Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor del precio para mostrarlo sin ninguna cifra decimal.
    @Test
    void test12() {

    }
    //    Lista los fabricantes que tienen productos.
    @Test
    void test13() {


    }
    //    Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los identificadores que aparecen repetidos.
    @Test
    void test14() {


    }

//    Lista los nombres de los fabricantes ordenados de forma ascendente.
    @Test
    void test15() {


    }
//    Lista los nombres de los fabricantes ordenados de forma descendente.
    @Test
    void test16() {


    }
//    Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente
    @Test
    void test17() {



    }

//    Devuelve una lista con las 5 primeras filas de la tabla fabricante.
    @Test
    void test18() {


    }

//    Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también se debe incluir en la respuesta.
    @Test
    void test19() {

    }
//    Lista el nombre y el precio del producto más barato
    @Test
    void test20() {


    }
//    Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
    @Test
    void test21() {


    }
//    Lista el nombre de todos los productos del fabricante cuyo identificador de fabricante es igual a 2.

    @Test
    void test22() {

    }

    @Test
    void test23() {


    }

//    Lista el nombre de los productos que tienen un precio menor o igual a 120€.s
    @Test
    void test24() {

    }

//    Lista el nombre de los productos que tienen un precio mayor o igual a 400€.
    @Test
    void test25() {

    }
//    Lista productos que no tienen un precio mayor o igual a 400€.
@Test
void test26() {


}

//    Lista todos los productos que tengan un precio entre 80€ y 300€. Sin utilizar el operador BETWEEN.
@Test
void test27() {

}

//    Lista todos los productos que tengan un precio entre 60€ y 200€. Utilizando el operador BETWEEN.
@Test
void test28() {

}

//    Lista todos los productos que tengan un precio mayor que 200€ y que el identificador de fabricante sea igual a 6.
    @Test
    void test29() {

    }

//    Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Sin utilizar el operador IN.
    @Test
    void test30() {

    }

//    Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Utilizando el operador IN.

    @Test
    void test31() {

    }
    //    Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del precio). Cree un alias para la columna que contiene el precio que se llame céntimos.

    @Test
    void test32() {

    }
//    Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.
@Test
void test33() {

}

//    Lista los nombres de los fabricantes cuyo nombre termine por la vocal e.

    @Test
    void test34() {

    }

//    Lista los nombres de los fabricantes cuyo nombre contenga el carácter w.

    @Test
    void test35() {

    }


//    Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres.


    @Test
    void test36() {

    }

//    Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.

    @Test
    void test37() {

    }

//    Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el nombre y tienen un precio inferior a 215 €.
    @Test
    void test38() {

    }
//    Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180€. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente).
@Test
void test39() {

}



}
