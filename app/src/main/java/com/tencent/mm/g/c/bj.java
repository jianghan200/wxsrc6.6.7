package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bj
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cjj;
  private static final int ckP;
  private static final int ckw;
  private static final int cml;
  private static final int cps;
  private static final int cvM;
  private static final int czA;
  private static final int czB;
  private static final int czC;
  private static final int czD;
  private static final int czE;
  private static final int czF;
  private static final int czG;
  private static final int czH;
  private static final int czI;
  private static final int czJ;
  private static final int czK;
  private static final int czq = "downloadId".hashCode();
  private static final int czr = "downloadUrl".hashCode();
  private static final int czs = "secondaryUrl".hashCode();
  private static final int czt = "fileSize".hashCode();
  private static final int czu = "fileName".hashCode();
  private static final int czv = "filePath".hashCode();
  private static final int czw = "fileType".hashCode();
  private static final int czx;
  private static final int czy;
  private static final int czz;
  private boolean ciS = true;
  private boolean cjb = true;
  private boolean cku = true;
  private boolean cky = true;
  private boolean clO = true;
  private boolean cpe = true;
  private boolean cvk = true;
  private boolean cyV = true;
  private boolean cyW = true;
  private boolean cyX = true;
  private boolean cyY = true;
  private boolean cyZ = true;
  private boolean cza = true;
  private boolean czb = true;
  private boolean czc = true;
  private boolean czd = true;
  private boolean cze = true;
  private boolean czf = true;
  private boolean czg = true;
  private boolean czh = true;
  private boolean czi = true;
  private boolean czj = true;
  private boolean czk = true;
  private boolean czl = true;
  private boolean czm = true;
  private boolean czn = true;
  private boolean czo = true;
  private boolean czp = true;
  public String field_appId;
  public boolean field_autoDownload;
  public boolean field_autoInstall;
  public String field_channelId;
  public long field_downloadId;
  public boolean field_downloadInWifi;
  public String field_downloadUrl;
  public int field_downloadUrlHashCode;
  public long field_downloadedSize;
  public int field_downloaderType;
  public int field_errCode;
  public String field_extInfo;
  public String field_fileName;
  public String field_filePath;
  public long field_fileSize;
  public int field_fileType;
  public boolean field_fromWeApp;
  public String field_md5;
  public String field_packageName;
  public int field_scene;
  public String field_secondaryUrl;
  public boolean field_showNotification;
  public long field_startSize;
  public int field_startState;
  public long field_startTime;
  public int field_status;
  public long field_sysDownloadId;
  public long field_totalSize;
  
  static
  {
    ciV = "status".hashCode();
    cvM = "md5".hashCode();
    czx = "autoInstall".hashCode();
    czy = "showNotification".hashCode();
    czz = "sysDownloadId".hashCode();
    czA = "downloaderType".hashCode();
    ckP = "appId".hashCode();
    czB = "downloadUrlHashCode".hashCode();
    cml = "packageName".hashCode();
    czC = "downloadedSize".hashCode();
    czD = "totalSize".hashCode();
    czE = "autoDownload".hashCode();
    czF = "channelId".hashCode();
    ckw = "scene".hashCode();
    czG = "errCode".hashCode();
    cjj = "startTime".hashCode();
    czH = "startSize".hashCode();
    czI = "startState".hashCode();
    czJ = "fromWeApp".hashCode();
    czK = "downloadInWifi".hashCode();
    cps = "extInfo".hashCode();
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
      if (czq != k) {
        break label65;
      }
      this.field_downloadId = paramCursor.getLong(i);
      this.cyV = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (czr == k)
      {
        this.field_downloadUrl = paramCursor.getString(i);
      }
      else if (czs == k)
      {
        this.field_secondaryUrl = paramCursor.getString(i);
      }
      else if (czt == k)
      {
        this.field_fileSize = paramCursor.getLong(i);
      }
      else if (czu == k)
      {
        this.field_fileName = paramCursor.getString(i);
      }
      else if (czv == k)
      {
        this.field_filePath = paramCursor.getString(i);
      }
      else if (czw == k)
      {
        this.field_fileType = paramCursor.getInt(i);
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getInt(i);
      }
      else if (cvM == k)
      {
        this.field_md5 = paramCursor.getString(i);
      }
      else
      {
        boolean bool;
        if (czx == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_autoInstall = bool;
            break;
          }
        }
        if (czy == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_showNotification = bool;
            break;
          }
        }
        if (czz == k)
        {
          this.field_sysDownloadId = paramCursor.getLong(i);
        }
        else if (czA == k)
        {
          this.field_downloaderType = paramCursor.getInt(i);
        }
        else if (ckP == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else if (czB == k)
        {
          this.field_downloadUrlHashCode = paramCursor.getInt(i);
        }
        else if (cml == k)
        {
          this.field_packageName = paramCursor.getString(i);
        }
        else if (czC == k)
        {
          this.field_downloadedSize = paramCursor.getLong(i);
        }
        else if (czD == k)
        {
          this.field_totalSize = paramCursor.getLong(i);
        }
        else
        {
          if (czE == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_autoDownload = bool;
              break;
            }
          }
          if (czF == k)
          {
            this.field_channelId = paramCursor.getString(i);
          }
          else if (ckw == k)
          {
            this.field_scene = paramCursor.getInt(i);
          }
          else if (czG == k)
          {
            this.field_errCode = paramCursor.getInt(i);
          }
          else if (cjj == k)
          {
            this.field_startTime = paramCursor.getLong(i);
          }
          else if (czH == k)
          {
            this.field_startSize = paramCursor.getLong(i);
          }
          else if (czI == k)
          {
            this.field_startState = paramCursor.getInt(i);
          }
          else
          {
            if (czJ == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_fromWeApp = bool;
                break;
              }
            }
            if (czK == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_downloadInWifi = bool;
                break;
              }
            }
            if (cps == k) {
              this.field_extInfo = paramCursor.getString(i);
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
    if (this.cyV) {
      localContentValues.put("downloadId", Long.valueOf(this.field_downloadId));
    }
    if (this.field_downloadUrl == null) {
      this.field_downloadUrl = "";
    }
    if (this.cyW) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.field_secondaryUrl == null) {
      this.field_secondaryUrl = "";
    }
    if (this.cyX) {
      localContentValues.put("secondaryUrl", this.field_secondaryUrl);
    }
    if (this.cyY) {
      localContentValues.put("fileSize", Long.valueOf(this.field_fileSize));
    }
    if (this.field_fileName == null) {
      this.field_fileName = "";
    }
    if (this.cyZ) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.field_filePath == null) {
      this.field_filePath = "";
    }
    if (this.cza) {
      localContentValues.put("filePath", this.field_filePath);
    }
    if (this.czb) {
      localContentValues.put("fileType", Integer.valueOf(this.field_fileType));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.field_md5 == null) {
      this.field_md5 = "";
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.czc) {
      localContentValues.put("autoInstall", Boolean.valueOf(this.field_autoInstall));
    }
    if (this.czd) {
      localContentValues.put("showNotification", Boolean.valueOf(this.field_showNotification));
    }
    if (this.cze) {
      localContentValues.put("sysDownloadId", Long.valueOf(this.field_sysDownloadId));
    }
    if (this.czf) {
      localContentValues.put("downloaderType", Integer.valueOf(this.field_downloaderType));
    }
    if (this.field_appId == null) {
      this.field_appId = "";
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.czg) {
      localContentValues.put("downloadUrlHashCode", Integer.valueOf(this.field_downloadUrlHashCode));
    }
    if (this.field_packageName == null) {
      this.field_packageName = "";
    }
    if (this.clO) {
      localContentValues.put("packageName", this.field_packageName);
    }
    if (this.czh) {
      localContentValues.put("downloadedSize", Long.valueOf(this.field_downloadedSize));
    }
    if (this.czi) {
      localContentValues.put("totalSize", Long.valueOf(this.field_totalSize));
    }
    if (this.czj) {
      localContentValues.put("autoDownload", Boolean.valueOf(this.field_autoDownload));
    }
    if (this.field_channelId == null) {
      this.field_channelId = "";
    }
    if (this.czk) {
      localContentValues.put("channelId", this.field_channelId);
    }
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.czl) {
      localContentValues.put("errCode", Integer.valueOf(this.field_errCode));
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.czm) {
      localContentValues.put("startSize", Long.valueOf(this.field_startSize));
    }
    if (this.czn) {
      localContentValues.put("startState", Integer.valueOf(this.field_startState));
    }
    if (this.czo) {
      localContentValues.put("fromWeApp", Boolean.valueOf(this.field_fromWeApp));
    }
    if (this.czp) {
      localContentValues.put("downloadInWifi", Boolean.valueOf(this.field_downloadInWifi));
    }
    if (this.field_extInfo == null) {
      this.field_extInfo = "";
    }
    if (this.cpe) {
      localContentValues.put("extInfo", this.field_extInfo);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */