package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class k
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjy = "key".hashCode();
  private static final int cln = "data".hashCode();
  private static final int clo = "dataType".hashCode();
  private static final int clp = "size".hashCode();
  private boolean cju = true;
  private boolean clk = true;
  private boolean cll = true;
  private boolean clm = true;
  public String field_data;
  public String field_dataType;
  public String field_key;
  public int field_size;
  
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
      this.field_key = paramCursor.getString(i);
      this.cju = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cln == k) {
        this.field_data = paramCursor.getString(i);
      } else if (clo == k) {
        this.field_dataType = paramCursor.getString(i);
      } else if (clp == k) {
        this.field_size = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cju) {
      localContentValues.put("key", this.field_key);
    }
    if (this.clk) {
      localContentValues.put("data", this.field_data);
    }
    if (this.cll) {
      localContentValues.put("dataType", this.field_dataType);
    }
    if (this.clm) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */