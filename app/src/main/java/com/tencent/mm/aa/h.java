package com.tencent.mm.aa;

import android.content.ContentValues;

public final class h
{
  int bWA = -1;
  int dHF;
  int dHG;
  String dHH;
  int dHI;
  int dHJ;
  int dHK;
  String dHL;
  String dHM;
  int dHN;
  int dHO;
  String username;
  
  public h()
  {
    reset();
  }
  
  public final String Kv()
  {
    if (this.dHH == null) {
      return "";
    }
    return this.dHH;
  }
  
  public final void reset()
  {
    this.username = "";
    this.dHF = 0;
    this.dHG = 0;
    this.dHH = "";
    this.dHI = 0;
    this.dHJ = 0;
    this.dHK = 0;
    this.dHL = "";
    this.dHM = "";
    this.dHN = 0;
    this.dHO = 0;
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0)
    {
      if (this.username == null)
      {
        str = "";
        localContentValues.put("username", str);
      }
    }
    else
    {
      if ((this.bWA & 0x2) != 0) {
        localContentValues.put("imgwidth", Integer.valueOf(this.dHF));
      }
      if ((this.bWA & 0x4) != 0) {
        localContentValues.put("imgheigth", Integer.valueOf(this.dHG));
      }
      if ((this.bWA & 0x8) != 0) {
        localContentValues.put("imgformat", Kv());
      }
      if ((this.bWA & 0x10) != 0) {
        localContentValues.put("totallen", Integer.valueOf(this.dHI));
      }
      if ((this.bWA & 0x20) != 0) {
        localContentValues.put("startpos", Integer.valueOf(this.dHJ));
      }
      if ((this.bWA & 0x40) != 0) {
        localContentValues.put("headimgtype", Integer.valueOf(this.dHK));
      }
      if ((this.bWA & 0x80) != 0)
      {
        if (this.dHL != null) {
          break label281;
        }
        str = "";
        label188:
        localContentValues.put("reserved1", str);
      }
      if ((this.bWA & 0x100) != 0) {
        if (this.dHM != null) {
          break label289;
        }
      }
    }
    label281:
    label289:
    for (String str = "";; str = this.dHM)
    {
      localContentValues.put("reserved2", str);
      if ((this.bWA & 0x200) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.dHN));
      }
      if ((this.bWA & 0x400) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.dHO));
      }
      return localContentValues;
      str = this.username;
      break;
      str = this.dHL;
      break label188;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */