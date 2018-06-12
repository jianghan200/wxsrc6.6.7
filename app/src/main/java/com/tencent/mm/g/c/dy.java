package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dy
  extends c
{
  private static final int cOM;
  private static final int cON;
  private static final int cOO;
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS snsreport_kv_logtime ON SnsReportKv(logtime)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cjf;
  private static final int ckV;
  private boolean cOJ = true;
  private boolean cOK = true;
  private boolean cOL = true;
  private boolean ciX = true;
  private boolean ckE = true;
  public int field_errorcount;
  public int field_logsize;
  public long field_logtime;
  public int field_offset;
  public byte[] field_value;
  
  static
  {
    cOM = "logtime".hashCode();
    ckV = "offset".hashCode();
    cON = "logsize".hashCode();
    cOO = "errorcount".hashCode();
    cjf = "value".hashCode();
  }
  
  public void d(Cursor paramCursor)
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
      if (cOM != k) {
        break label60;
      }
      this.field_logtime = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (ckV == k) {
        this.field_offset = paramCursor.getInt(i);
      } else if (cON == k) {
        this.field_logsize = paramCursor.getInt(i);
      } else if (cOO == k) {
        this.field_errorcount = paramCursor.getInt(i);
      } else if (cjf == k) {
        this.field_value = paramCursor.getBlob(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cOJ) {
      localContentValues.put("logtime", Long.valueOf(this.field_logtime));
    }
    if (this.ckE) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.cOK) {
      localContentValues.put("logsize", Integer.valueOf(this.field_logsize));
    }
    if (this.cOL) {
      localContentValues.put("errorcount", Integer.valueOf(this.field_errorcount));
    }
    if (this.ciX) {
      localContentValues.put("value", this.field_value);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */