package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dk
  extends c
{
  private static final int cAY;
  private static final int cJQ;
  private static final int cJY;
  private static final int cKb;
  private static final int cLA;
  private static final int cLB;
  private static final int cLC;
  private static final int cLD;
  private static final int cLE;
  private static final int cLF;
  private static final int cLG;
  private static final int cLH;
  private static final int cLI;
  private static final int cLJ;
  private static final int cLK;
  private static final int cLL;
  private static final int cLM;
  private static final int cLN;
  private static final int cLO;
  private static final int cLP = "wvCacheType".hashCode();
  private static final int cLQ = "packageId".hashCode();
  private static final int cLu;
  private static final int cLv;
  private static final int cLw;
  private static final int cLx;
  private static final int cLy;
  private static final int cLz;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckP;
  private static final int cks;
  private static final int cqH;
  private static final int cvM;
  private static final int czt;
  private static final int czv;
  private boolean cAP = true;
  private boolean cJN = true;
  private boolean cJR = true;
  private boolean cJU = true;
  private boolean cKX = true;
  private boolean cKY = true;
  private boolean cKZ = true;
  private boolean cLa = true;
  private boolean cLb = true;
  private boolean cLc = true;
  private boolean cLd = true;
  private boolean cLe = true;
  private boolean cLf = true;
  private boolean cLg = true;
  private boolean cLh = true;
  private boolean cLi = true;
  private boolean cLj = true;
  private boolean cLk = true;
  private boolean cLl = true;
  private boolean cLm = true;
  private boolean cLn = true;
  private boolean cLo = true;
  private boolean cLp = true;
  private boolean cLq = true;
  private boolean cLr = true;
  private boolean cLs = true;
  private boolean cLt = true;
  private boolean ciS = true;
  private boolean cjW = true;
  private boolean cky = true;
  private boolean cqo = true;
  private boolean cvk = true;
  private boolean cyY = true;
  private boolean cza = true;
  public int field_EID;
  public String field_appId;
  public long field_contentLength;
  public String field_contentType;
  public boolean field_deleted;
  public byte[] field_eccSignature;
  public String field_encryptKey;
  public long field_expireTime;
  public boolean field_fileCompress;
  public boolean field_fileEncrypt;
  public String field_filePath;
  public long field_fileSize;
  public boolean field_fileUpdated;
  public String field_fileVersion;
  public String field_groupId1;
  public String field_groupId2;
  public int field_keyVersion;
  public int field_maxRetryTimes;
  public String field_md5;
  public boolean field_needRetry;
  public int field_networkType;
  public String field_originalMd5;
  public String field_packageId;
  public int field_priority;
  public long field_reportId;
  public int field_resType;
  public int field_retryTimes;
  public String field_sampleId;
  public int field_status;
  public int field_subType;
  public String field_url;
  public String field_urlKey;
  public int field_urlKey_hashcode;
  public int field_wvCacheType;
  
  static
  {
    cLu = "urlKey_hashcode".hashCode();
    cLv = "urlKey".hashCode();
    cqH = "url".hashCode();
    cLw = "fileVersion".hashCode();
    cKb = "networkType".hashCode();
    cLx = "maxRetryTimes".hashCode();
    cJY = "retryTimes".hashCode();
    czv = "filePath".hashCode();
    ciV = "status".hashCode();
    cLy = "contentLength".hashCode();
    cLz = "contentType".hashCode();
    cAY = "expireTime".hashCode();
    cvM = "md5".hashCode();
    cLA = "groupId1".hashCode();
    cLB = "groupId2".hashCode();
    cLC = "priority".hashCode();
    cLD = "fileUpdated".hashCode();
    cLE = "deleted".hashCode();
    cLF = "resType".hashCode();
    cks = "subType".hashCode();
    cJQ = "reportId".hashCode();
    cLG = "sampleId".hashCode();
    cLH = "eccSignature".hashCode();
    cLI = "originalMd5".hashCode();
    cLJ = "fileCompress".hashCode();
    cLK = "fileEncrypt".hashCode();
    cLL = "encryptKey".hashCode();
    cLM = "keyVersion".hashCode();
    cLN = "EID".hashCode();
    czt = "fileSize".hashCode();
    cLO = "needRetry".hashCode();
    ckP = "appId".hashCode();
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
      if (cLu != k) {
        break label65;
      }
      this.field_urlKey_hashcode = paramCursor.getInt(i);
      this.cKX = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cLv == k)
      {
        this.field_urlKey = paramCursor.getString(i);
      }
      else if (cqH == k)
      {
        this.field_url = paramCursor.getString(i);
      }
      else if (cLw == k)
      {
        this.field_fileVersion = paramCursor.getString(i);
      }
      else if (cKb == k)
      {
        this.field_networkType = paramCursor.getInt(i);
      }
      else if (cLx == k)
      {
        this.field_maxRetryTimes = paramCursor.getInt(i);
      }
      else if (cJY == k)
      {
        this.field_retryTimes = paramCursor.getInt(i);
      }
      else if (czv == k)
      {
        this.field_filePath = paramCursor.getString(i);
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getInt(i);
      }
      else if (cLy == k)
      {
        this.field_contentLength = paramCursor.getLong(i);
      }
      else if (cLz == k)
      {
        this.field_contentType = paramCursor.getString(i);
      }
      else if (cAY == k)
      {
        this.field_expireTime = paramCursor.getLong(i);
      }
      else if (cvM == k)
      {
        this.field_md5 = paramCursor.getString(i);
      }
      else if (cLA == k)
      {
        this.field_groupId1 = paramCursor.getString(i);
      }
      else if (cLB == k)
      {
        this.field_groupId2 = paramCursor.getString(i);
      }
      else if (cLC == k)
      {
        this.field_priority = paramCursor.getInt(i);
      }
      else
      {
        boolean bool;
        if (cLD == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_fileUpdated = bool;
            break;
          }
        }
        if (cLE == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_deleted = bool;
            break;
          }
        }
        if (cLF == k)
        {
          this.field_resType = paramCursor.getInt(i);
        }
        else if (cks == k)
        {
          this.field_subType = paramCursor.getInt(i);
        }
        else if (cJQ == k)
        {
          this.field_reportId = paramCursor.getLong(i);
        }
        else if (cLG == k)
        {
          this.field_sampleId = paramCursor.getString(i);
        }
        else if (cLH == k)
        {
          this.field_eccSignature = paramCursor.getBlob(i);
        }
        else if (cLI == k)
        {
          this.field_originalMd5 = paramCursor.getString(i);
        }
        else
        {
          if (cLJ == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_fileCompress = bool;
              break;
            }
          }
          if (cLK == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_fileEncrypt = bool;
              break;
            }
          }
          if (cLL == k)
          {
            this.field_encryptKey = paramCursor.getString(i);
          }
          else if (cLM == k)
          {
            this.field_keyVersion = paramCursor.getInt(i);
          }
          else if (cLN == k)
          {
            this.field_EID = paramCursor.getInt(i);
          }
          else if (czt == k)
          {
            this.field_fileSize = paramCursor.getLong(i);
          }
          else
          {
            if (cLO == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_needRetry = bool;
                break;
              }
            }
            if (ckP == k) {
              this.field_appId = paramCursor.getString(i);
            } else if (cLP == k) {
              this.field_wvCacheType = paramCursor.getInt(i);
            } else if (cLQ == k) {
              this.field_packageId = paramCursor.getString(i);
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
    if (this.cKX) {
      localContentValues.put("urlKey_hashcode", Integer.valueOf(this.field_urlKey_hashcode));
    }
    if (this.cKY) {
      localContentValues.put("urlKey", this.field_urlKey);
    }
    if (this.cqo) {
      localContentValues.put("url", this.field_url);
    }
    if (this.cKZ) {
      localContentValues.put("fileVersion", this.field_fileVersion);
    }
    if (this.cJU) {
      localContentValues.put("networkType", Integer.valueOf(this.field_networkType));
    }
    if (this.cLa) {
      localContentValues.put("maxRetryTimes", Integer.valueOf(this.field_maxRetryTimes));
    }
    if (this.cJR) {
      localContentValues.put("retryTimes", Integer.valueOf(this.field_retryTimes));
    }
    if (this.cza) {
      localContentValues.put("filePath", this.field_filePath);
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cLb) {
      localContentValues.put("contentLength", Long.valueOf(this.field_contentLength));
    }
    if (this.cLc) {
      localContentValues.put("contentType", this.field_contentType);
    }
    if (this.cAP) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.cLd) {
      localContentValues.put("groupId1", this.field_groupId1);
    }
    if (this.cLe) {
      localContentValues.put("groupId2", this.field_groupId2);
    }
    if (this.cLf) {
      localContentValues.put("priority", Integer.valueOf(this.field_priority));
    }
    if (this.cLg) {
      localContentValues.put("fileUpdated", Boolean.valueOf(this.field_fileUpdated));
    }
    if (this.cLh) {
      localContentValues.put("deleted", Boolean.valueOf(this.field_deleted));
    }
    if (this.cLi) {
      localContentValues.put("resType", Integer.valueOf(this.field_resType));
    }
    if (this.cjW) {
      localContentValues.put("subType", Integer.valueOf(this.field_subType));
    }
    if (this.cJN) {
      localContentValues.put("reportId", Long.valueOf(this.field_reportId));
    }
    if (this.cLj) {
      localContentValues.put("sampleId", this.field_sampleId);
    }
    if (this.cLk) {
      localContentValues.put("eccSignature", this.field_eccSignature);
    }
    if (this.cLl) {
      localContentValues.put("originalMd5", this.field_originalMd5);
    }
    if (this.cLm) {
      localContentValues.put("fileCompress", Boolean.valueOf(this.field_fileCompress));
    }
    if (this.cLn) {
      localContentValues.put("fileEncrypt", Boolean.valueOf(this.field_fileEncrypt));
    }
    if (this.cLo) {
      localContentValues.put("encryptKey", this.field_encryptKey);
    }
    if (this.cLp) {
      localContentValues.put("keyVersion", Integer.valueOf(this.field_keyVersion));
    }
    if (this.cLq) {
      localContentValues.put("EID", Integer.valueOf(this.field_EID));
    }
    if (this.cyY) {
      localContentValues.put("fileSize", Long.valueOf(this.field_fileSize));
    }
    if (this.cLr) {
      localContentValues.put("needRetry", Boolean.valueOf(this.field_needRetry));
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cLs) {
      localContentValues.put("wvCacheType", Integer.valueOf(this.field_wvCacheType));
    }
    if (this.cLt) {
      localContentValues.put("packageId", this.field_packageId);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */