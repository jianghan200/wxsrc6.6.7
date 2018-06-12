package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cr
  extends c
{
  private static final int cIS;
  private static final int cIT;
  private static final int cIU = "receive_time".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private boolean cIP = true;
  private boolean cIQ = true;
  private boolean cIR = true;
  private boolean ciS = true;
  public String field_ack_key;
  public long field_receive_time;
  public String field_reqkey;
  public int field_status;
  
  static
  {
    cIS = "reqkey".hashCode();
    cIT = "ack_key".hashCode();
    ciV = "status".hashCode();
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
      if (cIS != k) {
        break label65;
      }
      this.field_reqkey = paramCursor.getString(i);
      this.cIP = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cIT == k) {
        this.field_ack_key = paramCursor.getString(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cIU == k) {
        this.field_receive_time = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cIP) {
      localContentValues.put("reqkey", this.field_reqkey);
    }
    if (this.cIQ) {
      localContentValues.put("ack_key", this.field_ack_key);
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cIR) {
      localContentValues.put("receive_time", Long.valueOf(this.field_receive_time));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */