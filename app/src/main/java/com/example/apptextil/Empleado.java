package com.example.apptextil;

import android.widget.RadioGroup;

public class Empleado {
    int codigo;
    String nombre,apellido;
    String categoria;
    int sueldo;
    String msg="";
    public Empleado(int codigo, String nombre, String apellido, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;

    switch (categoria) {
        case "administracion":
            sueldo = 3000;
            break;
        case "prueba":
            sueldo = 4500;
            break;
        case "calidad":
            sueldo = 6000;
            break;
        case "gerencia":
            sueldo =7500;

    }
}String Info(){
    msg= nombre+" "+apellido+", con el codigo "+codigo+", tiene un cargo de "+
            categoria+" cuyo salario es de s/."+sueldo+" soles.";
    return msg;
}
}
