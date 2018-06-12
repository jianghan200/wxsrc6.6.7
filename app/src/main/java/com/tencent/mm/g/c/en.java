package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class en
  extends c
{
  private static final int cSh = "pref_key".hashCode();
  private static final int cSi = "pref_title".hashCode();
  private static final int cSj = "pref_url".hashCode();
  private static final int cSk = "is_show".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cSd = true;
  private boolean cSe = true;
  private boolean cSf = true;
  private boolean cSg = true;
  public int field_is_show;
  public String field_pref_key;
  public String field_pref_title;
  public String field_pref_url;
  
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
      if (cSh != k) {
        break label65;
      }
      this.field_pref_key = paramCursor.getString(i);
      this.cSd = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cSi == k) {
        this.field_pref_title = paramCursor.getString(i);
      } else if (cSj == k) {
        this.field_pref_url = paramCursor.getString(i);
      } else if (cSk == k) {
        this.field_is_show = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cSd) {
      localContentValues.put("pref_key", this.field_pref_key);
    }
    if (this.cSe) {
      localContentValues.put("pref_title", this.field_pref_title);
    }
    if (this.cSf) {
      localContentValues.put("pref_url", this.field_pref_url);
    }
    if (this.cSg) {
      localContentValues.put("is_show", Integer.valueOf(this.field_is_show));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */