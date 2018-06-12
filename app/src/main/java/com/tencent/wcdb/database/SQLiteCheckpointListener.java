package com.tencent.wcdb.database;

public abstract interface SQLiteCheckpointListener
{
  public abstract void onAttach(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void onDetach(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void onWALCommit(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wcdb/database/SQLiteCheckpointListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */