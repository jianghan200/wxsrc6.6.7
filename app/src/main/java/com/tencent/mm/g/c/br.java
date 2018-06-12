package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class br
  extends c
{
  private static final int cAY = "expireTime".hashCode();
  private static final int cBo = "randomTime".hashCode();
  private static final int cBp = "isFirst".hashCode();
  private static final int cBq = "nextCheckTime".hashCode();
  private static final int cBr = "isRunning".hashCode();
  private static final int cBs = "noWifi".hashCode();
  private static final int cBt = "noSdcard".hashCode();
  private static final int cBu = "noEnoughSpace".hashCode();
  private static final int cBv = "lowBattery".hashCode();
  private static final int cBw = "continueDelay".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP = "appId".hashCode();
  private static final int clp;
  private static final int cml;
  private static final int cvM;
  private static final int czr = "downloadUrl".hashCode();
  private boolean cAP = true;
  private boolean cBf = true;
  private boolean cBg = true;
  private boolean cBh = true;
  private boolean cBi = true;
  private boolean cBj = true;
  private boolean cBk = true;
  private boolean cBl = true;
  private boolean cBm = true;
  private boolean cBn = true;
  private boolean cky = true;
  private boolean clO = true;
  private boolean clm = true;
  private boolean cvk = true;
  private boolean cyW = true;
  public String field_appId;
  public boolean field_continueDelay;
  public String field_downloadUrl;
  public long field_expireTime;
  public boolean field_isFirst;
  public boolean field_isRunning;
  public boolean field_lowBattery;
  public String field_md5;
  public long field_nextCheckTime;
  public boolean field_noEnoughSpace;
  public boolean field_noSdcard;
  public boolean field_noWifi;
  public String field_packageName;
  public long field_randomTime;
  public long field_size;
  
  static
  {
    clp = "size".hashCode();
    cvM = "md5".hashCode();
    cml = "packageName".hashCode();
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
        break label65;
      }
      this.field_appId = paramCursor.getString(i);
      this.cky = true;
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
      else if (clp == k)
      {
        this.field_size = paramCursor.getLong(i);
      }
      else if (cvM == k)
      {
        this.field_md5 = paramCursor.getString(i);
      }
      else if (cml == k)
      {
        this.field_packageName = paramCursor.getString(i);
      }
      else if (cAY == k)
      {
        this.field_expireTime = paramCursor.getLong(i);
      }
      else if (cBo == k)
      {
        this.field_randomTime = paramCursor.getLong(i);
      }
      else
      {
        boolean bool;
        if (cBp == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_isFirst = bool;
            break;
          }
        }
        if (cBq == k)
        {
          this.field_nextCheckTime = paramCursor.getLong(i);
        }
        else
        {
          if (cBr == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_isRunning = bool;
              break;
            }
          }
          if (cBs == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_noWifi = bool;
              break;
            }
          }
          if (cBt == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_noSdcard = bool;
              break;
            }
          }
          if (cBu == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_noEnoughSpace = bool;
              break;
            }
          }
          if (cBv == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_lowBattery = bool;
              break;
            }
          }
          if (cBw == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_continueDelay = bool;
              break;
            }
          }
          if (ciP == k) {
            this.sKx = paramCursor.getLong(i);
          }
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
    if (this.cyW) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.clm) {
      localContentValues.put("size", Long.valueOf(this.field_size));
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.clO) {
      localContentValues.put("packageName", this.field_packageName);
    }
    if (this.cAP) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.cBf) {
      localContentValues.put("randomTime", Long.valueOf(this.field_randomTime));
    }
    if (this.cBg) {
      localContentValues.put("isFirst", Boolean.valueOf(this.field_isFirst));
    }
    if (this.cBh) {
      localContentValues.put("nextCheckTime", Long.valueOf(this.field_nextCheckTime));
    }
    if (this.cBi) {
      localContentValues.put("isRunning", Boolean.valueOf(this.field_isRunning));
    }
    if (this.cBj) {
      localContentValues.put("noWifi", Boolean.valueOf(this.field_noWifi));
    }
    if (this.cBk) {
      localContentValues.put("noSdcard", Boolean.valueOf(this.field_noSdcard));
    }
    if (this.cBl) {
      localContentValues.put("noEnoughSpace", Boolean.valueOf(this.field_noEnoughSpace));
    }
    if (this.cBm) {
      localContentValues.put("lowBattery", Boolean.valueOf(this.field_lowBattery));
    }
    if (this.cBn) {
      localContentValues.put("continueDelay", Boolean.valueOf(this.field_continueDelay));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */