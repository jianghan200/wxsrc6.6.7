package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ew
  extends c
{
  private static final int cTY;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjf;
  private static final int cjy;
  private static final int ckP;
  private static final int clt = "recordId".hashCode();
  private boolean cTX = true;
  private boolean ciX = true;
  private boolean cju = true;
  private boolean cky = true;
  private boolean clq = true;
  public String field_appId;
  public String field_domin;
  public String field_key;
  public int field_recordId;
  public String field_value;
  
  static
  {
    ckP = "appId".hashCode();
    cTY = "domin".hashCode();
    cjy = "key".hashCode();
    cjf = "value".hashCode();
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
      if (clt != k) {
        break label65;
      }
      this.field_recordId = paramCursor.getInt(i);
      this.clq = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cTY == k) {
        this.field_domin = paramCursor.getString(i);
      } else if (cjy == k) {
        this.field_key = paramCursor.getString(i);
      } else if (cjf == k) {
        this.field_value = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clq) {
      localContentValues.put("recordId", Integer.valueOf(this.field_recordId));
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cTX) {
      localContentValues.put("domin", this.field_domin);
    }
    if (this.cju) {
      localContentValues.put("key", this.field_key);
    }
    if (this.ciX) {
      localContentValues.put("value", this.field_value);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */