package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ex
  extends c
{
  private static final int cUg;
  private static final int cUh;
  private static final int cUi;
  private static final int cUj;
  private static final int cUk;
  private static final int cUl = "autoDownloadCount".hashCode();
  private static final int cUm = "fileDownloadCount".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjy = "key".hashCode();
  private static final int ckb;
  private static final int clC;
  private static final int clp;
  private static final int cvM;
  private static final int czr;
  private static final int czv;
  private boolean cTZ = true;
  private boolean cUa = true;
  private boolean cUb = true;
  private boolean cUc = true;
  private boolean cUd = true;
  private boolean cUe = true;
  private boolean cUf = true;
  private boolean cjF = true;
  private boolean cju = true;
  private boolean clm = true;
  private boolean clw = true;
  private boolean cvk = true;
  private boolean cyW = true;
  private boolean cza = true;
  public int field_autoDownloadCount;
  public boolean field_completeDownload;
  public long field_createTime;
  public int field_downloadNetType;
  public String field_downloadUrl;
  public int field_fileDownloadCount;
  public String field_filePath;
  public String field_key;
  public String field_md5;
  public String field_mimeType;
  public String field_pkgId;
  public String field_rid;
  public int field_size;
  public String field_version;
  
  static
  {
    cUg = "pkgId".hashCode();
    clC = "version".hashCode();
    czv = "filePath".hashCode();
    cUh = "rid".hashCode();
    cUi = "mimeType".hashCode();
    cvM = "md5".hashCode();
    czr = "downloadUrl".hashCode();
    clp = "size".hashCode();
    cUj = "downloadNetType".hashCode();
    cUk = "completeDownload".hashCode();
    ckb = "createTime".hashCode();
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
      if (cjy != k) {
        break label65;
      }
      this.field_key = paramCursor.getString(i);
      this.cju = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cUg == k)
      {
        this.field_pkgId = paramCursor.getString(i);
      }
      else if (clC == k)
      {
        this.field_version = paramCursor.getString(i);
      }
      else if (czv == k)
      {
        this.field_filePath = paramCursor.getString(i);
      }
      else if (cUh == k)
      {
        this.field_rid = paramCursor.getString(i);
      }
      else if (cUi == k)
      {
        this.field_mimeType = paramCursor.getString(i);
      }
      else if (cvM == k)
      {
        this.field_md5 = paramCursor.getString(i);
      }
      else if (czr == k)
      {
        this.field_downloadUrl = paramCursor.getString(i);
      }
      else if (clp == k)
      {
        this.field_size = paramCursor.getInt(i);
      }
      else if (cUj == k)
      {
        this.field_downloadNetType = paramCursor.getInt(i);
      }
      else
      {
        if (cUk == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_completeDownload = bool;
            break;
          }
        }
        if (ckb == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (cUl == k) {
          this.field_autoDownloadCount = paramCursor.getInt(i);
        } else if (cUm == k) {
          this.field_fileDownloadCount = paramCursor.getInt(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cju) {
      localContentValues.put("key", this.field_key);
    }
    if (this.cTZ) {
      localContentValues.put("pkgId", this.field_pkgId);
    }
    if (this.clw) {
      localContentValues.put("version", this.field_version);
    }
    if (this.cza) {
      localContentValues.put("filePath", this.field_filePath);
    }
    if (this.cUa) {
      localContentValues.put("rid", this.field_rid);
    }
    if (this.cUb) {
      localContentValues.put("mimeType", this.field_mimeType);
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.cyW) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.clm) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.cUc) {
      localContentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
    }
    if (this.cUd) {
      localContentValues.put("completeDownload", Boolean.valueOf(this.field_completeDownload));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.cUe) {
      localContentValues.put("autoDownloadCount", Integer.valueOf(this.field_autoDownloadCount));
    }
    if (this.cUf) {
      localContentValues.put("fileDownloadCount", Integer.valueOf(this.field_fileDownloadCount));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */