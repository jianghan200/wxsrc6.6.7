package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dj
  extends c
{
  private static final int cKV;
  private static final int cKW;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnT;
  private static final int ctX = "transferId".hashCode();
  private boolean cKT = true;
  private boolean cKU = true;
  private boolean cnF = true;
  private boolean ctW = true;
  public boolean field_isSend;
  public long field_locaMsgId;
  public int field_receiveStatus;
  public String field_transferId;
  
  static
  {
    cKV = "locaMsgId".hashCode();
    cKW = "receiveStatus".hashCode();
    cnT = "isSend".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (ctX != k) {
        break label65;
      }
      this.field_transferId = paramCursor.getString(i);
      this.ctW = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cKV == k)
      {
        this.field_locaMsgId = paramCursor.getLong(i);
      }
      else if (cKW == k)
      {
        this.field_receiveStatus = paramCursor.getInt(i);
      }
      else
      {
        if (cnT == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isSend = bool;
            break;
          }
        }
        if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ctW) {
      localContentValues.put("transferId", this.field_transferId);
    }
    if (this.cKT) {
      localContentValues.put("locaMsgId", Long.valueOf(this.field_locaMsgId));
    }
    if (this.cKU) {
      localContentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
    }
    if (this.cnF) {
      localContentValues.put("isSend", Boolean.valueOf(this.field_isSend));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */