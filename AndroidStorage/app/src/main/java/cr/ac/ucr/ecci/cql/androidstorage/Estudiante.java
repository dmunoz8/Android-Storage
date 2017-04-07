package cr.ac.ucr.ecci.cql.androidstorage;

/**  * Created by Christian on 2/26/2017.  * Ultima modificacion by Christian on 2/26/2017.  * Esta clase define la clase Estudiente  */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import java.util.Date;

public class Estudiante extends Persona {

    private String carnet;
    private int carreraBase;
    private double promedioPonderado;

    public Estudiante() {
        super();
    }

    public Estudiante(String identificacion, String correo, String nombre, String primerApellido,String segundoApellido, String telefono, String celular, Date fechaNacimiento,                       String tipo, String genero, String carnet, int carreraBase,                       double promedioPonderado) {
        super(identificacion, correo, nombre, primerApellido, segundoApellido, telefono, celular, fechaNacimiento, tipo, genero);
        this.carnet = carnet;
        this.carreraBase = carreraBase;
        this.promedioPonderado = promedioPonderado;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getCarreraBase() {
        return carreraBase;
    }

    public void setCarreraBase(int carreraBase) {
        this.carreraBase = carreraBase;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public Estudiante(Parcel in, String carnet, int carreraBase, double promedioPonderado) {
        super(in);
        this.carnet = carnet;
        this.carreraBase = carreraBase;
        this.promedioPonderado = promedioPonderado;
    }
}
