package com.tencent.mm.plugin.masssend.a;

import android.database.Cursor;

public final class a
{
  int bWA = -1;
  public int bxj = 0;
  public long createTime = 0L;
  String dCX = "";
  String dCY = "";
  String ehf = "";
  int enI = 0;
  long enK = 0L;
  public String filename = "";
  String lai = "";
  public String laj = "";
  public int lak = 0;
  public int lal = 0;
  int lam = 0;
  int lan = 0;
  public int lao = 0;
  public int msgType = 0;
  int status = 0;
  public int videoSource = 0;
  
  public final String bcg()
  {
    if (this.ehf == null) {
      return "";
    }
    return this.ehf;
  }
  
  public final String bch()
  {
    if (this.filename == null) {
      return "";
    }
    return this.filename;
  }
  
  public final String bci()
  {
    if (this.lai == null) {
      return "";
    }
    return this.lai;
  }
  
  public final String bcj()
  {
    if (this.laj == null) {
      return "";
    }
    return this.laj;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.ehf = paramCursor.getString(0);
    this.status = paramCursor.getInt(1);
    this.createTime = paramCursor.getLong(2);
    this.enK = paramCursor.getLong(3);
    this.filename = paramCursor.getString(4);
    this.lai = paramCursor.getString(5);
    this.laj = paramCursor.getString(6);
    this.lak = paramCursor.getInt(7);
    this.msgType = paramCursor.getInt(8);
    this.lal = paramCursor.getInt(9);
    this.lam = paramCursor.getInt(10);
    this.bxj = paramCursor.getInt(11);
    this.enI = paramCursor.getInt(12);
    this.lan = paramCursor.getInt(13);
    this.videoSource = paramCursor.getInt(14);
    this.lao = paramCursor.getInt(15);
    this.dCX = paramCursor.getString(16);
    this.dCY = paramCursor.getString(17);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */