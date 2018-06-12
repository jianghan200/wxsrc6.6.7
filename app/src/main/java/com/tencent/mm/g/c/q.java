package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class q
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int cke;
  private static final int cne = "xml".hashCode();
  private static final int cnf;
  private static final int cng;
  private static final int cnh;
  private boolean ciK = true;
  private boolean cjI = true;
  private boolean cky = true;
  private boolean cna = true;
  private boolean cnb = true;
  private boolean cnc = true;
  private boolean cnd = true;
  public String field_appId;
  public String field_description;
  public long field_msgId;
  public String field_source;
  public String field_title;
  public int field_type;
  public String field_xml;
  
  static
  {
    ckP = "appId".hashCode();
    cnf = "title".hashCode();
    cng = "description".hashCode();
    cnh = "source".hashCode();
    cke = "type".hashCode();
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
      this.field_msgId = paramCursor.getLong(i);
      this.ciK = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cne == k) {
        this.field_xml = paramCursor.getString(i);
      } else if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (cng == k) {
        this.field_description = paramCursor.getString(i);
      } else if (cnh == k) {
        this.field_source = paramCursor.getString(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciK) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.cna) {
      localContentValues.put("xml", this.field_xml);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cnc) {
      localContentValues.put("description", this.field_description);
    }
    if (this.cnd) {
      localContentValues.put("source", this.field_source);
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */