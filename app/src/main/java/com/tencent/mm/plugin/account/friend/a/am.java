package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;

public final class am
{
  int bWA = -1;
  int eLo = 0;
  int eLp = 0;
  int eLq = 0;
  int eLr = 0;
  int eLs = 0;
  int eLt = 0;
  String eLu = "";
  String eLv = "";
  
  public final ContentValues XS()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("grouopid", Integer.valueOf(this.eLo));
    }
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("membernum", Integer.valueOf(this.eLp));
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("weixinnum", Integer.valueOf(this.eLq));
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("insert_time", Integer.valueOf(this.eLr));
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("lastupdate_time", Integer.valueOf(this.eLs));
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("needupdate", Integer.valueOf(this.eLt));
    }
    if ((this.bWA & 0x40) != 0) {
      localContentValues.put("updatekey", XT());
    }
    if ((this.bWA & 0x80) != 0) {
      localContentValues.put("groupname", XU());
    }
    return localContentValues;
  }
  
  public final String XT()
  {
    if (this.eLu == null) {
      return "";
    }
    return this.eLu;
  }
  
  public final String XU()
  {
    if (this.eLv == null) {
      return "";
    }
    return this.eLv;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.eLo = paramCursor.getInt(0);
    this.eLp = paramCursor.getInt(1);
    this.eLq = paramCursor.getInt(2);
    this.eLr = paramCursor.getInt(3);
    this.eLs = paramCursor.getInt(4);
    this.eLt = paramCursor.getInt(5);
    this.eLu = paramCursor.getString(6);
    this.eLv = paramCursor.getString(7);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */