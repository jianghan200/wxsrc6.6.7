package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class eo
  extends c
{
  private static final int cRE = "wallet_region".hashCode();
  private static final int cSm = "wallet_grey_item_buf".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cRz = true;
  private boolean cSl = true;
  public byte[] field_wallet_grey_item_buf;
  public int field_wallet_region;
  
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
      if (cRE != k) {
        break label65;
      }
      this.field_wallet_region = paramCursor.getInt(i);
      this.cRz = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cSm == k) {
        this.field_wallet_grey_item_buf = paramCursor.getBlob(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRz) {
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    }
    if (this.cSl) {
      localContentValues.put("wallet_grey_item_buf", this.field_wallet_grey_item_buf);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */