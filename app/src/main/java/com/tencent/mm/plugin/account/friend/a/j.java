package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;

public final class j
{
  int bWA = -1;
  public int csJ = 0;
  public String csK = "";
  public String csL = "";
  public int sex = 0;
  public String signature = "";
  public String username = "";
  
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
      localContentValues.put("sex", Integer.valueOf(this.sex));
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("personalcard", Integer.valueOf(this.csJ));
    }
    if ((this.bWA & 0x8) != 0)
    {
      if (this.csK == null)
      {
        str = "";
        localContentValues.put("province", str);
      }
    }
    else
    {
      if ((this.bWA & 0x10) != 0)
      {
        if (this.csL != null) {
          break label162;
        }
        str = "";
        label118:
        localContentValues.put("city", str);
      }
      if ((this.bWA & 0x20) != 0) {
        if (this.signature != null) {
          break label170;
        }
      }
    }
    label162:
    label170:
    for (String str = "";; str = this.signature)
    {
      localContentValues.put("signature", str);
      return localContentValues;
      str = this.csK;
      break;
      str = this.csL;
      break label118;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */