package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class h
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckP = "appId".hashCode();
  private static final int ckQ = "sdkVer".hashCode();
  private static final int ckR = "mediaSvrId".hashCode();
  private static final int ckS = "mediaId".hashCode();
  private static final int ckT = "clientAppDataId".hashCode();
  private static final int ckU;
  private static final int ckV;
  private static final int ckW;
  private static final int ckX;
  private static final int ckY;
  private static final int ckZ;
  private static final int ckb;
  private static final int cke = "type".hashCode();
  private static final int cla;
  private static final int clb;
  private static final int clc;
  private static final int cld;
  private static final int cle;
  private static final int clf;
  private boolean ciS = true;
  private boolean cjF = true;
  private boolean cjI = true;
  private boolean ckA = true;
  private boolean ckB = true;
  private boolean ckC = true;
  private boolean ckD = true;
  private boolean ckE = true;
  private boolean ckF = true;
  private boolean ckG = true;
  private boolean ckH = true;
  private boolean ckI = true;
  private boolean ckJ = true;
  private boolean ckK = true;
  private boolean ckL = true;
  private boolean ckM = true;
  private boolean ckN = true;
  private boolean ckO = true;
  private boolean cky = true;
  private boolean ckz = true;
  public String field_appId;
  public String field_clientAppDataId;
  public long field_createTime;
  public String field_fakeAeskey;
  public String field_fakeSignature;
  public String field_fileFullPath;
  public String field_fullXml;
  public boolean field_isUpload;
  public int field_isUseCdn;
  public long field_lastModifyTime;
  public String field_mediaId;
  public String field_mediaSvrId;
  public long field_msgInfoId;
  public long field_netTimes;
  public long field_offset;
  public long field_sdkVer;
  public String field_signature;
  public long field_status;
  public long field_totalLen;
  public long field_type;
  
  static
  {
    ckU = "totalLen".hashCode();
    ckV = "offset".hashCode();
    ciV = "status".hashCode();
    ckW = "isUpload".hashCode();
    ckb = "createTime".hashCode();
    ckX = "lastModifyTime".hashCode();
    ckY = "fileFullPath".hashCode();
    ckZ = "fullXml".hashCode();
    cla = "msgInfoId".hashCode();
    clb = "netTimes".hashCode();
    clc = "isUseCdn".hashCode();
    cld = "signature".hashCode();
    cle = "fakeAeskey".hashCode();
    clf = "fakeSignature".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (ckP != k) {
        break label60;
      }
      this.field_appId = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (ckQ == k)
      {
        this.field_sdkVer = paramCursor.getLong(i);
      }
      else if (ckR == k)
      {
        this.field_mediaSvrId = paramCursor.getString(i);
      }
      else if (ckS == k)
      {
        this.field_mediaId = paramCursor.getString(i);
      }
      else if (ckT == k)
      {
        this.field_clientAppDataId = paramCursor.getString(i);
      }
      else if (cke == k)
      {
        this.field_type = paramCursor.getLong(i);
      }
      else if (ckU == k)
      {
        this.field_totalLen = paramCursor.getLong(i);
      }
      else if (ckV == k)
      {
        this.field_offset = paramCursor.getLong(i);
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getLong(i);
      }
      else
      {
        if (ckW == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isUpload = bool;
            break;
          }
        }
        if (ckb == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (ckX == k) {
          this.field_lastModifyTime = paramCursor.getLong(i);
        } else if (ckY == k) {
          this.field_fileFullPath = paramCursor.getString(i);
        } else if (ckZ == k) {
          this.field_fullXml = paramCursor.getString(i);
        } else if (cla == k) {
          this.field_msgInfoId = paramCursor.getLong(i);
        } else if (clb == k) {
          this.field_netTimes = paramCursor.getLong(i);
        } else if (clc == k) {
          this.field_isUseCdn = paramCursor.getInt(i);
        } else if (cld == k) {
          this.field_signature = paramCursor.getString(i);
        } else if (cle == k) {
          this.field_fakeAeskey = paramCursor.getString(i);
        } else if (clf == k) {
          this.field_fakeSignature = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.ckz) {
      localContentValues.put("sdkVer", Long.valueOf(this.field_sdkVer));
    }
    if (this.ckA) {
      localContentValues.put("mediaSvrId", this.field_mediaSvrId);
    }
    if (this.ckB) {
      localContentValues.put("mediaId", this.field_mediaId);
    }
    if (this.ckC) {
      localContentValues.put("clientAppDataId", this.field_clientAppDataId);
    }
    if (this.cjI) {
      localContentValues.put("type", Long.valueOf(this.field_type));
    }
    if (this.ckD) {
      localContentValues.put("totalLen", Long.valueOf(this.field_totalLen));
    }
    if (this.ckE) {
      localContentValues.put("offset", Long.valueOf(this.field_offset));
    }
    if (this.ciS) {
      localContentValues.put("status", Long.valueOf(this.field_status));
    }
    if (this.ckF) {
      localContentValues.put("isUpload", Boolean.valueOf(this.field_isUpload));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.ckG) {
      localContentValues.put("lastModifyTime", Long.valueOf(this.field_lastModifyTime));
    }
    if (this.ckH) {
      localContentValues.put("fileFullPath", this.field_fileFullPath);
    }
    if (this.ckI) {
      localContentValues.put("fullXml", this.field_fullXml);
    }
    if (this.ckJ) {
      localContentValues.put("msgInfoId", Long.valueOf(this.field_msgInfoId));
    }
    if (this.ckK) {
      localContentValues.put("netTimes", Long.valueOf(this.field_netTimes));
    }
    if (this.ckL) {
      localContentValues.put("isUseCdn", Integer.valueOf(this.field_isUseCdn));
    }
    if (this.ckM) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.ckN) {
      localContentValues.put("fakeAeskey", this.field_fakeAeskey);
    }
    if (this.ckO) {
      localContentValues.put("fakeSignature", this.field_fakeSignature);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */