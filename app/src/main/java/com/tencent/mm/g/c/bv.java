package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bv
  extends c
{
  private static final int cCp = "championUrl".hashCode();
  private static final int cCq = "championMotto".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cli = "username".hashCode();
  private boolean cCn = true;
  private boolean cCo = true;
  private boolean clg = true;
  public String field_championMotto;
  public String field_championUrl;
  public String field_username;
  
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
      if (cli != k) {
        break label60;
      }
      this.field_username = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cCp == k) {
        this.field_championUrl = paramCursor.getString(i);
      } else if (cCq == k) {
        this.field_championMotto = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cCn) {
      localContentValues.put("championUrl", this.field_championUrl);
    }
    if (this.cCo) {
      localContentValues.put("championMotto", this.field_championMotto);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */