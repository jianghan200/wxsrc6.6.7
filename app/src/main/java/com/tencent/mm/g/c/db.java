package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class db
  extends c
{
  private static final int cJO = "sceneList".hashCode();
  private static final int cJP = "cgiList".hashCode();
  private static final int cJQ = "reportId".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestAppIDIndex ON PredownloadBlockCgiRequest(appId)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestStartTimeIndex ON PredownloadBlockCgiRequest(startTime)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestEndTimeIndex ON PredownloadBlockCgiRequest(endTime)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cjj;
  private static final int cjk;
  private static final int ckP;
  private static final int cli = "username".hashCode();
  private boolean cJL = true;
  private boolean cJM = true;
  private boolean cJN = true;
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cky = true;
  private boolean clg = true;
  public String field_appId;
  public String field_cgiList;
  public long field_endTime;
  public int field_reportId;
  public String field_sceneList;
  public long field_startTime;
  public String field_username;
  
  static
  {
    ckP = "appId".hashCode();
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
      if (cli != k) {
        break label65;
      }
      this.field_username = paramCursor.getString(i);
      this.clg = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cjj == k) {
        this.field_startTime = paramCursor.getLong(i);
      } else if (cjk == k) {
        this.field_endTime = paramCursor.getLong(i);
      } else if (cJO == k) {
        this.field_sceneList = paramCursor.getString(i);
      } else if (cJP == k) {
        this.field_cgiList = paramCursor.getString(i);
      } else if (cJQ == k) {
        this.field_reportId = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.cJL) {
      localContentValues.put("sceneList", this.field_sceneList);
    }
    if (this.cJM) {
      localContentValues.put("cgiList", this.field_cgiList);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */