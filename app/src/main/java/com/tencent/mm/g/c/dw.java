package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dw
  extends c
{
  private static final int cOA = "istyle".hashCode();
  private static final int cOB = "iFlag".hashCode();
  private static final int cOC = "icount".hashCode();
  private static final int cOD = "faultS".hashCode();
  private static final int cOE = "snsBgId".hashCode();
  private static final int cOF = "snsuser".hashCode();
  private static final int cOG = "adsession".hashCode();
  private static final int cOH = "lastFirstPageRequestErrCode".hashCode();
  private static final int cOI = "lastFirstPageRequestErrType".hashCode();
  private static final int cOv;
  private static final int cOw;
  private static final int cOx;
  private static final int cOy;
  private static final int cOz;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjZ = "userName".hashCode();
  private static final int cvM = "md5".hashCode();
  private boolean cOh = true;
  private boolean cOi = true;
  private boolean cOj = true;
  private boolean cOk = true;
  private boolean cOl = true;
  private boolean cOm = true;
  private boolean cOn = true;
  private boolean cOo = true;
  private boolean cOp = true;
  private boolean cOq = true;
  private boolean cOr = true;
  private boolean cOs = true;
  private boolean cOt = true;
  private boolean cOu = true;
  private boolean cjD = true;
  private boolean cvk = true;
  public byte[] field_adsession;
  public String field_bgId;
  public String field_bgUrl;
  public byte[] field_faultS;
  public int field_iFlag;
  public int field_icount;
  public int field_istyle;
  public int field_lastFirstPageRequestErrCode;
  public int field_lastFirstPageRequestErrType;
  public int field_local_flag;
  public String field_md5;
  public String field_newerIds;
  public String field_older_bgId;
  public long field_snsBgId;
  public byte[] field_snsuser;
  public String field_userName;
  
  static
  {
    cOv = "newerIds".hashCode();
    cOw = "bgId".hashCode();
    cOx = "bgUrl".hashCode();
    cOy = "older_bgId".hashCode();
    cOz = "local_flag".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cjZ != k) {
        break label65;
      }
      this.field_userName = paramCursor.getString(i);
      this.cjD = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cvM == k) {
        this.field_md5 = paramCursor.getString(i);
      } else if (cOv == k) {
        this.field_newerIds = paramCursor.getString(i);
      } else if (cOw == k) {
        this.field_bgId = paramCursor.getString(i);
      } else if (cOx == k) {
        this.field_bgUrl = paramCursor.getString(i);
      } else if (cOy == k) {
        this.field_older_bgId = paramCursor.getString(i);
      } else if (cOz == k) {
        this.field_local_flag = paramCursor.getInt(i);
      } else if (cOA == k) {
        this.field_istyle = paramCursor.getInt(i);
      } else if (cOB == k) {
        this.field_iFlag = paramCursor.getInt(i);
      } else if (cOC == k) {
        this.field_icount = paramCursor.getInt(i);
      } else if (cOD == k) {
        this.field_faultS = paramCursor.getBlob(i);
      } else if (cOE == k) {
        this.field_snsBgId = paramCursor.getLong(i);
      } else if (cOF == k) {
        this.field_snsuser = paramCursor.getBlob(i);
      } else if (cOG == k) {
        this.field_adsession = paramCursor.getBlob(i);
      } else if (cOH == k) {
        this.field_lastFirstPageRequestErrCode = paramCursor.getInt(i);
      } else if (cOI == k) {
        this.field_lastFirstPageRequestErrType = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_userName == null) {
      this.field_userName = "";
    }
    if (this.cjD) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.cOh) {
      localContentValues.put("newerIds", this.field_newerIds);
    }
    if (this.cOi) {
      localContentValues.put("bgId", this.field_bgId);
    }
    if (this.cOj) {
      localContentValues.put("bgUrl", this.field_bgUrl);
    }
    if (this.cOk) {
      localContentValues.put("older_bgId", this.field_older_bgId);
    }
    if (this.cOl) {
      localContentValues.put("local_flag", Integer.valueOf(this.field_local_flag));
    }
    if (this.cOm) {
      localContentValues.put("istyle", Integer.valueOf(this.field_istyle));
    }
    if (this.cOn) {
      localContentValues.put("iFlag", Integer.valueOf(this.field_iFlag));
    }
    if (this.cOo) {
      localContentValues.put("icount", Integer.valueOf(this.field_icount));
    }
    if (this.cOp) {
      localContentValues.put("faultS", this.field_faultS);
    }
    if (this.cOq) {
      localContentValues.put("snsBgId", Long.valueOf(this.field_snsBgId));
    }
    if (this.cOr) {
      localContentValues.put("snsuser", this.field_snsuser);
    }
    if (this.cOs) {
      localContentValues.put("adsession", this.field_adsession);
    }
    if (this.cOt) {
      localContentValues.put("lastFirstPageRequestErrCode", Integer.valueOf(this.field_lastFirstPageRequestErrCode));
    }
    if (this.cOu) {
      localContentValues.put("lastFirstPageRequestErrType", Integer.valueOf(this.field_lastFirstPageRequestErrType));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */