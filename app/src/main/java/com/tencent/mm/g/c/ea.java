package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ea
  extends c
{
  private static final int cDk;
  private static final int cOW;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cuh = "id".hashCode();
  private static final int cyU;
  private boolean cDj = true;
  private boolean cOV = true;
  private boolean cue = true;
  private boolean cyK = true;
  public String field_date;
  public int field_id;
  public int field_step;
  public long field_timestamp;
  
  static
  {
    cOW = "date".hashCode();
    cDk = "step".hashCode();
    cyU = "timestamp".hashCode();
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
        break label65;
      }
      this.field_id = paramCursor.getInt(i);
      this.cue = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cOW == k) {
        this.field_date = paramCursor.getString(i);
      } else if (cDk == k) {
        this.field_step = paramCursor.getInt(i);
      } else if (cyU == k) {
        this.field_timestamp = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cue) {
      localContentValues.put("id", Integer.valueOf(this.field_id));
    }
    if (this.cOV) {
      localContentValues.put("date", this.field_date);
    }
    if (this.cDj) {
      localContentValues.put("step", Integer.valueOf(this.field_step));
    }
    if (this.cyK) {
      localContentValues.put("timestamp", Long.valueOf(this.field_timestamp));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */