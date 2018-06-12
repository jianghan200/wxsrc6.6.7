package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ba
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cwO;
  private static final int cwS = "exptKey".hashCode();
  private boolean cwL = true;
  private boolean cwR = true;
  public int field_exptId;
  public String field_exptKey;
  
  static
  {
    cwO = "exptId".hashCode();
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
      if (cwS != k) {
        break label65;
      }
      this.field_exptKey = paramCursor.getString(i);
      this.cwR = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cwO == k) {
        this.field_exptId = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cwR) {
      localContentValues.put("exptKey", this.field_exptKey);
    }
    if (this.cwL) {
      localContentValues.put("exptId", Integer.valueOf(this.field_exptId));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */