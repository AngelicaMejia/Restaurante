package com.example.as.restaurante.utility;


public class Constants {
    public static final String TABLA_NAME_PEDIDO = "pedido";
    public static final String TABLA_FIELD_ID = "id";
    public static final String TABLA_FIELD_DESCRIPCION = "descripcion";
    public static final String TABLA_FIELD_PRECIO = "precio";
    public static final String TABLA_FIELD_CANTIDAD = "cantidad";
    public static final String CREATE_TABLE_PEDIDO =
            "CREATE TABLE " + TABLA_NAME_PEDIDO + " (" +
                TABLA_FIELD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLA_FIELD_DESCRIPCION + " TEXT, " +
                TABLA_FIELD_PRECIO + " INTEGER, " +
                TABLA_FIELD_CANTIDAD + " INTEGER)" ;


}
