package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;

public final class bl
{
  int bWA = 135;
  public String name = "";
  int status;
  public a tcr = null;
  public int tcs;
  
  public bl()
  {
    this.tcr = null;
    this.name = "";
    this.status = 0;
    this.tcs = 0;
  }
  
  public bl(String paramString, boolean paramBoolean, int paramInt)
  {
    this.tcr = new a(paramString);
    this.name = paramString;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.status = (i | 0x2);
      this.tcs = paramInt;
      return;
    }
  }
  
  public final boolean cmV()
  {
    return (this.status & 0x2) != 0;
  }
  
  public final void d(Cursor paramCursor)
  {
    if ((this.bWA & 0x2) != 0)
    {
      this.name = paramCursor.getString(1);
      if (this.tcr == null) {
        this.tcr = new a(this.name);
      }
    }
    if ((this.bWA & 0x4) != 0) {
      this.status = paramCursor.getInt(2);
    }
    if ((this.bWA & 0x80) != 0) {
      this.tcs = paramCursor.getInt(7);
    }
  }
  
  public final boolean isEnable()
  {
    return (this.status & 0x1) != 0;
  }
  
  public final void setEnable(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int j = this.status;
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        this.status = (i | j);
        return;
      }
    }
    this.status &= 0xFFFFFFFE;
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("name", this.name);
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("status", Integer.valueOf(this.status));
    }
    if ((this.bWA & 0x80) != 0) {
      localContentValues.put("int_reserved1", Integer.valueOf(this.tcs));
    }
    return localContentValues;
  }
  
  public static final class a
  {
    private String bWJ;
    private String cfx;
    
    public a(String paramString)
    {
      int i = paramString.indexOf("@");
      if (i >= 0)
      {
        this.bWJ = paramString.substring(0, i);
        this.cfx = paramString.substring(i);
        return;
      }
      this.bWJ = paramString;
      this.cfx = "";
    }
    
    public final String Zk(String paramString)
    {
      if (this.cfx != null) {
        paramString = this.cfx;
      }
      return paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */