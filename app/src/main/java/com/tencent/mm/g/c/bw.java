package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public abstract class bw
  extends c
{
  private static final int cAj;
  private static final int cCC;
  private static final int cCD;
  private static final int cCE;
  private static final int cCF;
  private static final int cCG;
  private static final int cCH;
  private static final int cCI;
  private static final int cCJ;
  private static final int cCK;
  private static final int cCL;
  private static final int cCM;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cpV;
  private static final int cqH;
  private boolean cCA = true;
  private boolean cCB = true;
  public int cCN;
  public int cCO;
  public long cCP;
  private long cCQ;
  public String cCR;
  public String cCS;
  public String cCT;
  private int cCU;
  public int cCV;
  public long cCW;
  public String cCX;
  public String cCY;
  private String cCZ;
  private boolean cCr = true;
  private boolean cCs = true;
  private boolean cCt = true;
  private boolean cCu = true;
  private boolean cCv = true;
  private boolean cCw = true;
  private boolean cCx = true;
  private boolean cCy = true;
  private boolean cCz = true;
  public String cDa;
  public String category;
  public boolean cpN = true;
  private boolean cqo = true;
  private boolean czW = true;
  public byte[] field_authBuf;
  public String field_authKey;
  public String field_brandName;
  public int field_closeStrategy;
  public String field_connProto;
  public int field_connStrategy;
  public String field_deviceID;
  public String field_deviceType;
  public byte[] field_lvbuffer;
  public long field_mac;
  public String field_md5Str;
  public byte[] field_sessionBuf;
  public byte[] field_sessionKey;
  public String field_url;
  public String iconUrl;
  public String jumpUrl;
  
  static
  {
    cCC = "deviceID".hashCode();
    cCD = "brandName".hashCode();
    cAj = "mac".hashCode();
    cCE = "deviceType".hashCode();
    cCF = "connProto".hashCode();
    cCG = "connStrategy".hashCode();
    cCH = "closeStrategy".hashCode();
    cCI = "md5Str".hashCode();
    cCJ = "authKey".hashCode();
    cqH = "url".hashCode();
    cCK = "sessionKey".hashCode();
    cCL = "sessionBuf".hashCode();
    cCM = "authBuf".hashCode();
    cpV = "lvbuffer".hashCode();
  }
  
  public final void aw(long paramLong)
  {
    this.cCW = paramLong;
    this.cpN = true;
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {}
    do
    {
      for (;;)
      {
        return;
        int i = 0;
        int j = arrayOfString.length;
        if (i < j)
        {
          int k = arrayOfString[i].hashCode();
          if (cCC == k)
          {
            this.field_deviceID = paramCursor.getString(i);
            this.cCr = true;
          }
          for (;;)
          {
            i += 1;
            break;
            if (cCD == k) {
              this.field_brandName = paramCursor.getString(i);
            } else if (cAj == k) {
              this.field_mac = paramCursor.getLong(i);
            } else if (cCE == k) {
              this.field_deviceType = paramCursor.getString(i);
            } else if (cCF == k) {
              this.field_connProto = paramCursor.getString(i);
            } else if (cCG == k) {
              this.field_connStrategy = paramCursor.getInt(i);
            } else if (cCH == k) {
              this.field_closeStrategy = paramCursor.getInt(i);
            } else if (cCI == k) {
              this.field_md5Str = paramCursor.getString(i);
            } else if (cCJ == k) {
              this.field_authKey = paramCursor.getString(i);
            } else if (cqH == k) {
              this.field_url = paramCursor.getString(i);
            } else if (cCK == k) {
              this.field_sessionKey = paramCursor.getBlob(i);
            } else if (cCL == k) {
              this.field_sessionBuf = paramCursor.getBlob(i);
            } else if (cCM == k) {
              this.field_authBuf = paramCursor.getBlob(i);
            } else if (cpV == k) {
              this.field_lvbuffer = paramCursor.getBlob(i);
            } else if (ciP == k) {
              this.sKx = paramCursor.getLong(i);
            }
          }
        }
        try
        {
          if ((this.field_lvbuffer != null) && (this.field_lvbuffer.length != 0))
          {
            paramCursor = new u();
            i = paramCursor.by(this.field_lvbuffer);
            if (i != 0)
            {
              x.e("MicroMsg.SDK.BaseHardDeviceInfo", "parse LVBuffer error:" + i);
              return;
            }
          }
        }
        catch (Exception paramCursor)
        {
          x.e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed");
          return;
        }
      }
      if (!paramCursor.chD()) {
        this.cCN = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cCO = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cCP = paramCursor.getLong();
      }
      if (!paramCursor.chD()) {
        this.cCQ = paramCursor.getLong();
      }
      if (!paramCursor.chD()) {
        this.cCR = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.iconUrl = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.jumpUrl = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cCS = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cCT = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.category = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cCU = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cCV = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cCW = paramCursor.getLong();
      }
      if (!paramCursor.chD()) {
        this.cCX = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cCY = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cCZ = paramCursor.getString();
      }
    } while (paramCursor.chD());
    this.cDa = paramCursor.getString();
  }
  
  public final void du(String paramString)
  {
    this.cCR = paramString;
    this.cpN = true;
  }
  
  public final void eh(String paramString)
  {
    this.jumpUrl = paramString;
    this.cpN = true;
  }
  
  public final void ei(String paramString)
  {
    this.cCS = paramString;
    this.cpN = true;
  }
  
  public final void ej(String paramString)
  {
    this.cCT = paramString;
    this.cpN = true;
  }
  
  public final void ek(String paramString)
  {
    this.category = paramString;
    this.cpN = true;
  }
  
  public final void el(String paramString)
  {
    this.cCX = paramString;
    this.cpN = true;
  }
  
  public final void em(String paramString)
  {
    this.cCY = paramString;
    this.cpN = true;
  }
  
  public final void en(String paramString)
  {
    this.cCZ = paramString;
    this.cpN = true;
  }
  
  public final void eo(String paramString)
  {
    this.cDa = paramString;
    this.cpN = true;
  }
  
  public final void fe(int paramInt)
  {
    this.cCU = paramInt;
    this.cpN = true;
  }
  
  public final void ff(int paramInt)
  {
    this.cCV = paramInt;
    this.cpN = true;
  }
  
  public final void setIconUrl(String paramString)
  {
    this.iconUrl = paramString;
    this.cpN = true;
  }
  
  public final ContentValues wH()
  {
    try
    {
      if (this.cpN)
      {
        localObject = new u();
        ((u)localObject).chE();
        ((u)localObject).CZ(this.cCN);
        ((u)localObject).CZ(this.cCO);
        ((u)localObject).fX(this.cCP);
        ((u)localObject).fX(this.cCQ);
        ((u)localObject).Wj(this.cCR);
        ((u)localObject).Wj(this.iconUrl);
        ((u)localObject).Wj(this.jumpUrl);
        ((u)localObject).Wj(this.cCS);
        ((u)localObject).Wj(this.cCT);
        ((u)localObject).Wj(this.category);
        ((u)localObject).CZ(this.cCU);
        ((u)localObject).CZ(this.cCV);
        ((u)localObject).fX(this.cCW);
        ((u)localObject).Wj(this.cCX);
        ((u)localObject).Wj(this.cCY);
        ((u)localObject).Wj(this.cCZ);
        ((u)localObject).Wj(this.cDa);
        this.field_lvbuffer = ((u)localObject).chF();
      }
      Object localObject = new ContentValues();
      if (this.cCr) {
        ((ContentValues)localObject).put("deviceID", this.field_deviceID);
      }
      if (this.cCs) {
        ((ContentValues)localObject).put("brandName", this.field_brandName);
      }
      if (this.czW) {
        ((ContentValues)localObject).put("mac", Long.valueOf(this.field_mac));
      }
      if (this.cCt) {
        ((ContentValues)localObject).put("deviceType", this.field_deviceType);
      }
      if (this.cCu) {
        ((ContentValues)localObject).put("connProto", this.field_connProto);
      }
      if (this.cCv) {
        ((ContentValues)localObject).put("connStrategy", Integer.valueOf(this.field_connStrategy));
      }
      if (this.cCw) {
        ((ContentValues)localObject).put("closeStrategy", Integer.valueOf(this.field_closeStrategy));
      }
      if (this.cCx) {
        ((ContentValues)localObject).put("md5Str", this.field_md5Str);
      }
      if (this.cCy) {
        ((ContentValues)localObject).put("authKey", this.field_authKey);
      }
      if (this.cqo) {
        ((ContentValues)localObject).put("url", this.field_url);
      }
      if (this.cCz) {
        ((ContentValues)localObject).put("sessionKey", this.field_sessionKey);
      }
      if (this.cCA) {
        ((ContentValues)localObject).put("sessionBuf", this.field_sessionBuf);
      }
      if (this.cCB) {
        ((ContentValues)localObject).put("authBuf", this.field_authBuf);
      }
      if (this.cpN) {
        ((ContentValues)localObject).put("lvbuffer", this.field_lvbuffer);
      }
      if (this.sKx > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.sKx));
      }
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */