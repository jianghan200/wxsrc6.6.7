package com.tencent.mm.ak;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  public int bWA = -2;
  public long bYu;
  int cGG = 0;
  public int dHI;
  public long dTK;
  public String dTL = "";
  public String dTM = "";
  public String dTN = "";
  public int dTO;
  int dTP;
  private String dTQ = "";
  int dTR;
  public long dTS;
  int dTT;
  public int dTU = 0;
  public String dTV = "";
  int dTW = 1;
  private boolean dTX;
  private boolean dTY;
  private boolean dTZ;
  private boolean dUa;
  private boolean dUb;
  private boolean dUc;
  private boolean dUd;
  private boolean dUe;
  private boolean dUf;
  private boolean dUg;
  private boolean dUh;
  private boolean dUi;
  boolean dUj;
  private boolean dUk;
  boolean dUl;
  private boolean dUm;
  private boolean dUn;
  private boolean dUo;
  private boolean dUp;
  public int offset;
  int source;
  public int status;
  
  public final boolean OM()
  {
    return (this.dHI != 0) && (this.dHI == this.offset);
  }
  
  public final boolean ON()
  {
    return this.dTU > 0;
  }
  
  public final void OO()
  {
    this.dTX = false;
    this.dTY = false;
    this.dTZ = false;
    this.dUa = false;
    this.dUb = false;
    this.dUc = false;
    this.dUd = false;
    this.dUe = false;
    this.dUf = false;
    this.dUg = false;
    this.dUh = false;
    this.dUi = false;
    this.dUj = false;
    this.dUk = false;
    this.dUl = false;
    this.dUm = false;
    this.dUn = false;
    this.dUo = false;
    this.dUp = false;
  }
  
  public final void ax(long paramLong)
  {
    if (this.bYu != paramLong) {
      this.dTY = true;
    }
    this.bYu = paramLong;
  }
  
  public final void bo(long paramLong)
  {
    this.dTS = paramLong;
    this.dUf = true;
  }
  
  public final void bp(long paramLong)
  {
    this.dTK = paramLong;
    this.dTX = true;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.dTK = paramCursor.getInt(0);
    this.bYu = paramCursor.getLong(1);
    this.offset = paramCursor.getInt(2);
    this.dHI = paramCursor.getInt(3);
    this.dTL = paramCursor.getString(4);
    this.dTN = paramCursor.getString(5);
    this.dTR = paramCursor.getInt(6);
    this.dTS = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.dTT = paramCursor.getInt(9);
    this.dTU = paramCursor.getInt(10);
    this.source = paramCursor.getInt(11);
    this.dTV = paramCursor.getString(12);
    this.cGG = paramCursor.getInt(14);
    this.dTW = paramCursor.getInt(15);
    this.dTQ = paramCursor.getString(16);
    this.dTO = paramCursor.getInt(17);
    this.dTM = paramCursor.getString(18);
    this.dTP = paramCursor.getInt(19);
  }
  
  public final void hJ(int paramInt)
  {
    this.dTT = paramInt;
    this.dUh = true;
  }
  
  public final void hK(int paramInt)
  {
    this.dTR = paramInt;
    this.dUe = true;
  }
  
  public final void hL(int paramInt)
  {
    this.dHI = paramInt;
    this.dUa = true;
  }
  
  public final void hM(int paramInt)
  {
    this.dTU = paramInt;
    this.dUi = true;
  }
  
  public final void hN(int paramInt)
  {
    this.dTP = paramInt;
    this.dUp = true;
  }
  
  public final void hO(int paramInt)
  {
    if (this.dTW != paramInt) {
      this.dUm = true;
    }
    this.dTW = paramInt;
  }
  
  public final void hP(int paramInt)
  {
    this.dTO = paramInt;
    this.dUo = true;
  }
  
  public final void lG(String paramString)
  {
    this.dTQ = paramString;
    this.dUn = true;
  }
  
  public final void lH(String paramString)
  {
    this.dTL = paramString;
    this.dUb = true;
  }
  
  public final void lI(String paramString)
  {
    this.dTM = paramString;
    this.dUc = true;
  }
  
  public final void lJ(String paramString)
  {
    this.dTN = paramString;
    this.dUd = true;
  }
  
  public final void lK(String paramString)
  {
    if (((this.dTV == null) && (paramString != null)) || ((this.dTV != null) && (!this.dTV.equals(paramString)))) {
      this.dUk = true;
    }
    this.dTV = paramString;
  }
  
  public final void setOffset(int paramInt)
  {
    int i = 0;
    if (this.offset != paramInt) {
      this.dTZ = true;
    }
    this.offset = paramInt;
    x.e("MicroMsg.Imgfo", "set offset : %d  id:%d total:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.dTS), Integer.valueOf(this.dHI) });
    if (paramInt < this.dHI) {}
    for (paramInt = i;; paramInt = 1)
    {
      hO(paramInt);
      return;
    }
  }
  
  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
    this.dUg = true;
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dTX) {
      localContentValues.put("id", Long.valueOf(this.dTK));
    }
    if (this.dTY) {
      localContentValues.put("msgSvrId", Long.valueOf(this.bYu));
    }
    if (this.dTZ) {
      localContentValues.put("offset", Integer.valueOf(this.offset));
    }
    if (this.dUa) {
      localContentValues.put("totalLen", Integer.valueOf(this.dHI));
    }
    if (this.dUb) {
      localContentValues.put("bigImgPath", this.dTL);
    }
    if (this.dUc) {
      localContentValues.put("midImgPath", this.dTM);
    }
    if (this.dUd) {
      localContentValues.put("thumbImgPath", this.dTN);
    }
    if (this.dUe) {
      localContentValues.put("createtime", Integer.valueOf(this.dTR));
    }
    if (this.dUf) {
      localContentValues.put("msglocalid", Long.valueOf(this.dTS));
    }
    if (this.dUg) {
      localContentValues.put("status", Integer.valueOf(this.status));
    }
    if (this.dUh) {
      localContentValues.put("nettimes", Integer.valueOf(this.dTT));
    }
    if (this.dUi) {
      localContentValues.put("reserved1", Integer.valueOf(this.dTU));
    }
    if (this.dUj) {
      localContentValues.put("reserved2", Integer.valueOf(this.source));
    }
    if (this.dUk) {
      localContentValues.put("reserved3", this.dTV);
    }
    if (this.dUl) {
      localContentValues.put("hashdthumb", Integer.valueOf(this.cGG));
    }
    if (this.dUm) {
      if (this.offset >= this.dHI) {
        break label385;
      }
    }
    label385:
    for (int i = 0;; i = 1)
    {
      localContentValues.put("iscomplete", Integer.valueOf(i));
      if (this.dUn) {
        localContentValues.put("origImgMD5", this.dTQ);
      }
      if (this.dUo) {
        localContentValues.put("compressType", Integer.valueOf(this.dTO));
      }
      if (this.dUp) {
        localContentValues.put("forwardType", Integer.valueOf(this.dTP));
      }
      return localContentValues;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ak/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */