package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;

public final class p
{
  int bWA = -1;
  private int dCV = 0;
  private String dCX = "";
  private String dCY = "";
  public int dLB = 0;
  private int dSJ = 0;
  public int eKy = 0;
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
      localContentValues.put("friendtype", Integer.valueOf(this.eKy));
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("updatetime", Integer.valueOf(this.dLB));
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.dCV));
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.dSJ));
    }
    if ((this.bWA & 0x20) != 0)
    {
      if (this.dCX == null)
      {
        str = "";
        localContentValues.put("reserved3", str);
      }
    }
    else if ((this.bWA & 0x40) != 0) {
      if (this.dCY != null) {
        break label181;
      }
    }
    label181:
    for (String str = "";; str = this.dCY)
    {
      localContentValues.put("reserved4", str);
      return localContentValues;
      str = this.dCX;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */