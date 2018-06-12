package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public abstract class p
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS appInfo_status_Index ON AppInfo(status)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckP = "appId".hashCode();
  private static final int cld;
  private static final int cmA;
  private static final int cmB;
  private static final int cmf = "appName".hashCode();
  private static final int cmg = "appDiscription".hashCode();
  private static final int cmh = "appIconUrl".hashCode();
  private static final int cmi = "appStoreUrl".hashCode();
  private static final int cmj = "appVersion".hashCode();
  private static final int cmk = "appWatermarkUrl".hashCode();
  private static final int cml = "packageName".hashCode();
  private static final int cmm;
  private static final int cmn;
  private static final int cmo;
  private static final int cmp;
  private static final int cmq;
  private static final int cmr;
  private static final int cms;
  private static final int cmt;
  private static final int cmu;
  private static final int cmv;
  private static final int cmw;
  private static final int cmx;
  private static final int cmy;
  private static final int cmz;
  private boolean ciS = true;
  private boolean ckM = true;
  private boolean cky = true;
  private boolean clI = true;
  private boolean clJ = true;
  private boolean clK = true;
  private boolean clL = true;
  private boolean clM = true;
  private boolean clN = true;
  private boolean clO = true;
  private boolean clP = true;
  private boolean clQ = true;
  private boolean clR = true;
  private boolean clS = true;
  private boolean clT = true;
  private boolean clU = true;
  private boolean clV = true;
  private boolean clW = true;
  private boolean clX = true;
  private boolean clY = true;
  public boolean clZ = true;
  public String cmC;
  public String cmD;
  public String cmE;
  public int cmF;
  public int cmG;
  public String cmH;
  public String cmI;
  public String cmJ;
  public String cmK;
  public String cmL;
  public String cmM;
  public int cmN;
  public String cmO;
  public String cmP;
  public String cmQ;
  public String cmR;
  public String cmS;
  public int cmT;
  public String cmU;
  private int cmV;
  public String cmW;
  public String cmX;
  public String cmY;
  public int cmZ;
  private boolean cma = true;
  private boolean cmb = true;
  private boolean cmc = true;
  private boolean cmd = true;
  private boolean cme = true;
  public String field_appDiscription;
  public String field_appDiscription_en;
  public String field_appDiscription_tw;
  public String field_appIconUrl;
  public String field_appId;
  public int field_appInfoFlag;
  public String field_appName;
  public String field_appName_en;
  public String field_appName_hk;
  public String field_appName_tw;
  public String field_appStoreUrl;
  public long field_appSupportContentType;
  public String field_appType;
  public int field_appVersion;
  public String field_appWatermarkUrl;
  public int field_authFlag;
  public byte[] field_lvbuff;
  public long field_modifyTime;
  public String field_openId;
  public String field_packageName;
  public int field_serviceAppInfoFlag;
  public int field_serviceAppType;
  public int field_serviceShowFlag;
  public String field_signature;
  public int field_status;
  public long field_svrAppSupportContentType;
  
  static
  {
    ciV = "status".hashCode();
    cld = "signature".hashCode();
    cmm = "modifyTime".hashCode();
    cmn = "appName_en".hashCode();
    cmo = "appName_tw".hashCode();
    cmp = "appName_hk".hashCode();
    cmq = "appDiscription_en".hashCode();
    cmr = "appDiscription_tw".hashCode();
    cms = "appType".hashCode();
    cmt = "openId".hashCode();
    cmu = "authFlag".hashCode();
    cmv = "appInfoFlag".hashCode();
    cmw = "lvbuff".hashCode();
    cmx = "serviceAppType".hashCode();
    cmy = "serviceAppInfoFlag".hashCode();
    cmz = "serviceShowFlag".hashCode();
    cmA = "appSupportContentType".hashCode();
    cmB = "svrAppSupportContentType".hashCode();
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
          if (ckP == k)
          {
            this.field_appId = paramCursor.getString(i);
            this.cky = true;
          }
          for (;;)
          {
            i += 1;
            break;
            if (cmf == k) {
              this.field_appName = paramCursor.getString(i);
            } else if (cmg == k) {
              this.field_appDiscription = paramCursor.getString(i);
            } else if (cmh == k) {
              this.field_appIconUrl = paramCursor.getString(i);
            } else if (cmi == k) {
              this.field_appStoreUrl = paramCursor.getString(i);
            } else if (cmj == k) {
              this.field_appVersion = paramCursor.getInt(i);
            } else if (cmk == k) {
              this.field_appWatermarkUrl = paramCursor.getString(i);
            } else if (cml == k) {
              this.field_packageName = paramCursor.getString(i);
            } else if (ciV == k) {
              this.field_status = paramCursor.getInt(i);
            } else if (cld == k) {
              this.field_signature = paramCursor.getString(i);
            } else if (cmm == k) {
              this.field_modifyTime = paramCursor.getLong(i);
            } else if (cmn == k) {
              this.field_appName_en = paramCursor.getString(i);
            } else if (cmo == k) {
              this.field_appName_tw = paramCursor.getString(i);
            } else if (cmp == k) {
              this.field_appName_hk = paramCursor.getString(i);
            } else if (cmq == k) {
              this.field_appDiscription_en = paramCursor.getString(i);
            } else if (cmr == k) {
              this.field_appDiscription_tw = paramCursor.getString(i);
            } else if (cms == k) {
              this.field_appType = paramCursor.getString(i);
            } else if (cmt == k) {
              this.field_openId = paramCursor.getString(i);
            } else if (cmu == k) {
              this.field_authFlag = paramCursor.getInt(i);
            } else if (cmv == k) {
              this.field_appInfoFlag = paramCursor.getInt(i);
            } else if (cmw == k) {
              this.field_lvbuff = paramCursor.getBlob(i);
            } else if (cmx == k) {
              this.field_serviceAppType = paramCursor.getInt(i);
            } else if (cmy == k) {
              this.field_serviceAppInfoFlag = paramCursor.getInt(i);
            } else if (cmz == k) {
              this.field_serviceShowFlag = paramCursor.getInt(i);
            } else if (cmA == k) {
              this.field_appSupportContentType = paramCursor.getLong(i);
            } else if (cmB == k) {
              this.field_svrAppSupportContentType = paramCursor.getLong(i);
            } else if (ciP == k) {
              this.sKx = paramCursor.getLong(i);
            }
          }
        }
        try
        {
          if ((this.field_lvbuff != null) && (this.field_lvbuff.length != 0))
          {
            paramCursor = new u();
            i = paramCursor.by(this.field_lvbuff);
            if (i != 0)
            {
              x.e("MicroMsg.SDK.BaseAppInfo", "parse LVBuffer error:" + i);
              return;
            }
          }
        }
        catch (Exception paramCursor)
        {
          x.e("MicroMsg.SDK.BaseAppInfo", "get value failed");
          return;
        }
      }
      this.cmC = paramCursor.getString();
      this.cmD = paramCursor.getString();
      this.cmE = paramCursor.getString();
      this.cmF = paramCursor.getInt();
      this.cmG = paramCursor.getInt();
      this.cmH = paramCursor.getString();
      this.cmI = paramCursor.getString();
      this.cmJ = paramCursor.getString();
      this.cmK = paramCursor.getString();
      if (!paramCursor.chD()) {
        this.cmL = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmM = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmN = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cmO = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmP = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmQ = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmR = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmS = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmT = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cmU = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmV = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cmW = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmX = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cmY = paramCursor.getString();
      }
    } while (paramCursor.chD());
    this.cmZ = paramCursor.getInt();
  }
  
  public final void dg(String paramString)
  {
    this.cmC = paramString;
    this.clZ = true;
  }
  
  public final void dh(String paramString)
  {
    this.cmD = paramString;
    this.clZ = true;
  }
  
  public final void di(String paramString)
  {
    this.cmE = paramString;
    this.clZ = true;
  }
  
  public final void dj(String paramString)
  {
    this.cmH = paramString;
    this.clZ = true;
  }
  
  public final void dk(String paramString)
  {
    this.cmI = paramString;
    this.clZ = true;
  }
  
  public final void dl(String paramString)
  {
    this.cmJ = paramString;
    this.clZ = true;
  }
  
  public final void dm(String paramString)
  {
    this.cmK = paramString;
    this.clZ = true;
  }
  
  public final void dn(String paramString)
  {
    this.cmL = paramString;
    this.clZ = true;
  }
  
  public final void jdMethod_do(String paramString)
  {
    this.cmM = paramString;
    this.clZ = true;
  }
  
  public final void dp(String paramString)
  {
    this.cmO = paramString;
    this.clZ = true;
  }
  
  public final void dq(String paramString)
  {
    this.cmP = paramString;
    this.clZ = true;
  }
  
  public final void dr(String paramString)
  {
    this.cmQ = paramString;
    this.clZ = true;
  }
  
  public final void ds(String paramString)
  {
    this.cmR = paramString;
    this.clZ = true;
  }
  
  public final void eA(int paramInt)
  {
    this.cmN = paramInt;
    this.clZ = true;
  }
  
  public final void eB(int paramInt)
  {
    this.cmT = paramInt;
    this.clZ = true;
  }
  
  public ContentValues wH()
  {
    try
    {
      if (this.clZ)
      {
        localObject = new u();
        ((u)localObject).chE();
        ((u)localObject).Wj(this.cmC);
        ((u)localObject).Wj(this.cmD);
        ((u)localObject).Wj(this.cmE);
        ((u)localObject).CZ(this.cmF);
        ((u)localObject).CZ(this.cmG);
        ((u)localObject).Wj(this.cmH);
        ((u)localObject).Wj(this.cmI);
        ((u)localObject).Wj(this.cmJ);
        ((u)localObject).Wj(this.cmK);
        ((u)localObject).Wj(this.cmL);
        ((u)localObject).Wj(this.cmM);
        ((u)localObject).CZ(this.cmN);
        ((u)localObject).Wj(this.cmO);
        ((u)localObject).Wj(this.cmP);
        ((u)localObject).Wj(this.cmQ);
        ((u)localObject).Wj(this.cmR);
        ((u)localObject).Wj(this.cmS);
        ((u)localObject).CZ(this.cmT);
        ((u)localObject).Wj(this.cmU);
        ((u)localObject).CZ(this.cmV);
        ((u)localObject).Wj(this.cmW);
        ((u)localObject).Wj(this.cmX);
        ((u)localObject).Wj(this.cmY);
        ((u)localObject).CZ(this.cmZ);
        this.field_lvbuff = ((u)localObject).chF();
      }
      Object localObject = new ContentValues();
      if (this.field_appId == null) {
        this.field_appId = "";
      }
      if (this.cky) {
        ((ContentValues)localObject).put("appId", this.field_appId);
      }
      if (this.clI) {
        ((ContentValues)localObject).put("appName", this.field_appName);
      }
      if (this.clJ) {
        ((ContentValues)localObject).put("appDiscription", this.field_appDiscription);
      }
      if (this.clK) {
        ((ContentValues)localObject).put("appIconUrl", this.field_appIconUrl);
      }
      if (this.clL) {
        ((ContentValues)localObject).put("appStoreUrl", this.field_appStoreUrl);
      }
      if (this.clM) {
        ((ContentValues)localObject).put("appVersion", Integer.valueOf(this.field_appVersion));
      }
      if (this.clN) {
        ((ContentValues)localObject).put("appWatermarkUrl", this.field_appWatermarkUrl);
      }
      if (this.clO) {
        ((ContentValues)localObject).put("packageName", this.field_packageName);
      }
      if (this.ciS) {
        ((ContentValues)localObject).put("status", Integer.valueOf(this.field_status));
      }
      if (this.ckM) {
        ((ContentValues)localObject).put("signature", this.field_signature);
      }
      if (this.clP) {
        ((ContentValues)localObject).put("modifyTime", Long.valueOf(this.field_modifyTime));
      }
      if (this.clQ) {
        ((ContentValues)localObject).put("appName_en", this.field_appName_en);
      }
      if (this.clR) {
        ((ContentValues)localObject).put("appName_tw", this.field_appName_tw);
      }
      if (this.clS) {
        ((ContentValues)localObject).put("appName_hk", this.field_appName_hk);
      }
      if (this.clT) {
        ((ContentValues)localObject).put("appDiscription_en", this.field_appDiscription_en);
      }
      if (this.clU) {
        ((ContentValues)localObject).put("appDiscription_tw", this.field_appDiscription_tw);
      }
      if (this.clV) {
        ((ContentValues)localObject).put("appType", this.field_appType);
      }
      if (this.clW) {
        ((ContentValues)localObject).put("openId", this.field_openId);
      }
      if (this.clX) {
        ((ContentValues)localObject).put("authFlag", Integer.valueOf(this.field_authFlag));
      }
      if (this.clY) {
        ((ContentValues)localObject).put("appInfoFlag", Integer.valueOf(this.field_appInfoFlag));
      }
      if (this.clZ) {
        ((ContentValues)localObject).put("lvbuff", this.field_lvbuff);
      }
      if (this.cma) {
        ((ContentValues)localObject).put("serviceAppType", Integer.valueOf(this.field_serviceAppType));
      }
      if (this.cmb) {
        ((ContentValues)localObject).put("serviceAppInfoFlag", Integer.valueOf(this.field_serviceAppInfoFlag));
      }
      if (this.cmc) {
        ((ContentValues)localObject).put("serviceShowFlag", Integer.valueOf(this.field_serviceShowFlag));
      }
      if (this.cmd) {
        ((ContentValues)localObject).put("appSupportContentType", Long.valueOf(this.field_appSupportContentType));
      }
      if (this.cme) {
        ((ContentValues)localObject).put("svrAppSupportContentType", Long.valueOf(this.field_svrAppSupportContentType));
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
        x.e("MicroMsg.SDK.BaseAppInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public final String wJ()
  {
    return this.cmE;
  }
  
  public final String wK()
  {
    return this.cmJ;
  }
  
  public final String wL()
  {
    return this.cmK;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */