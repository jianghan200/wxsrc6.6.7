package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class an
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int ctX = "transferId".hashCode();
  private boolean ciK = true;
  private boolean ctW = true;
  public long field_msgId;
  public String field_transferId;
  
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
      if (ciO != k) {
        break label65;
      }
      this.field_msgId = paramCursor.getLong(i);
      this.ciK = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ctX == k) {
        this.field_transferId = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciK) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.ctW) {
      localContentValues.put("transferId", this.field_transferId);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */