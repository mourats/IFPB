package br.edu.ifpb.appevaluation;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;


/**
 * Created by Thiago Santos on 26/11/2015.
 */

public class BancoDeDadosDao {

	private SQLiteDatabase bd;
	
	public BancoDeDadosDao(Context context) {
        OpenHelper auxBd = new OpenHelper(context);
        bd = auxBd.getWritableDatabase();
	}



	
	
	
	public void inserir(BancoDeDados avaliacao){
		
		ContentValues valor = new ContentValues();
		
		valor.put("NOME_AVALIADOR",avaliacao.getNOME_AVALIADOR());
		
		valor.put("TITULO_TRABALHO",avaliacao.getTITULO_TRABALHO());
		
		valor.put("ID",avaliacao.getID());
		
		valor.put("NOTA",avaliacao.getNOTA());
		
		valor.put("COMENTARIO",avaliacao.getCOMENTARIO());
		
		bd.insert("TB_AVALIACAO", null, valor);
		
		bd.close();
		
	}
	
	
    public int buscar(){
        String[] colunas = new String[]{"_id"};
        Cursor cursor = bd.query("TB_AVALIACAO", colunas, null, null, null, null, "_id");
        int tam = cursor.getCount();
        return tam;
    }
}

