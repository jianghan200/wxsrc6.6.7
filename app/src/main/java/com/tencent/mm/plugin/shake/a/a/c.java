package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;

public abstract class c
  extends com.tencent.mm.sdk.e.c
{
  private static final int cEa = "createtime".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cli = "username".hashCode();
  private static final int cnf;
  private static final int mWy = "deeplink".hashCode();
  private static final int mWz;
  private boolean cDV = true;
  private boolean clg = true;
  private boolean cnb = true;
  public long field_createtime;
  public String field_deeplink;
  public String field_iconurl;
  public String field_title;
  public String field_username;
  private boolean mWw = true;
  private boolean mWx = true;
  
  static
  {
    cnf = "title".hashCode();
    mWz = "iconurl".hashCode();
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
      if (cli != k) {
        break label65;
      }
      this.field_username = paramCursor.getString(i);
      this.clg = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (mWy == k) {
        this.field_deeplink = paramCursor.getString(i);
      } else if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (mWz == k) {
        this.field_iconurl = paramCursor.getString(i);
      } else if (cEa == k) {
        this.field_createtime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.field_deeplink == null) {
      this.field_deeplink = "";
    }
    if (this.mWw) {
      localContentValues.put("deeplink", this.field_deeplink);
    }
    if (this.field_title == null) {
      this.field_title = "";
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.field_iconurl == null) {
      this.field_iconurl = "";
    }
    if (this.mWx) {
      localContentValues.put("iconurl", this.field_iconurl);
    }
    if (this.cDV) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/shake/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */