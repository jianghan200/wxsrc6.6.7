package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private String bKg = "";
  public int bWA = -1;
  String bgn = "";
  public String csD = "";
  public String dHL = "";
  public int dHO = 0;
  public String dia = "";
  String eJA = "";
  String eJB = "";
  public String eJC = "";
  public int eJD = 0;
  public byte[] eJE;
  public int eJF;
  public String eJG = "";
  public int eJH = 0;
  public String eJI = "";
  public String eJJ = "";
  public String eJK = "";
  int eJL = 0;
  public String eJM = "";
  int eJN = 0;
  int eJO = 0;
  String eJP = "";
  public String eJQ = "";
  String eJR = "";
  int eJS = -1;
  String eJT = "";
  long eJU = -1L;
  int eJV = -1;
  String eJW = "";
  String eJX = "";
  String eJY = "";
  public long eJZ = 0L;
  public String eJw = "";
  long eJx = 0L;
  public String eJy = "";
  public String eJz = "";
  private int id = 0;
  public int status = 0;
  public int type = 0;
  public String username = "";
  
  private byte[] Xg()
  {
    try
    {
      Object localObject = new u();
      ((u)localObject).chE();
      ((u)localObject).Wj(this.eJG);
      ((u)localObject).CZ(this.eJH);
      ((u)localObject).Wj(this.eJI);
      ((u)localObject).Wj(this.eJJ);
      ((u)localObject).Wj(this.eJK);
      ((u)localObject).CZ(this.eJL);
      ((u)localObject).Wj(this.eJM);
      ((u)localObject).CZ(this.eJN);
      ((u)localObject).CZ(this.eJO);
      ((u)localObject).Wj(this.eJP);
      ((u)localObject).Wj(this.eJQ);
      ((u)localObject).Wj(this.eJR);
      ((u)localObject).CZ(this.eJS);
      ((u)localObject).Wj(this.eJT);
      ((u)localObject).fX(this.eJU);
      ((u)localObject).CZ(this.eJV);
      ((u)localObject).Wj(this.eJW);
      ((u)localObject).Wj(this.eJX);
      ((u)localObject).Wj(this.eJY);
      ((u)localObject).fX(this.eJZ);
      localObject = ((u)localObject).chF();
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.AddrUpload", localException, "", new Object[0]);
    }
    return null;
  }
  
  public static int pn(String paramString)
  {
    try
    {
      int i = bi.WM("0x" + paramString.substring(0, 8));
      return i;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.AddrUpload", localException, "md5: %s", new Object[] { paramString });
    }
    return 0;
  }
  
  public final int AY()
  {
    int i = 32;
    int j;
    if (!bi.oW(Xk()))
    {
      i = Xk().charAt(0);
      if ((i < 97) || (i > 122)) {
        break label64;
      }
      j = (char)(i - 32);
    }
    label64:
    do
    {
      return j;
      if (bi.oW(Xl())) {
        break;
      }
      i = Xl().charAt(0);
      break;
      if (i < 65) {
        break label78;
      }
      j = i;
    } while (i <= 90);
    label78:
    return 123;
  }
  
  public final String Xh()
  {
    if (this.bKg == null) {
      return "";
    }
    return this.bKg;
  }
  
  public final String Xi()
  {
    if (this.eJw == null) {
      return "";
    }
    return this.eJw;
  }
  
  public final String Xj()
  {
    if (this.dia == null) {
      return "";
    }
    return this.dia;
  }
  
  public final String Xk()
  {
    if (this.eJy == null) {
      return "";
    }
    return this.eJy;
  }
  
  public final String Xl()
  {
    if (this.eJz == null) {
      return "";
    }
    return this.eJz;
  }
  
  public final String Xm()
  {
    if (this.bgn == null) {
      return "";
    }
    return this.bgn;
  }
  
  public final String Xn()
  {
    if (this.eJA == null) {
      return "";
    }
    return this.eJA;
  }
  
  public final String Xo()
  {
    if (this.eJB == null) {
      return "";
    }
    return this.eJB;
  }
  
  public final String Xp()
  {
    if (this.eJC == null) {
      return "";
    }
    return this.eJC;
  }
  
  public final String Xq()
  {
    if (this.csD == null) {
      return "";
    }
    return this.csD;
  }
  
  public final void Xr()
  {
    this.eJD |= 0x1;
  }
  
  public final boolean Xs()
  {
    return (this.eJD & 0x1) == 0;
  }
  
  public final void d(Cursor paramCursor)
  {
    po(paramCursor.getString(1));
    this.eJw = paramCursor.getString(2);
    this.eJx = paramCursor.getLong(3);
    this.dia = paramCursor.getString(4);
    this.eJy = paramCursor.getString(5);
    this.eJz = paramCursor.getString(6);
    this.username = paramCursor.getString(7);
    this.bgn = paramCursor.getString(8);
    this.eJA = paramCursor.getString(9);
    this.eJB = paramCursor.getString(10);
    this.type = paramCursor.getInt(11);
    this.eJC = paramCursor.getString(12);
    this.csD = paramCursor.getString(13);
    int i = paramCursor.getInt(14);
    byte[] arrayOfByte;
    if (i == 65536)
    {
      this.status = 0;
      this.eJD = paramCursor.getInt(17);
      this.dHL = paramCursor.getString(15);
      this.dHO = paramCursor.getInt(18);
      this.eJE = paramCursor.getBlob(19);
      if (!bi.bC(this.eJE)) {
        arrayOfByte = this.eJE;
      }
    }
    for (;;)
    {
      try
      {
        localu = new u();
        i = localu.by(arrayOfByte);
        if (i == 0) {
          continue;
        }
        x.e("MicroMsg.AddrUpload", "parse LVBuffer error:" + i);
      }
      catch (Exception localException)
      {
        u localu;
        x.printErrStackTrace("MicroMsg.AddrUpload", localException, "", new Object[0]);
        continue;
      }
      this.eJF = paramCursor.getInt(20);
      return;
      this.status = i;
      break;
      this.eJG = localu.getString();
      this.eJH = localu.getInt();
      this.eJI = localu.getString();
      this.eJJ = localu.getString();
      this.eJK = localu.getString();
      this.eJL = localu.getInt();
      this.eJM = localu.getString();
      this.eJN = localu.getInt();
      this.eJO = localu.getInt();
      this.eJP = localu.getString();
      this.eJQ = localu.getString();
      this.eJR = localu.getString();
      this.eJS = localu.getInt();
      this.eJT = localu.getString();
      this.eJU = localu.getLong();
      this.eJV = localu.getInt();
      this.eJW = localu.getString();
      this.eJX = localu.getString();
      this.eJY = localu.getString();
      this.eJZ = localu.getLong();
    }
  }
  
  public final String getUsername()
  {
    if (this.username == null) {
      return "";
    }
    return this.username;
  }
  
  public final void po(String paramString)
  {
    this.bKg = paramString;
    this.id = pn(paramString);
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("id", Integer.valueOf(this.id));
    }
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("md5", Xh());
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("peopleid", Xi());
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("uploadtime", Long.valueOf(this.eJx));
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("realname", Xj());
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("realnamepyinitial", Xk());
    }
    if ((this.bWA & 0x40) != 0) {
      localContentValues.put("realnamequanpin", Xl());
    }
    if ((this.bWA & 0x80) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.bWA & 0x100) != 0) {
      localContentValues.put("nickname", Xm());
    }
    if ((this.bWA & 0x200) != 0) {
      localContentValues.put("nicknamepyinitial", Xn());
    }
    if ((this.bWA & 0x400) != 0) {
      localContentValues.put("nicknamequanpin", Xo());
    }
    if ((this.bWA & 0x800) != 0) {
      localContentValues.put("type", Integer.valueOf(this.type));
    }
    if ((this.bWA & 0x1000) != 0) {
      localContentValues.put("moblie", Xp());
    }
    if ((this.bWA & 0x2000) != 0) {
      localContentValues.put("email", Xq());
    }
    int i;
    if ((this.bWA & 0x4000) != 0)
    {
      i = this.status;
      if (i != 0) {
        break label476;
      }
      localContentValues.put("status", Integer.valueOf(65536));
    }
    for (;;)
    {
      if ((this.bWA & 0x8000) != 0) {
        localContentValues.put("reserved1", this.dHL);
      }
      if ((this.bWA & 0x20000) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.eJD));
      }
      if ((this.bWA & 0x40000) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.dHO));
      }
      if ((this.bWA & 0x80000) != 0)
      {
        this.eJE = Xg();
        localContentValues.put("lvbuf", this.eJE);
      }
      if ((this.bWA & 0x100000) != 0) {
        localContentValues.put("showhead", Integer.valueOf(this.eJF));
      }
      return localContentValues;
      label476:
      localContentValues.put("status", Integer.valueOf(i));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */