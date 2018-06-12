package com.tencent.mm.ar;

import android.content.ContentValues;
import android.database.Cursor;

public final class m
{
  private String bNH = this.id + "_" + this.bPh;
  public int bPh = 0;
  int bWA = -1;
  private String dHL = "";
  private String dHM = "";
  private int dHN = 0;
  private int dHO = 0;
  String ecV = "";
  public int id = 0;
  String name = "";
  int size = 0;
  public int status = 0;
  public int version = 0;
  
  public final String Ql()
  {
    if (this.ecV == null) {
      return "";
    }
    return this.ecV;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.version = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.size = paramCursor.getInt(4);
    this.ecV = paramCursor.getString(5);
    this.status = paramCursor.getInt(6);
    this.dHL = paramCursor.getString(8);
    this.dHM = paramCursor.getString(9);
    this.bPh = paramCursor.getInt(7);
    this.dHO = paramCursor.getInt(11);
    this.id = paramCursor.getInt(1);
    this.dHN = paramCursor.getInt(10);
    this.bNH = paramCursor.getString(0);
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("id", Integer.valueOf(this.id));
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("version", Integer.valueOf(this.version));
    }
    if ((this.bWA & 0x8) != 0)
    {
      if (this.name == null)
      {
        str = "";
        localContentValues.put("name", str);
      }
    }
    else
    {
      if ((this.bWA & 0x10) != 0) {
        localContentValues.put("size", Integer.valueOf(this.size));
      }
      if ((this.bWA & 0x20) != 0) {
        localContentValues.put("packname", Ql());
      }
      if ((this.bWA & 0x40) != 0) {
        localContentValues.put("status", Integer.valueOf(this.status));
      }
      if ((this.bWA & 0x80) != 0) {
        localContentValues.put("type", Integer.valueOf(this.bPh));
      }
      if ((this.bWA & 0x100) != 0)
      {
        if (this.dHL != null) {
          break label327;
        }
        str = "";
        label190:
        localContentValues.put("reserved1", str);
      }
      if ((this.bWA & 0x200) != 0) {
        if (this.dHM != null) {
          break label335;
        }
      }
    }
    label327:
    label335:
    for (String str = "";; str = this.dHM)
    {
      localContentValues.put("reserved2", str);
      if ((this.bWA & 0x400) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.dHN));
      }
      if ((this.bWA & 0x800) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.dHO));
      }
      if ((this.bWA & 0x1) != 0) {
        localContentValues.put("localId", this.id + "_" + this.bPh);
      }
      return localContentValues;
      str = this.name;
      break;
      str = this.dHL;
      break label190;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ar/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */