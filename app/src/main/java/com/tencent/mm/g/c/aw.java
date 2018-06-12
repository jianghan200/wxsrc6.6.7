package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class aw
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckj;
  private static final int cuK = "productID".hashCode();
  private static final int cwA;
  private boolean cjN = true;
  private boolean cuk = true;
  private boolean cwz = true;
  public byte[] field_content;
  public String field_lan;
  public String field_productID;
  
  static
  {
    ckj = "content".hashCode();
    cwA = "lan".hashCode();
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
      if (cuK != k) {
        break label65;
      }
      this.field_productID = paramCursor.getString(i);
      this.cuk = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckj == k) {
        this.field_content = paramCursor.getBlob(i);
      } else if (cwA == k) {
        this.field_lan = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cuk) {
      localContentValues.put("productID", this.field_productID);
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_lan == null) {
      this.field_lan = "";
    }
    if (this.cwz) {
      localContentValues.put("lan", this.field_lan);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */