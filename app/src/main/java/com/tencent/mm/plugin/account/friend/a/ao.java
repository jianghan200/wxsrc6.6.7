package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;

public final class ao
{
  int bWA = -1;
  String dHL = "";
  String dHM = "";
  public int dHN = 0;
  public int dHO = 0;
  String eLA = "";
  String eLB = "";
  String eLC = "";
  String eLD = "";
  public String eLE = "";
  String eLF = "";
  String eLG = "";
  public long eLw = 0L;
  public int eLx = 0;
  int eLy = 0;
  String eLz = "";
  public String nickname = "";
  public String username = "";
  
  public final ContentValues XV()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("qq", Long.valueOf(this.eLw));
    }
    int i;
    if ((this.bWA & 0x2) != 0)
    {
      i = this.eLx;
      if (i == 0) {
        localContentValues.put("wexinstatus", Integer.valueOf(65536));
      }
    }
    else
    {
      if ((this.bWA & 0x4) != 0) {
        localContentValues.put("groupid", Integer.valueOf(this.eLy));
      }
      if ((this.bWA & 0x8) != 0) {
        localContentValues.put("username", getUsername());
      }
      if ((this.bWA & 0x10) != 0) {
        localContentValues.put("nickname", wO());
      }
      if ((this.bWA & 0x20) != 0)
      {
        if (this.eLz != null) {
          break label390;
        }
        str = "";
        label141:
        localContentValues.put("pyinitial", str);
      }
      if ((this.bWA & 0x40) != 0)
      {
        if (this.eLA != null) {
          break label398;
        }
        str = "";
        label168:
        localContentValues.put("quanpin", str);
      }
      if ((this.bWA & 0x80) != 0) {
        localContentValues.put("qqnickname", XW());
      }
      if ((this.bWA & 0x100) != 0) {
        localContentValues.put("qqpyinitial", XX());
      }
      if ((this.bWA & 0x200) != 0) {
        localContentValues.put("qqquanpin", XY());
      }
      if ((this.bWA & 0x400) != 0) {
        localContentValues.put("qqremark", XZ());
      }
      if ((this.bWA & 0x800) != 0) {
        localContentValues.put("qqremarkpyinitial", Ya());
      }
      if ((this.bWA & 0x1000) != 0) {
        localContentValues.put("qqremarkquanpin", Yb());
      }
      if ((this.bWA & 0x4000) != 0) {
        if (this.dHM != null) {
          break label406;
        }
      }
    }
    label390:
    label398:
    label406:
    for (String str = "";; str = this.dHM)
    {
      localContentValues.put("reserved2", str);
      if ((this.bWA & 0x8000) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.dHN));
      }
      if ((this.bWA & 0x10000) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.dHO));
      }
      return localContentValues;
      localContentValues.put("wexinstatus", Integer.valueOf(i));
      break;
      str = this.eLz;
      break label141;
      str = this.eLA;
      break label168;
    }
  }
  
  public final String XW()
  {
    if (this.eLB == null) {
      return "";
    }
    return this.eLB;
  }
  
  public final String XX()
  {
    if (this.eLC == null) {
      return "";
    }
    return this.eLC;
  }
  
  public final String XY()
  {
    if (this.eLD == null) {
      return "";
    }
    return this.eLD;
  }
  
  public final String XZ()
  {
    if (this.eLE == null) {
      return "";
    }
    return this.eLE;
  }
  
  public final String Ya()
  {
    if (this.eLF == null) {
      return "";
    }
    return this.eLF;
  }
  
  public final String Yb()
  {
    if (this.eLG == null) {
      return "";
    }
    return this.eLG;
  }
  
  public final void Yc()
  {
    this.dHN |= 0x1;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.eLw = paramCursor.getLong(0);
    int i = paramCursor.getInt(1);
    if (i == 65536) {}
    for (this.eLx = 0;; this.eLx = i)
    {
      this.eLy = paramCursor.getInt(2);
      this.username = paramCursor.getString(3);
      this.nickname = paramCursor.getString(4);
      this.eLz = paramCursor.getString(5);
      this.eLA = paramCursor.getString(6);
      this.eLB = paramCursor.getString(7);
      this.eLC = paramCursor.getString(8);
      this.eLD = paramCursor.getString(9);
      this.eLE = paramCursor.getString(10);
      this.eLF = paramCursor.getString(11);
      this.eLG = paramCursor.getString(12);
      this.dHL = paramCursor.getString(13);
      this.dHM = paramCursor.getString(14);
      this.dHN = paramCursor.getInt(15);
      this.dHO = paramCursor.getInt(16);
      return;
    }
  }
  
  public final String getDisplayName()
  {
    if ((XZ() == null) || (XZ().length() <= 0)) {
      return XW();
    }
    return XZ();
  }
  
  public final String getUsername()
  {
    if (this.username == null) {
      return "";
    }
    return this.username;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("groupID\t:").append(this.eLy).append("\n");
    localStringBuilder.append("qq\t:").append(this.eLw).append("\n");
    localStringBuilder.append("username\t:").append(this.username).append("\n");
    localStringBuilder.append("nickname\t:").append(this.nickname).append("\n");
    localStringBuilder.append("wexinStatus\t:").append(this.eLx).append("\n");
    localStringBuilder.append("reserved3\t:").append(this.dHN).append("\n");
    localStringBuilder.append("reserved4\t:").append(this.dHO).append("\n");
    return localStringBuilder.toString();
  }
  
  public final String wO()
  {
    if (this.nickname == null) {
      return "";
    }
    return this.nickname;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */