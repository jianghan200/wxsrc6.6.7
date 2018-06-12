package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class t
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnq;
  private static final int cnt = "msgListDataId".hashCode();
  private boolean cnn = true;
  private boolean cns = true;
  public String field_msgListDataId;
  public String field_sessionName;
  
  static
  {
    cnq = "sessionName".hashCode();
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
      if (cnt != k) {
        break label65;
      }
      this.field_msgListDataId = paramCursor.getString(i);
      this.cns = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cnq == k) {
        this.field_sessionName = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cns) {
      localContentValues.put("msgListDataId", this.field_msgListDataId);
    }
    if (this.field_sessionName == null) {
      this.field_sessionName = "";
    }
    if (this.cnn) {
      localContentValues.put("sessionName", this.field_sessionName);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */