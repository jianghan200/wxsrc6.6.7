package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ec
  extends c
{
  private static final int cPf = "tableHash".hashCode();
  private static final int cPg = "tableSQLMD5".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cPd = true;
  private boolean cPe = true;
  public int field_tableHash;
  public String field_tableSQLMD5;
  
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
      if (cPf != k) {
        break label65;
      }
      this.field_tableHash = paramCursor.getInt(i);
      this.cPd = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cPg == k) {
        this.field_tableSQLMD5 = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cPd) {
      localContentValues.put("tableHash", Integer.valueOf(this.field_tableHash));
    }
    if (this.cPe) {
      localContentValues.put("tableSQLMD5", this.field_tableSQLMD5);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */