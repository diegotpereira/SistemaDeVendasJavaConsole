package br.com.java.interfaces;

import java.util.ArrayList;

public interface IController<E> {
    
    void cadastrar(E object);

    ArrayList<E> listar();
}
