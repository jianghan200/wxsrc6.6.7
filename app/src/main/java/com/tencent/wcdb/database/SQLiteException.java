package com.tencent.wcdb.database;

import com.tencent.wcdb.SQLException;

public class SQLiteException
  extends SQLException
{
  public SQLiteException() {}
  
  public SQLiteException(String paramString)
  {
    super(paramString);
  }
  
  public SQLiteException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wcdb/database/SQLiteException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */