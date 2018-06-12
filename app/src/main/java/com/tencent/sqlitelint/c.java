package com.tencent.sqlitelint;

import android.database.Cursor;

public abstract interface c
{
  public abstract void execSQL(String paramString);
  
  public abstract Cursor rawQuery(String paramString, String... paramVarArgs);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */