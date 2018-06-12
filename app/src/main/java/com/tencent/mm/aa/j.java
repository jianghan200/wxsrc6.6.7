package com.tencent.mm.aa;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.bi;

public final class j
{
  public int bWA = -1;
  public int csA = 0;
  int dHP = 0;
  public String dHQ = "";
  public String dHR = "";
  private int dHS = 0;
  int dHT = 0;
  public String username = "";
  
  public final ContentValues Kw()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("imgflag", Integer.valueOf(this.csA));
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("lastupdatetime", Integer.valueOf(this.dHP));
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("reserved1", Kx());
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("reserved2", Ky());
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("reserved3", Integer.valueOf(this.dHS));
    }
    if ((this.bWA & 0x40) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(this.dHT));
    }
    return localContentValues;
  }
  
  public final String Kx()
  {
    if (this.dHR == null) {
      return "";
    }
    return this.dHR;
  }
  
  public final String Ky()
  {
    if (this.dHQ == null) {
      return "";
    }
    return this.dHQ;
  }
  
  public final void Kz()
  {
    this.dHT = ((int)(bi.VE() / 60L));
    this.bWA |= 0x40;
  }
  
  public final void by(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.dHS = i;
      return;
    }
  }
  
  public final void d(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.csA = paramCursor.getInt(1);
    this.dHP = paramCursor.getInt(2);
    this.dHR = paramCursor.getString(3);
    this.dHQ = paramCursor.getString(4);
    this.dHS = paramCursor.getInt(5);
    this.dHT = paramCursor.getInt(6);
  }
  
  public final String getUsername()
  {
    if (this.username == null) {
      return "";
    }
    return this.username;
  }
  
  public final void kb(String paramString)
  {
    this.dHQ = paramString;
  }
  
  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */