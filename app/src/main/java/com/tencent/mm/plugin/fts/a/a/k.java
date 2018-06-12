package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;

public final class k
{
  public String bWm = "";
  public long dDS = 0L;
  public int jru = 0;
  public String jrv = "";
  public long jsA = 0L;
  public String jsB = "";
  public long jsy = 0L;
  public long jsz = 0L;
  public long timestamp = 0L;
  public int type = 0;
  
  public final void d(Cursor paramCursor)
  {
    this.jsy = paramCursor.getLong(0);
    this.bWm = paramCursor.getString(1);
    this.jsz = paramCursor.getLong(2);
    this.dDS = paramCursor.getLong(3);
    this.jrv = paramCursor.getString(4);
    this.jsA = paramCursor.getLong(5);
    this.type = paramCursor.getInt(6);
    this.jru = paramCursor.getInt(7);
    this.timestamp = paramCursor.getLong(8);
    this.jsB = paramCursor.getString(9);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */