package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ee
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int cli;
  private static final int cmt = "openId".hashCode();
  private boolean cky = true;
  private boolean clW = true;
  private boolean clg = true;
  public String field_appId;
  public String field_openId;
  public String field_username;
  
  static
  {
    ckP = "appId".hashCode();
    cli = "username".hashCode();
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
      if (cmt != k) {
        break label65;
      }
      this.field_openId = paramCursor.getString(i);
      this.clW = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clW) {
      localContentValues.put("openId", this.field_openId);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */