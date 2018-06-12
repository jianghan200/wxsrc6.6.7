package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dc
  extends c
{
  private static final int cJQ = "reportId".hashCode();
  private static final int cJY;
  private static final int cJZ;
  private static final int cKa;
  private static final int cKb;
  private static final int cKc;
  private static final int cKd;
  private static final int cKe;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP = "appId".hashCode();
  private static final int cke;
  private static final int clC = "version".hashCode();
  private boolean cJN = true;
  private boolean cJR = true;
  private boolean cJS = true;
  private boolean cJT = true;
  private boolean cJU = true;
  private boolean cJV = true;
  private boolean cJW = true;
  private boolean cJX = true;
  private boolean cjI = true;
  private boolean cky = true;
  private boolean clw = true;
  public String field_appId;
  public boolean field_firstTimeTried;
  public long field_lastRetryTime;
  public int field_networkType;
  public String field_pkgMd5;
  public int field_reportId;
  public int field_retriedCount;
  public long field_retryInterval;
  public int field_retryTimes;
  public int field_type;
  public int field_version;
  
  static
  {
    cke = "type".hashCode();
    cJY = "retryTimes".hashCode();
    cJZ = "retriedCount".hashCode();
    cKa = "retryInterval".hashCode();
    cKb = "networkType".hashCode();
    cKc = "pkgMd5".hashCode();
    cKd = "lastRetryTime".hashCode();
    cKe = "firstTimeTried".hashCode();
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
      if (clC == k)
      {
        this.field_version = paramCursor.getInt(i);
      }
      else if (cke == k)
      {
        this.field_type = paramCursor.getInt(i);
      }
      else if (cJY == k)
      {
        this.field_retryTimes = paramCursor.getInt(i);
      }
      else if (cJZ == k)
      {
        this.field_retriedCount = paramCursor.getInt(i);
      }
      else if (cKa == k)
      {
        this.field_retryInterval = paramCursor.getLong(i);
      }
      else if (cKb == k)
      {
        this.field_networkType = paramCursor.getInt(i);
      }
      else if (cKc == k)
      {
        this.field_pkgMd5 = paramCursor.getString(i);
      }
      else if (cKd == k)
      {
        this.field_lastRetryTime = paramCursor.getLong(i);
      }
      else
      {
        if (cKe == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_firstTimeTried = bool;
            break;
          }
        }
        if (cJQ == k) {
          this.field_reportId = paramCursor.getInt(i);
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
    if (this.clw) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cJR) {
      localContentValues.put("retryTimes", Integer.valueOf(this.field_retryTimes));
    }
    if (this.cJS) {
      localContentValues.put("retriedCount", Integer.valueOf(this.field_retriedCount));
    }
    if (this.cJT) {
      localContentValues.put("retryInterval", Long.valueOf(this.field_retryInterval));
    }
    if (this.cJU) {
      localContentValues.put("networkType", Integer.valueOf(this.field_networkType));
    }
    if (this.cJV) {
      localContentValues.put("pkgMd5", this.field_pkgMd5);
    }
    if (this.cJW) {
      localContentValues.put("lastRetryTime", Long.valueOf(this.field_lastRetryTime));
    }
    if (this.cJX) {
      localContentValues.put("firstTimeTried", Boolean.valueOf(this.field_firstTimeTried));
    }
    if (this.cJN) {
      localContentValues.put("reportId", Integer.valueOf(this.field_reportId));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */