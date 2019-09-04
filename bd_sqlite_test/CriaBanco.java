package com.example.bd_sqlite_test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper
{
    private static final String NOME_BANCO = "banco.db";
    private static final String TABELA = "livros";
    private static final String ID = "_id";
    private static final String TITULO = "titulo";
    private static final String AUTOR = "autor";
    private static final String EDITORA = "editora";
    private static final int VERSAO = 1;

    public CriaBanco(Context context)
    {
        super(context, getNomeBanco(), null, getVERSAO());
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String sql = "CREATE TABLE " + TABELA + "(" +
                ID + " integer PRIMARY KEY AUTOINCREMENT, " +
                TITULO + " text, " +
                 AUTOR + " text, " +
                EDITORA + " text)";

        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABELA);
        this.onCreate(sqLiteDatabase);
    }

    public static String getNomeBanco() {
        return NOME_BANCO;
    }

    public static String getTABELA() {
        return TABELA;
    }

    public static String getID() {
        return ID;
    }

    public static String getTITULO() {
        return TITULO;
    }

    public static String getAUTOR() {
        return AUTOR;
    }

    public static String getEDITORA() {
        return EDITORA;
    }

    public static int getVERSAO() {
        return VERSAO;
    }
}
