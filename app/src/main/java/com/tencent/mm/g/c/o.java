package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class o
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS AppBrandWxaPkgManifestRecordPkgPathIndex ON AppBrandWxaPkgManifestRecord(pkgPath)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cjj;
  private static final int cjk;
  private static final int ckP = "appId".hashCode();
  private static final int ckb;
  private static final int clC = "version".hashCode();
  private static final int clD = "versionMd5".hashCode();
  private static final int clE = "versionState".hashCode();
  private static final int clF = "pkgPath".hashCode();
  private static final int clG;
  private static final int clH;
  private boolean cjF = true;
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cky = true;
  private boolean clA = true;
  private boolean clB = true;
  private boolean clw = true;
  private boolean clx = true;
  private boolean cly = true;
  private boolean clz = true;
  public String field_appId;
  public long field_createTime;
  public int field_debugType;
  public String field_downloadURL;
  public long field_endTime;
  public String field_pkgPath;
  public long field_startTime;
  public int field_version;
  public String field_versionMd5;
  public int field_versionState;
  
  static
  {
    ckb = "createTime".hashCode();
    clG = "debugType".hashCode();
    clH = "downloadURL".hashCode();
    cjj = "startTime".hashCode();
    cjk = "endTime".hashCode();
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
      if (clC == k) {
        this.field_version = paramCursor.getInt(i);
      } else if (clD == k) {
        this.field_versionMd5 = paramCursor.getString(i);
      } else if (clE == k) {
        this.field_versionState = paramCursor.getInt(i);
      } else if (clF == k) {
        this.field_pkgPath = paramCursor.getString(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (clG == k) {
        this.field_debugType = paramCursor.getInt(i);
      } else if (clH == k) {
        this.field_downloadURL = paramCursor.getString(i);
      } else if (cjj == k) {
        this.field_startTime = paramCursor.getLong(i);
      } else if (cjk == k) {
        this.field_endTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.clw) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.clx) {
      localContentValues.put("versionMd5", this.field_versionMd5);
    }
    if (this.cly) {
      localContentValues.put("versionState", Integer.valueOf(this.field_versionState));
    }
    if (this.clz) {
      localContentValues.put("pkgPath", this.field_pkgPath);
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.clA) {
      localContentValues.put("debugType", Integer.valueOf(this.field_debugType));
    }
    if (this.clB) {
      localContentValues.put("downloadURL", this.field_downloadURL);
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */