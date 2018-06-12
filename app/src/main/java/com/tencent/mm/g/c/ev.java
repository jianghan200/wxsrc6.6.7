package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ev
  extends c
{
  private static final int cAY;
  private static final int cIo = "protocol".hashCode();
  private static final int cLQ = "packageId".hashCode();
  private static final int cLy;
  private static final int cLz;
  private static final int cTQ;
  private static final int cTR;
  private static final int cTS;
  private static final int cTT;
  private static final int cTU;
  private static final int cTV;
  private static final int cTW = "contentMd5".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS WebViewResourceCacheAppIdIndex ON WebViewResourceCache(appId)", "CREATE INDEX IF NOT EXISTS WebViewResourceCacheDomainIndex ON WebViewResourceCache(domain)", "CREATE INDEX IF NOT EXISTS WebViewResourceCachePackageIdIndex ON WebViewResourceCache(packageId)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int ckb;
  private static final int clC;
  private static final int cqH;
  private static final int cxQ;
  private boolean cAP = true;
  private boolean cHH = true;
  private boolean cLb = true;
  private boolean cLc = true;
  private boolean cLt = true;
  private boolean cTJ = true;
  private boolean cTK = true;
  private boolean cTL = true;
  private boolean cTM = true;
  private boolean cTN = true;
  private boolean cTO = true;
  private boolean cTP = true;
  private boolean cjF = true;
  private boolean cky = true;
  private boolean clw = true;
  private boolean cqo = true;
  private boolean cxP = true;
  public long field_accessTime;
  public String field_appId;
  public int field_cacheType;
  public String field_configId;
  public long field_contentLength;
  public String field_contentMd5;
  public String field_contentType;
  public long field_createTime;
  public String field_domain;
  public long field_expireTime;
  public boolean field_isLatestVersion;
  public String field_localPath;
  public String field_packageId;
  public int field_protocol;
  public String field_url;
  public int field_urlMd5Hashcode;
  public String field_version;
  
  static
  {
    cTQ = "urlMd5Hashcode".hashCode();
    cqH = "url".hashCode();
    ckP = "appId".hashCode();
    cTR = "domain".hashCode();
    clC = "version".hashCode();
    cTS = "localPath".hashCode();
    cLz = "contentType".hashCode();
    cLy = "contentLength".hashCode();
    cTT = "isLatestVersion".hashCode();
    ckb = "createTime".hashCode();
    cTU = "accessTime".hashCode();
    cAY = "expireTime".hashCode();
    cTV = "cacheType".hashCode();
    cxQ = "configId".hashCode();
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
      if (cTQ != k) {
        break label60;
      }
      this.field_urlMd5Hashcode = paramCursor.getInt(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cqH == k)
      {
        this.field_url = paramCursor.getString(i);
      }
      else if (ckP == k)
      {
        this.field_appId = paramCursor.getString(i);
      }
      else if (cTR == k)
      {
        this.field_domain = paramCursor.getString(i);
      }
      else if (clC == k)
      {
        this.field_version = paramCursor.getString(i);
      }
      else if (cTS == k)
      {
        this.field_localPath = paramCursor.getString(i);
      }
      else if (cLz == k)
      {
        this.field_contentType = paramCursor.getString(i);
      }
      else if (cLy == k)
      {
        this.field_contentLength = paramCursor.getLong(i);
      }
      else
      {
        if (cTT == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isLatestVersion = bool;
            break;
          }
        }
        if (ckb == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (cTU == k) {
          this.field_accessTime = paramCursor.getLong(i);
        } else if (cAY == k) {
          this.field_expireTime = paramCursor.getLong(i);
        } else if (cTV == k) {
          this.field_cacheType = paramCursor.getInt(i);
        } else if (cxQ == k) {
          this.field_configId = paramCursor.getString(i);
        } else if (cIo == k) {
          this.field_protocol = paramCursor.getInt(i);
        } else if (cLQ == k) {
          this.field_packageId = paramCursor.getString(i);
        } else if (cTW == k) {
          this.field_contentMd5 = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cTJ) {
      localContentValues.put("urlMd5Hashcode", Integer.valueOf(this.field_urlMd5Hashcode));
    }
    if (this.cqo) {
      localContentValues.put("url", this.field_url);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cTK) {
      localContentValues.put("domain", this.field_domain);
    }
    if (this.clw) {
      localContentValues.put("version", this.field_version);
    }
    if (this.cTL) {
      localContentValues.put("localPath", this.field_localPath);
    }
    if (this.cLc) {
      localContentValues.put("contentType", this.field_contentType);
    }
    if (this.cLb) {
      localContentValues.put("contentLength", Long.valueOf(this.field_contentLength));
    }
    if (this.cTM) {
      localContentValues.put("isLatestVersion", Boolean.valueOf(this.field_isLatestVersion));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.cTN) {
      localContentValues.put("accessTime", Long.valueOf(this.field_accessTime));
    }
    if (this.cAP) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.cTO) {
      localContentValues.put("cacheType", Integer.valueOf(this.field_cacheType));
    }
    if (this.cxP) {
      localContentValues.put("configId", this.field_configId);
    }
    if (this.cHH) {
      localContentValues.put("protocol", Integer.valueOf(this.field_protocol));
    }
    if (this.cLt) {
      localContentValues.put("packageId", this.field_packageId);
    }
    if (this.cTP) {
      localContentValues.put("contentMd5", this.field_contentMd5);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */