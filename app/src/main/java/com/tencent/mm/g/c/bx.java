package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bx
  extends c
{
  private static final int cDe;
  private static final int cDf;
  private static final int cDg = "liketips".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cli;
  private static final int cyU;
  private boolean cDb = true;
  private boolean cDc = true;
  private boolean cDd = true;
  private boolean clg = true;
  private boolean cyK = true;
  public String field_appusername;
  public String field_liketips;
  public String field_rankID;
  public int field_timestamp;
  public String field_username;
  
  static
  {
    cDe = "rankID".hashCode();
    cDf = "appusername".hashCode();
    cli = "username".hashCode();
    cyU = "timestamp".hashCode();
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
      if (cDe != k) {
        break label60;
      }
      this.field_rankID = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cDf == k) {
        this.field_appusername = paramCursor.getString(i);
      } else if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (cyU == k) {
        this.field_timestamp = paramCursor.getInt(i);
      } else if (cDg == k) {
        this.field_liketips = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cDb) {
      localContentValues.put("rankID", this.field_rankID);
    }
    if (this.cDc) {
      localContentValues.put("appusername", this.field_appusername);
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cyK) {
      localContentValues.put("timestamp", Integer.valueOf(this.field_timestamp));
    }
    if (this.field_liketips == null) {
      this.field_liketips = "";
    }
    if (this.cDd) {
      localContentValues.put("liketips", this.field_liketips);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */