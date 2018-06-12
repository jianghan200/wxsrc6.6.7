package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ej
  extends c
{
  private static final int cRw = "bulletin_scene".hashCode();
  private static final int cRx = "bulletin_content".hashCode();
  private static final int cRy = "bulletin_url".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cRt = true;
  private boolean cRu = true;
  private boolean cRv = true;
  public String field_bulletin_content;
  public String field_bulletin_scene;
  public String field_bulletin_url;
  
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
      if (cRw != k) {
        break label65;
      }
      this.field_bulletin_scene = paramCursor.getString(i);
      this.cRt = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cRx == k) {
        this.field_bulletin_content = paramCursor.getString(i);
      } else if (cRy == k) {
        this.field_bulletin_url = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRt) {
      localContentValues.put("bulletin_scene", this.field_bulletin_scene);
    }
    if (this.cRu) {
      localContentValues.put("bulletin_content", this.field_bulletin_content);
    }
    if (this.cRv) {
      localContentValues.put("bulletin_url", this.field_bulletin_url);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */