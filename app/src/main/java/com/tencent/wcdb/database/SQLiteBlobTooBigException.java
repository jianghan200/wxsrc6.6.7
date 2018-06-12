package com.tencent.wcdb.database;

public class SQLiteBlobTooBigException
  extends SQLiteException
{
  public SQLiteBlobTooBigException() {}
  
  public SQLiteBlobTooBigException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wcdb/database/SQLiteBlobTooBigException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */