package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.wcdb.database.SQLiteStatement;

public abstract interface h
{
  public abstract Cursor Cm(String paramString);
  
  public abstract boolean Cn(String paramString);
  
  public abstract void beginTransaction();
  
  public abstract boolean cE(int paramInt1, int paramInt2);
  
  public abstract void commit();
  
  public abstract SQLiteStatement compileStatement(String paramString);
  
  public abstract void execSQL(String paramString);
  
  public abstract void execSQL(String paramString, Object[] paramArrayOfObject);
  
  public abstract boolean inTransaction();
  
  public abstract Cursor rawQuery(String paramString, String[] paramArrayOfString);
  
  public abstract long s(long paramLong1, long paramLong2);
  
  public abstract void t(long paramLong1, long paramLong2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */