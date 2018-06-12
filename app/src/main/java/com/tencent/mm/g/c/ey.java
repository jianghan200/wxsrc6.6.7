package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ey
  extends c
{
  private static final int cBq;
  private static final int cTR;
  private static final int cTU;
  private static final int cTu = "disable".hashCode();
  private static final int cUA;
  private static final int cUB;
  private static final int cUC;
  private static final int cUD;
  private static final int cUE;
  private static final int cUF;
  private static final int cUG;
  private static final int cUH;
  private static final int cUI = "totalDownloadCount".hashCode();
  private static final int cUJ = "packageDownloadCount".hashCode();
  private static final int cUK = "downloadTriggerType".hashCode();
  private static final int cUg;
  private static final int cUj;
  private static final int cUl;
  private static final int cUz;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int ckb;
  private static final int clC;
  private static final int clF;
  private static final int cvM;
  private static final int czr;
  private boolean cBh = true;
  private boolean cTK = true;
  private boolean cTN = true;
  private boolean cTZ = true;
  private boolean cTp = true;
  private boolean cUc = true;
  private boolean cUe = true;
  private boolean cUn = true;
  private boolean cUo = true;
  private boolean cUp = true;
  private boolean cUq = true;
  private boolean cUr = true;
  private boolean cUs = true;
  private boolean cUt = true;
  private boolean cUu = true;
  private boolean cUv = true;
  private boolean cUw = true;
  private boolean cUx = true;
  private boolean cUy = true;
  private boolean cjF = true;
  private boolean cky = true;
  private boolean clw = true;
  private boolean clz = true;
  private boolean cvk = true;
  private boolean cyW = true;
  public long field_accessTime;
  public String field_appId;
  public int field_autoDownloadCount;
  public boolean field_bigPackageReady;
  public String field_charset;
  public long field_checkIntervalTime;
  public long field_clearPkgTime;
  public long field_createTime;
  public boolean field_disable;
  public boolean field_disableWvCache;
  public String field_domain;
  public int field_downloadNetType;
  public int field_downloadTriggerType;
  public String field_downloadUrl;
  public String field_md5;
  public long field_nextCheckTime;
  public int field_packMethod;
  public int field_packageDownloadCount;
  public String field_pkgId;
  public String field_pkgPath;
  public int field_pkgSize;
  public boolean field_preloadFilesAtomic;
  public boolean field_preloadFilesReady;
  public int field_totalDownloadCount;
  public String field_version;
  
  static
  {
    cUg = "pkgId".hashCode();
    ckP = "appId".hashCode();
    clC = "version".hashCode();
    clF = "pkgPath".hashCode();
    cUz = "disableWvCache".hashCode();
    cUA = "clearPkgTime".hashCode();
    cUB = "checkIntervalTime".hashCode();
    cUC = "packMethod".hashCode();
    cTR = "domain".hashCode();
    cvM = "md5".hashCode();
    czr = "downloadUrl".hashCode();
    cUD = "pkgSize".hashCode();
    cUj = "downloadNetType".hashCode();
    cBq = "nextCheckTime".hashCode();
    ckb = "createTime".hashCode();
    cTU = "accessTime".hashCode();
    cUE = "charset".hashCode();
    cUF = "bigPackageReady".hashCode();
    cUG = "preloadFilesReady".hashCode();
    cUH = "preloadFilesAtomic".hashCode();
    cUl = "autoDownloadCount".hashCode();
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
      if (cUg != k) {
        break label65;
      }
      this.field_pkgId = paramCursor.getString(i);
      this.cTZ = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckP == k)
      {
        this.field_appId = paramCursor.getString(i);
      }
      else if (clC == k)
      {
        this.field_version = paramCursor.getString(i);
      }
      else if (clF == k)
      {
        this.field_pkgPath = paramCursor.getString(i);
      }
      else
      {
        boolean bool;
        if (cUz == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_disableWvCache = bool;
            break;
          }
        }
        if (cUA == k)
        {
          this.field_clearPkgTime = paramCursor.getLong(i);
        }
        else if (cUB == k)
        {
          this.field_checkIntervalTime = paramCursor.getLong(i);
        }
        else if (cUC == k)
        {
          this.field_packMethod = paramCursor.getInt(i);
        }
        else if (cTR == k)
        {
          this.field_domain = paramCursor.getString(i);
        }
        else if (cvM == k)
        {
          this.field_md5 = paramCursor.getString(i);
        }
        else if (czr == k)
        {
          this.field_downloadUrl = paramCursor.getString(i);
        }
        else if (cUD == k)
        {
          this.field_pkgSize = paramCursor.getInt(i);
        }
        else if (cUj == k)
        {
          this.field_downloadNetType = paramCursor.getInt(i);
        }
        else if (cBq == k)
        {
          this.field_nextCheckTime = paramCursor.getLong(i);
        }
        else if (ckb == k)
        {
          this.field_createTime = paramCursor.getLong(i);
        }
        else if (cTU == k)
        {
          this.field_accessTime = paramCursor.getLong(i);
        }
        else if (cUE == k)
        {
          this.field_charset = paramCursor.getString(i);
        }
        else
        {
          if (cUF == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_bigPackageReady = bool;
              break;
            }
          }
          if (cUG == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_preloadFilesReady = bool;
              break;
            }
          }
          if (cUH == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_preloadFilesAtomic = bool;
              break;
            }
          }
          if (cUl == k)
          {
            this.field_autoDownloadCount = paramCursor.getInt(i);
          }
          else
          {
            if (cTu == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_disable = bool;
                break;
              }
            }
            if (cUI == k) {
              this.field_totalDownloadCount = paramCursor.getInt(i);
            } else if (cUJ == k) {
              this.field_packageDownloadCount = paramCursor.getInt(i);
            } else if (cUK == k) {
              this.field_downloadTriggerType = paramCursor.getInt(i);
            } else if (ciP == k) {
              this.sKx = paramCursor.getLong(i);
            }
          }
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cTZ) {
      localContentValues.put("pkgId", this.field_pkgId);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.clw) {
      localContentValues.put("version", this.field_version);
    }
    if (this.clz) {
      localContentValues.put("pkgPath", this.field_pkgPath);
    }
    if (this.cUn) {
      localContentValues.put("disableWvCache", Boolean.valueOf(this.field_disableWvCache));
    }
    if (this.cUo) {
      localContentValues.put("clearPkgTime", Long.valueOf(this.field_clearPkgTime));
    }
    if (this.cUp) {
      localContentValues.put("checkIntervalTime", Long.valueOf(this.field_checkIntervalTime));
    }
    if (this.cUq) {
      localContentValues.put("packMethod", Integer.valueOf(this.field_packMethod));
    }
    if (this.cTK) {
      localContentValues.put("domain", this.field_domain);
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.cyW) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.cUr) {
      localContentValues.put("pkgSize", Integer.valueOf(this.field_pkgSize));
    }
    if (this.cUc) {
      localContentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
    }
    if (this.cBh) {
      localContentValues.put("nextCheckTime", Long.valueOf(this.field_nextCheckTime));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.cTN) {
      localContentValues.put("accessTime", Long.valueOf(this.field_accessTime));
    }
    if (this.field_charset == null) {
      this.field_charset = "UTF-8";
    }
    if (this.cUs) {
      localContentValues.put("charset", this.field_charset);
    }
    if (this.cUt) {
      localContentValues.put("bigPackageReady", Boolean.valueOf(this.field_bigPackageReady));
    }
    if (this.cUu) {
      localContentValues.put("preloadFilesReady", Boolean.valueOf(this.field_preloadFilesReady));
    }
    if (this.cUv) {
      localContentValues.put("preloadFilesAtomic", Boolean.valueOf(this.field_preloadFilesAtomic));
    }
    if (this.cUe) {
      localContentValues.put("autoDownloadCount", Integer.valueOf(this.field_autoDownloadCount));
    }
    if (this.cTp) {
      localContentValues.put("disable", Boolean.valueOf(this.field_disable));
    }
    if (this.cUw) {
      localContentValues.put("totalDownloadCount", Integer.valueOf(this.field_totalDownloadCount));
    }
    if (this.cUx) {
      localContentValues.put("packageDownloadCount", Integer.valueOf(this.field_packageDownloadCount));
    }
    if (this.cUy) {
      localContentValues.put("downloadTriggerType", Integer.valueOf(this.field_downloadTriggerType));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */