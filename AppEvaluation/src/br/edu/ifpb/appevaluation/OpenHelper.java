package br.edu.ifpb.appevaluation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Thiago Santos on 26/11/2015.
 */

public class OpenHelper extends SQLiteOpenHelper {
	
	private static final String Nome_BD = "SNCT";	
	private static final int Versao_BD = 1;

	public static final String TB_AVALIACAO = "TB_AVALIACAO";
	public static final String COMENTARIO = "COMENTARIO";
	public static final String NOTA = "NOTA";
	public static final String TITULO_TRABALHO = "TITULO_TRABALHO";
	public static final String NOME_AVALIADOR = "NOME_AVALIADOR";
	public static final String ID = "ID";
	
	public OpenHelper(Context context) {
		super(context, Nome_BD, null, Versao_BD);
	}		

	@Override
	public void onCreate(SQLiteDatabase BD) {
		BD.execSQL(
				" CREATE TABLE " + TB_AVALIACAO + 
				" (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +  
				NOME_AVALIADOR + " TEXT NOT NULL," +
				TITULO_TRABALHO + " TEXT NOT NULL,"+
				NOTA + " TEXT NOT NULL,"+
				COMENTARIO +" TEXT NOT NULL)"
				);
	}

    public void onUpgrade(SQLiteDatabase bd, int arg1, int arg2) {
        bd.execSQL("drop table usuario;");
        onCreate(bd);
    }
}
