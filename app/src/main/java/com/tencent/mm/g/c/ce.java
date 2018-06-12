package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ce
  extends c
{
  private static final int cDG = "countryCode".hashCode();
  private static final int cDH = "callTimeCount".hashCode();
  private static final int cDI = "lastCallTime".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cDD = true;
  private boolean cDE = true;
  private boolean cDF = true;
  public long field_callTimeCount;
  public int field_countryCode;
  public long field_lastCallTime;
  
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
      if (cDG != k) {
        break label65;
      }
      this.field_countryCode = paramCursor.getInt(i);
      this.cDD = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cDH == k) {
        this.field_callTimeCount = paramCursor.getLong(i);
      } else if (cDI == k) {
        this.field_lastCallTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cDD) {
      localContentValues.put("countryCode", Integer.valueOf(this.field_countryCode));
    }
    if (this.cDE) {
      localContentValues.put("callTimeCount", Long.valueOf(this.field_callTimeCount));
    }
    if (this.cDF) {
      localContentValues.put("lastCallTime", Long.valueOf(this.field_lastCallTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */