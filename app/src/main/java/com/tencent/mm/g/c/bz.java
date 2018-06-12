package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bz
  extends c
{
  private static final int cDe;
  private static final int cDf;
  private static final int cDk;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cli;
  private static final int cuX;
  private boolean cDb = true;
  private boolean cDc = true;
  private boolean cDj = true;
  private boolean clg = true;
  private boolean cux = true;
  public String field_appusername;
  public String field_rankID;
  public int field_sort;
  public int field_step;
  public String field_username;
  
  static
  {
    cDf = "appusername".hashCode();
    cDe = "rankID".hashCode();
    cli = "username".hashCode();
    cDk = "step".hashCode();
    cuX = "sort".hashCode();
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
      if (cDf != k) {
        break label60;
      }
      this.field_appusername = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cDe == k) {
        this.field_rankID = paramCursor.getString(i);
      } else if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (cDk == k) {
        this.field_step = paramCursor.getInt(i);
      } else if (cuX == k) {
        this.field_sort = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cDc) {
      localContentValues.put("appusername", this.field_appusername);
    }
    if (this.cDb) {
      localContentValues.put("rankID", this.field_rankID);
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cDj) {
      localContentValues.put("step", Integer.valueOf(this.field_step));
    }
    if (this.cux) {
      localContentValues.put("sort", Integer.valueOf(this.field_sort));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */