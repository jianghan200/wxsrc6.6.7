package com.tencent.mm.ar;

import android.content.ContentValues;
import android.database.Cursor;

public final class a
{
  int bWA = -1;
  private String dHL = "";
  private String dHM = "";
  private int dHN = 0;
  private int dHO = 0;
  public int ecv = 0;
  private String path = "";
  public String username = "";
  
  public final void d(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.ecv = paramCursor.getInt(1);
    this.path = paramCursor.getString(2);
    this.dHL = paramCursor.getString(3);
    this.dHM = paramCursor.getString(4);
    this.dHN = paramCursor.getInt(5);
    this.dHO = paramCursor.getInt(6);
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
      localContentValues.put("bgflag", Integer.valueOf(this.ecv));
    }
    if ((this.bWA & 0x4) != 0)
    {
      if (this.path == null)
      {
        str = "";
        localContentValues.put("path", str);
      }
    }
    else
    {
      if ((this.bWA & 0x8) != 0)
      {
        if (this.dHL != null) {
          break label185;
        }
        str = "";
        label95:
        localContentValues.put("reserved1", str);
      }
      if ((this.bWA & 0x10) != 0) {
        if (this.dHM != null) {
          break label193;
        }
      }
    }
    label185:
    label193:
    for (String str = "";; str = this.dHM)
    {
      localContentValues.put("reserved2", str);
      if ((this.bWA & 0x20) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.dHN));
      }
      if ((this.bWA & 0x40) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.dHO));
      }
      return localContentValues;
      str = this.path;
      break;
      str = this.dHL;
      break label95;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */