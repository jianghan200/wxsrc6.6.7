package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class x
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnJ = "brandUserName".hashCode();
  private static final int cov = "userId".hashCode();
  private boolean cnv = true;
  private boolean cou = true;
  public String field_brandUserName;
  public String field_userId;
  
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
      if (cnJ != k) {
        break label65;
      }
      this.field_brandUserName = paramCursor.getString(i);
      this.cnv = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cov == k) {
        this.field_userId = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cnv) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.cou) {
      localContentValues.put("userId", this.field_userId);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */