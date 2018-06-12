package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cx
  extends c
{
  private static final int cJx = "cardUserId".hashCode();
  private static final int cJy = "retryCount".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cJv = true;
  private boolean cJw = true;
  public String field_cardUserId;
  public int field_retryCount;
  
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
      if (cJx != k) {
        break label65;
      }
      this.field_cardUserId = paramCursor.getString(i);
      this.cJv = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cJy == k) {
        this.field_retryCount = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cJv) {
      localContentValues.put("cardUserId", this.field_cardUserId);
    }
    if (this.cJw) {
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */