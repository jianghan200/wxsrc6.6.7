package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class em
  extends c
{
  private static final int cBe = "receiveTime".hashCode();
  private static final int cKW = "receiveStatus".hashCode();
  private static final int cRZ;
  private static final int cSa;
  private static final int cSb;
  private static final int cSc = "hbStatus".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cAV = true;
  private boolean cKU = true;
  private boolean cRV = true;
  private boolean cRW = true;
  private boolean cRX = true;
  private boolean cRY = true;
  public int field_hbStatus;
  public int field_hbType;
  public String field_mNativeUrl;
  public long field_receiveAmount;
  public int field_receiveStatus;
  public long field_receiveTime;
  
  static
  {
    cRZ = "mNativeUrl".hashCode();
    cSa = "hbType".hashCode();
    cSb = "receiveAmount".hashCode();
  }
  
  public void d(Cursor paramCursor)
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
      if (cRZ != k) {
        break label65;
      }
      this.field_mNativeUrl = paramCursor.getString(i);
      this.cRV = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cSa == k) {
        this.field_hbType = paramCursor.getInt(i);
      } else if (cSb == k) {
        this.field_receiveAmount = paramCursor.getLong(i);
      } else if (cBe == k) {
        this.field_receiveTime = paramCursor.getLong(i);
      } else if (cKW == k) {
        this.field_receiveStatus = paramCursor.getInt(i);
      } else if (cSc == k) {
        this.field_hbStatus = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRV) {
      localContentValues.put("mNativeUrl", this.field_mNativeUrl);
    }
    if (this.cRW) {
      localContentValues.put("hbType", Integer.valueOf(this.field_hbType));
    }
    if (this.cRX) {
      localContentValues.put("receiveAmount", Long.valueOf(this.field_receiveAmount));
    }
    if (this.cAV) {
      localContentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
    }
    if (this.cKU) {
      localContentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
    }
    if (this.cRY) {
      localContentValues.put("hbStatus", Integer.valueOf(this.field_hbStatus));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */