package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class u
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjj;
  private static final int cjk;
  private static final int cnq = "sessionName".hashCode();
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cnn = true;
  public long field_endTime;
  public String field_sessionName;
  public long field_startTime;
  
  static
  {
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
      if (cnq != k) {
        break label60;
      }
      this.field_sessionName = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cjj == k) {
        this.field_startTime = paramCursor.getLong(i);
      } else if (cjk == k) {
        this.field_endTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_sessionName == null) {
      this.field_sessionName = "";
    }
    if (this.cnn) {
      localContentValues.put("sessionName", this.field_sessionName);
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */