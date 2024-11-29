package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Pikachu", "Un Pokémon de tipo Eléctrico conocido por sus mejillas que generan electricidad y su carisma en combate. Es la mascota oficial de la franquicia Pokémon."));
        elementos.add(new Elemento("Charizard", "Un Pokémon de tipo Fuego y Volador que tiene forma de dragón. Es conocido por su fuerza en combate y su capacidad de lanzar llamas a temperaturas extremas."));
        elementos.add(new Elemento("Bulbasaur", "Un Pokémon de tipo Planta y Veneno que lleva una semilla en su lomo. Con el tiempo, esta semilla florece, simbolizando su crecimiento."));
        elementos.add(new Elemento("Squirtle", "Un Pokémon de tipo Agua que utiliza su caparazón para protegerse y lanzar poderosos chorros de agua para defenderse."));
        elementos.add(new Elemento("Jigglypuff", "Un Pokémon de tipo Normal y Hada que tiene la habilidad de cantar canciones que hacen dormir a sus oponentes. Su apariencia es redonda y adorable."));
        elementos.add(new Elemento("Gengar", "Un Pokémon de tipo Fantasma y Veneno conocido por su actitud traviesa y sus habilidades para moverse en las sombras."));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
