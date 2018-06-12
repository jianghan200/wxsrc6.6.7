package com.tencent.tmassistantsdk.storage.table;

import android.database.sqlite.SQLiteDatabase;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;

public abstract interface ITableBase
{
  public abstract String createTableSQL();
  
  public abstract void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2);
  
  public abstract String[] getAlterSQL(int paramInt1, int paramInt2);
  
  public abstract SqliteHelper getHelper();
  
  public abstract String tableName();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tmassistantsdk/storage/table/ITableBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */