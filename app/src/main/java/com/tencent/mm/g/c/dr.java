package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dr
  extends c
{
  private static final int cJy = "retryCount".hashCode();
  private static final int cNq;
  private static final int cNr;
  private static final int cNs;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cqC = "card_id".hashCode();
  private boolean cJw = true;
  private boolean cNn = true;
  private boolean cNo = true;
  private boolean cNp = true;
  private boolean cqj = true;
  public String field_card_id;
  public int field_retryCount;
  public long field_seq;
  public int field_state_flag;
  public long field_update_time;
  
  static
  {
    cNq = "state_flag".hashCode();
    cNr = "update_time".hashCode();
    cNs = "seq".hashCode();
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
      if (cqC != k) {
        break label65;
      }
      this.field_card_id = paramCursor.getString(i);
      this.cqj = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cNq == k) {
        this.field_state_flag = paramCursor.getInt(i);
      } else if (cNr == k) {
        this.field_update_time = paramCursor.getLong(i);
      } else if (cNs == k) {
        this.field_seq = paramCursor.getLong(i);
      } else if (cJy == k) {
        this.field_retryCount = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cqj) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.cNn) {
      localContentValues.put("state_flag", Integer.valueOf(this.field_state_flag));
    }
    if (this.cNo) {
      localContentValues.put("update_time", Long.valueOf(this.field_update_time));
    }
    if (this.cNp) {
      localContentValues.put("seq", Long.valueOf(this.field_seq));
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */