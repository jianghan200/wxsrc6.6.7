package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class de
  extends c
{
  private static final int cJQ = "reportId".hashCode();
  private static final int cKg;
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableStartTimeIndex ON PredownloadIssueLaunchWxaAppResponse(startTime)", "CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableEndTimeIndex ON PredownloadIssueLaunchWxaAppResponse(endTime)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cjj;
  private static final int cjk;
  private static final int ckP = "appId".hashCode();
  private static final int ckw = "scene".hashCode();
  private boolean cJN = true;
  private boolean cKf = true;
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cku = true;
  private boolean cky = true;
  public String field_appId;
  public long field_endTime;
  public byte[] field_launchProtoBlob;
  public long field_reportId;
  public int field_scene;
  public long field_startTime;
  
  static
  {
    cKg = "launchProtoBlob".hashCode();
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
      if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
      } else if (cKg == k) {
        this.field_launchProtoBlob = paramCursor.getBlob(i);
      } else if (cjj == k) {
        this.field_startTime = paramCursor.getLong(i);
      } else if (cjk == k) {
        this.field_endTime = paramCursor.getLong(i);
      } else if (cJQ == k) {
        this.field_reportId = paramCursor.getLong(i);
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
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.cKf) {
      localContentValues.put("launchProtoBlob", this.field_launchProtoBlob);
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.cJN) {
      localContentValues.put("reportId", Long.valueOf(this.field_reportId));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */