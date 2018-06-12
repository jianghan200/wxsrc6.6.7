package com.tencent.mm.plugin.qmessage.a;

import android.content.ContentValues;

public final class d
{
  public int bWA = -1;
  int dCV = 0;
  int dHN = 0;
  int dHO = 0;
  int dSJ = 0;
  long eLw = 0L;
  String extInfo = "";
  String mbA = "";
  String mbB = "";
  public int mbv = 0;
  public long mbw = 0L;
  public long mbx = 0L;
  String mby = "";
  String mbz = "";
  public String username = "";
  
  public final String boa()
  {
    if (this.extInfo == null) {
      return "";
    }
    return this.extInfo;
  }
  
  public final String getUsername()
  {
    if (this.username == null) {
      return "";
    }
    return this.username;
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("qq", Long.valueOf(this.eLw));
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("extinfo", boa());
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("needupdate", Integer.valueOf(this.mbv));
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("extupdateseq", Long.valueOf(this.mbw));
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("imgupdateseq", Long.valueOf(this.mbx));
    }
    if ((this.bWA & 0x40) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.dCV));
    }
    if ((this.bWA & 0x80) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.dSJ));
    }
    if ((this.bWA & 0x100) != 0) {
      localContentValues.put("reserved3", Integer.valueOf(this.dHN));
    }
    if ((this.bWA & 0x200) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(this.dHO));
    }
    if ((this.bWA & 0x400) != 0)
    {
      if (this.mby == null)
      {
        str = "";
        localContentValues.put("reserved5", str);
      }
    }
    else
    {
      if ((this.bWA & 0x800) != 0)
      {
        if (this.mbz != null) {
          break label354;
        }
        str = "";
        label281:
        localContentValues.put("reserved6", str);
      }
      if ((this.bWA & 0x1000) != 0)
      {
        if (this.mbA != null) {
          break label362;
        }
        str = "";
        label309:
        localContentValues.put("reserved7", str);
      }
      if ((this.bWA & 0x2000) != 0) {
        if (this.mbB != null) {
          break label370;
        }
      }
    }
    label354:
    label362:
    label370:
    for (String str = "";; str = this.mbB)
    {
      localContentValues.put("reserved8", str);
      return localContentValues;
      str = this.mby;
      break;
      str = this.mbz;
      break label281;
      str = this.mbA;
      break label309;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */