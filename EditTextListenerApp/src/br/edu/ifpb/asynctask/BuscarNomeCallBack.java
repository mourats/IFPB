package br.edu.ifpb.asynctask;

import java.util.List;

public interface BuscarNomeCallBack {
    void backBuscarNome(List<String> names);

    void errorBuscarNome(String error);
}
