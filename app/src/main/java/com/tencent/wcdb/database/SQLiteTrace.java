package com.tencent.wcdb.database;

import java.util.List;

public abstract interface SQLiteTrace
{
  public abstract void onConnectionObtained(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong, boolean paramBoolean);
  
  public abstract void onConnectionPoolBusy(SQLiteDatabase paramSQLiteDatabase, String paramString1, List<String> paramList, String paramString2);
  
  public abstract void onDatabaseCorrupted(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void onSQLExecuted(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt, long paramLong);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wcdb/database/SQLiteTrace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */