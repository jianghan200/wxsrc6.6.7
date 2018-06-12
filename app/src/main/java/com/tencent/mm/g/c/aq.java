package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class aq
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int clj;
  private static final int cln;
  private static final int cuh = "id".hashCode();
  private static final int cui = "cacheKey".hashCode();
  private static final int cuj;
  private boolean cky = true;
  private boolean clh = true;
  private boolean clk = true;
  private boolean cue = true;
  private boolean cuf = true;
  private boolean cug = true;
  public String field_appId;
  public String field_cacheKey;
  public String field_data;
  public String field_id;
  public int field_interval;
  public long field_updateTime;
  
  static
  {
    ckP = "appId".hashCode();
    cln = "data".hashCode();
    cuj = "interval".hashCode();
    clj = "updateTime".hashCode();
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
      if (cuh != k) {
        break label60;
      }
      this.field_id = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cui == k) {
        this.field_cacheKey = paramCursor.getString(i);
      } else if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cln == k) {
        this.field_data = paramCursor.getString(i);
      } else if (cuj == k) {
        this.field_interval = paramCursor.getInt(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cue) {
      localContentValues.put("id", this.field_id);
    }
    if (this.cuf) {
      localContentValues.put("cacheKey", this.field_cacheKey);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.clk) {
      localContentValues.put("data", this.field_data);
    }
    if (this.cug) {
      localContentValues.put("interval", Integer.valueOf(this.field_interval));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */