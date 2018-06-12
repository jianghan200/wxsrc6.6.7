package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bs
  extends c
{
  private static final int cBA = "cache".hashCode();
  private static final int cBz;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cBx = true;
  private boolean cBy = true;
  public byte[] field_cache;
  public String field_reqType;
  
  static
  {
    cBz = "reqType".hashCode();
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
      if (cBz != k) {
        break label65;
      }
      this.field_reqType = paramCursor.getString(i);
      this.cBx = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cBA == k) {
        this.field_cache = paramCursor.getBlob(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cBx) {
      localContentValues.put("reqType", this.field_reqType);
    }
    if (this.cBy) {
      localContentValues.put("cache", this.field_cache);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */