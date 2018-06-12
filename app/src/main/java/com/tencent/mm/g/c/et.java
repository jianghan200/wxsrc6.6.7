package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class et
  extends c
{
  private static final int cTC = "timeStamp".hashCode();
  private static final int cTF;
  private static final int cTG;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int clt = "recordId".hashCode();
  private static final int cnf;
  private static final int cnh;
  private boolean cTA = true;
  private boolean cTD = true;
  private boolean cTE = true;
  private boolean clq = true;
  private boolean cnb = true;
  private boolean cnd = true;
  public String field_imgUrl;
  public String field_link;
  public String field_recordId;
  public String field_source;
  public long field_timeStamp;
  public String field_title;
  
  static
  {
    cTF = "link".hashCode();
    cnf = "title".hashCode();
    cnh = "source".hashCode();
    cTG = "imgUrl".hashCode();
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
      this.field_recordId = paramCursor.getString(i);
      this.clq = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cTF == k) {
        this.field_link = paramCursor.getString(i);
      } else if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (cnh == k) {
        this.field_source = paramCursor.getString(i);
      } else if (cTG == k) {
        this.field_imgUrl = paramCursor.getString(i);
      } else if (cTC == k) {
        this.field_timeStamp = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clq) {
      localContentValues.put("recordId", this.field_recordId);
    }
    if (this.cTD) {
      localContentValues.put("link", this.field_link);
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cnd) {
      localContentValues.put("source", this.field_source);
    }
    if (this.cTE) {
      localContentValues.put("imgUrl", this.field_imgUrl);
    }
    if (this.cTA) {
      localContentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */