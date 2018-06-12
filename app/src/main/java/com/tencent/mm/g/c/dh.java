package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dh
  extends c
{
  private static final int cKJ;
  private static final int cKK;
  private static final int cKL;
  private static final int cKM = "tpdataurl".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS record_localid_index ON RecordCDNInfo(recordLocalId)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckS;
  private static final int ckU;
  private static final int ckV;
  private static final int cke;
  private static final int cwd;
  private static final int cwm;
  private static final int cxJ;
  private static final int cxL;
  private static final int cxM;
  private static final int cxT = "localId".hashCode();
  private static final int cyp;
  private static final int czG;
  private static final int czw;
  private boolean cKF = true;
  private boolean cKG = true;
  private boolean cKH = true;
  private boolean cKI = true;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean ckB = true;
  private boolean ckD = true;
  private boolean ckE = true;
  private boolean cvC = true;
  private boolean cvL = true;
  private boolean cxD = true;
  private boolean cxF = true;
  private boolean cxG = true;
  private boolean cxR = true;
  private boolean cyb = true;
  private boolean czb = true;
  private boolean czl = true;
  public String field_cdnKey;
  public String field_cdnUrl;
  public String field_dataId;
  public int field_errCode;
  public int field_fileType;
  public boolean field_isThumb;
  public int field_localId;
  public String field_mediaId;
  public int field_offset;
  public String field_path;
  public int field_recordLocalId;
  public int field_status;
  public String field_toUser;
  public int field_totalLen;
  public String field_tpaeskey;
  public String field_tpauthkey;
  public String field_tpdataurl;
  public int field_type;
  
  static
  {
    cKJ = "recordLocalId".hashCode();
    cyp = "toUser".hashCode();
    cxJ = "dataId".hashCode();
    ckS = "mediaId".hashCode();
    cxM = "path".hashCode();
    cwd = "cdnUrl".hashCode();
    cxL = "cdnKey".hashCode();
    ckU = "totalLen".hashCode();
    cKK = "isThumb".hashCode();
    ckV = "offset".hashCode();
    cke = "type".hashCode();
    czw = "fileType".hashCode();
    ciV = "status".hashCode();
    czG = "errCode".hashCode();
    cKL = "tpaeskey".hashCode();
    cwm = "tpauthkey".hashCode();
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
      if (cxT != k) {
        break label65;
      }
      this.field_localId = paramCursor.getInt(i);
      this.cxR = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cKJ == k)
      {
        this.field_recordLocalId = paramCursor.getInt(i);
      }
      else if (cyp == k)
      {
        this.field_toUser = paramCursor.getString(i);
      }
      else if (cxJ == k)
      {
        this.field_dataId = paramCursor.getString(i);
      }
      else if (ckS == k)
      {
        this.field_mediaId = paramCursor.getString(i);
      }
      else if (cxM == k)
      {
        this.field_path = paramCursor.getString(i);
      }
      else if (cwd == k)
      {
        this.field_cdnUrl = paramCursor.getString(i);
      }
      else if (cxL == k)
      {
        this.field_cdnKey = paramCursor.getString(i);
      }
      else if (ckU == k)
      {
        this.field_totalLen = paramCursor.getInt(i);
      }
      else
      {
        if (cKK == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isThumb = bool;
            break;
          }
        }
        if (ckV == k) {
          this.field_offset = paramCursor.getInt(i);
        } else if (cke == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (czw == k) {
          this.field_fileType = paramCursor.getInt(i);
        } else if (ciV == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (czG == k) {
          this.field_errCode = paramCursor.getInt(i);
        } else if (cKL == k) {
          this.field_tpaeskey = paramCursor.getString(i);
        } else if (cwm == k) {
          this.field_tpauthkey = paramCursor.getString(i);
        } else if (cKM == k) {
          this.field_tpdataurl = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxR) {
      localContentValues.put("localId", Integer.valueOf(this.field_localId));
    }
    if (this.cKF) {
      localContentValues.put("recordLocalId", Integer.valueOf(this.field_recordLocalId));
    }
    if (this.field_toUser == null) {
      this.field_toUser = "";
    }
    if (this.cyb) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.cxD) {
      localContentValues.put("dataId", this.field_dataId);
    }
    if (this.ckB) {
      localContentValues.put("mediaId", this.field_mediaId);
    }
    if (this.cxG) {
      localContentValues.put("path", this.field_path);
    }
    if (this.cvC) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.cxF) {
      localContentValues.put("cdnKey", this.field_cdnKey);
    }
    if (this.ckD) {
      localContentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
    }
    if (this.cKG) {
      localContentValues.put("isThumb", Boolean.valueOf(this.field_isThumb));
    }
    if (this.ckE) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.czb) {
      localContentValues.put("fileType", Integer.valueOf(this.field_fileType));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.czl) {
      localContentValues.put("errCode", Integer.valueOf(this.field_errCode));
    }
    if (this.cKH) {
      localContentValues.put("tpaeskey", this.field_tpaeskey);
    }
    if (this.cvL) {
      localContentValues.put("tpauthkey", this.field_tpauthkey);
    }
    if (this.cKI) {
      localContentValues.put("tpdataurl", this.field_tpdataurl);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */