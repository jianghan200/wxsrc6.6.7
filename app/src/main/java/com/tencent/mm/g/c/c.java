package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;

public abstract class c
  extends com.tencent.mm.sdk.e.c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cje = "abtestkey".hashCode();
  private static final int cjf = "value".hashCode();
  private static final int cjg = "expId".hashCode();
  private static final int cjh = "sequence".hashCode();
  private static final int cji = "prioritylevel".hashCode();
  private static final int cjj = "startTime".hashCode();
  private static final int cjk = "endTime".hashCode();
  private static final int cjl = "noReport".hashCode();
  private boolean ciW = true;
  private boolean ciX = true;
  private boolean ciY = true;
  private boolean ciZ = true;
  private boolean cja = true;
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cjd = true;
  public String field_abtestkey;
  public long field_endTime;
  public String field_expId;
  public boolean field_noReport;
  public int field_prioritylevel;
  public long field_sequence;
  public long field_startTime;
  public String field_value;
  
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
      if (cje != k) {
        break label65;
      }
      this.field_abtestkey = paramCursor.getString(i);
      this.ciW = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cjf == k)
      {
        this.field_value = paramCursor.getString(i);
      }
      else if (cjg == k)
      {
        this.field_expId = paramCursor.getString(i);
      }
      else if (cjh == k)
      {
        this.field_sequence = paramCursor.getLong(i);
      }
      else if (cji == k)
      {
        this.field_prioritylevel = paramCursor.getInt(i);
      }
      else if (cjj == k)
      {
        this.field_startTime = paramCursor.getLong(i);
      }
      else if (cjk == k)
      {
        this.field_endTime = paramCursor.getLong(i);
      }
      else
      {
        if (cjl == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_noReport = bool;
            break;
          }
        }
        if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciW) {
      localContentValues.put("abtestkey", this.field_abtestkey);
    }
    if (this.ciX) {
      localContentValues.put("value", this.field_value);
    }
    if (this.ciY) {
      localContentValues.put("expId", this.field_expId);
    }
    if (this.ciZ) {
      localContentValues.put("sequence", Long.valueOf(this.field_sequence));
    }
    if (this.cja) {
      localContentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.cjd) {
      localContentValues.put("noReport", Boolean.valueOf(this.field_noReport));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */