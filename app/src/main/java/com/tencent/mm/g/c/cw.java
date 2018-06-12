package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cw
  extends c
{
  private static final int cBa = "isRead".hashCode();
  private static final int cJu;
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private boolean cAR = true;
  private boolean cJt = true;
  private boolean ciK = true;
  public String field_isRead;
  public String field_msgContentXml;
  public String field_msgId;
  
  static
  {
    cJu = "msgContentXml".hashCode();
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
      if (ciO != k) {
        break label65;
      }
      this.field_msgId = paramCursor.getString(i);
      this.ciK = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cJu == k) {
        this.field_msgContentXml = paramCursor.getString(i);
      } else if (cBa == k) {
        this.field_isRead = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciK) {
      localContentValues.put("msgId", this.field_msgId);
    }
    if (this.cJt) {
      localContentValues.put("msgContentXml", this.field_msgContentXml);
    }
    if (this.cAR) {
      localContentValues.put("isRead", this.field_isRead);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */