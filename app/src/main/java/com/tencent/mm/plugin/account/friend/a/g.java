package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;

public final class g
{
  int bWA = -1;
  String bgn = "";
  String cCR = "";
  public long csC = 0L;
  private String csD = "";
  int csJ = 0;
  String csK = "";
  String csL = "";
  String eJA = "";
  String eJB = "";
  String eKa = "";
  int eKb = 0;
  int sex = 0;
  String signature = "";
  public int status = 0;
  private int type = 0;
  String username = "";
  
  public final String Xm()
  {
    if (this.bgn == null) {
      return "";
    }
    return this.bgn;
  }
  
  public final String Xv()
  {
    if (this.eKa == null) {
      return "";
    }
    return this.eKa;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.csC = paramCursor.getLong(0);
    this.eKa = paramCursor.getString(1);
    this.eKb = paramCursor.getInt(2);
    this.status = paramCursor.getInt(3);
    this.username = paramCursor.getString(4);
    this.bgn = paramCursor.getString(5);
    this.eJA = paramCursor.getString(6);
    this.eJB = paramCursor.getString(7);
    this.sex = paramCursor.getInt(8);
    this.csJ = paramCursor.getInt(9);
    this.csK = paramCursor.getString(10);
    this.csL = paramCursor.getString(11);
    this.signature = paramCursor.getString(12);
    this.cCR = paramCursor.getString(13);
    this.type = paramCursor.getInt(14);
    this.csD = paramCursor.getString(15);
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
      localContentValues.put("fbid", Long.valueOf(this.csC));
    }
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("fbname", Xv());
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("fbimgkey", Integer.valueOf(this.eKb));
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("status", Integer.valueOf(this.status));
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("nickname", Xm());
    }
    if ((this.bWA & 0x40) != 0)
    {
      if (this.eJA == null)
      {
        str = "";
        localContentValues.put("nicknamepyinitial", str);
      }
    }
    else
    {
      if ((this.bWA & 0x80) != 0)
      {
        if (this.eJB != null) {
          break label410;
        }
        str = "";
        label182:
        localContentValues.put("nicknamequanpin", str);
      }
      if ((this.bWA & 0x100) != 0) {
        localContentValues.put("sex", Integer.valueOf(this.sex));
      }
      if ((this.bWA & 0x200) != 0) {
        localContentValues.put("personalcard", Integer.valueOf(this.csJ));
      }
      if ((this.bWA & 0x400) != 0)
      {
        if (this.csK != null) {
          break label418;
        }
        str = "";
        label258:
        localContentValues.put("province", str);
      }
      if ((this.bWA & 0x800) != 0)
      {
        if (this.csL != null) {
          break label426;
        }
        str = "";
        label286:
        localContentValues.put("city", str);
      }
      if ((this.bWA & 0x1000) != 0)
      {
        if (this.signature != null) {
          break label434;
        }
        str = "";
        label314:
        localContentValues.put("signature", str);
      }
      if ((this.bWA & 0x2000) != 0)
      {
        if (this.cCR != null) {
          break label442;
        }
        str = "";
        label342:
        localContentValues.put("alias", str);
      }
      if ((this.bWA & 0x4000) != 0) {
        localContentValues.put("type", Integer.valueOf(this.type));
      }
      if ((this.bWA & 0x8000) != 0) {
        if (this.csD != null) {
          break label450;
        }
      }
    }
    label410:
    label418:
    label426:
    label434:
    label442:
    label450:
    for (String str = "";; str = this.csD)
    {
      localContentValues.put("email", str);
      return localContentValues;
      str = this.eJA;
      break;
      str = this.eJB;
      break label182;
      str = this.csK;
      break label258;
      str = this.csL;
      break label286;
      str = this.signature;
      break label314;
      str = this.cCR;
      break label342;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */