package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class e
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjA;
  private static final int cjB;
  private static final int cjy = "key".hashCode();
  private static final int cjz = "mau".hashCode();
  private boolean cju = true;
  private boolean cjv = true;
  private boolean cjw = true;
  private boolean cjx = true;
  public int field_dau;
  public int field_key;
  public int field_mau;
  public long field_useTime;
  
  static
  {
    cjA = "dau".hashCode();
    cjB = "useTime".hashCode();
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
      if (cjy != k) {
        break label65;
      }
      this.field_key = paramCursor.getInt(i);
      this.cju = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cjz == k) {
        this.field_mau = paramCursor.getInt(i);
      } else if (cjA == k) {
        this.field_dau = paramCursor.getInt(i);
      } else if (cjB == k) {
        this.field_useTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cju) {
      localContentValues.put("key", Integer.valueOf(this.field_key));
    }
    if (this.cjv) {
      localContentValues.put("mau", Integer.valueOf(this.field_mau));
    }
    if (this.cjw) {
      localContentValues.put("dau", Integer.valueOf(this.field_dau));
    }
    if (this.cjx) {
      localContentValues.put("useTime", Long.valueOf(this.field_useTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */