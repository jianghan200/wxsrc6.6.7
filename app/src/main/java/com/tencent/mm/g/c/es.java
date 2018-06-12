package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class es
  extends c
{
  private static final int cAY;
  private static final int cBd;
  private static final int cTB;
  private static final int cTC;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjf;
  private static final int ckP = "appId".hashCode();
  private static final int clp;
  private boolean cAP = true;
  private boolean cAU = true;
  private boolean cTA = true;
  private boolean cTz = true;
  private boolean ciX = true;
  private boolean cky = true;
  private boolean clm = true;
  public String field_appId;
  public String field_appIdKey;
  public long field_expireTime;
  public long field_size;
  public long field_timeStamp;
  public String field_value;
  public String field_weight;
  
  static
  {
    cTB = "appIdKey".hashCode();
    cjf = "value".hashCode();
    cBd = "weight".hashCode();
    cAY = "expireTime".hashCode();
    cTC = "timeStamp".hashCode();
    clp = "size".hashCode();
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
      if (ckP != k) {
        break label60;
      }
      this.field_appId = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cTB == k)
      {
        this.field_appIdKey = paramCursor.getString(i);
        this.cTz = true;
      }
      else if (cjf == k)
      {
        this.field_value = paramCursor.getString(i);
      }
      else if (cBd == k)
      {
        this.field_weight = paramCursor.getString(i);
      }
      else if (cAY == k)
      {
        this.field_expireTime = paramCursor.getLong(i);
      }
      else if (cTC == k)
      {
        this.field_timeStamp = paramCursor.getLong(i);
      }
      else if (clp == k)
      {
        this.field_size = paramCursor.getLong(i);
      }
      else if (ciP == k)
      {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cTz) {
      localContentValues.put("appIdKey", this.field_appIdKey);
    }
    if (this.ciX) {
      localContentValues.put("value", this.field_value);
    }
    if (this.cAU) {
      localContentValues.put("weight", this.field_weight);
    }
    if (this.cAP) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.cTA) {
      localContentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
    }
    if (this.clm) {
      localContentValues.put("size", Long.valueOf(this.field_size));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */