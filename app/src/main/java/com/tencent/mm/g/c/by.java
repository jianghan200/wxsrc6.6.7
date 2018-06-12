package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class by
  extends c
{
  private static final int cDf;
  private static final int cDi = "score".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnf;
  private boolean cDc;
  private boolean cDh;
  private boolean cnb;
  public String field_appusername;
  public int field_score;
  public String field_title;
  
  static
  {
    cDf = "appusername".hashCode();
    cnf = "title".hashCode();
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
      if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (cDi == k) {
        this.field_score = paramCursor.getInt(i);
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
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cDh) {
      localContentValues.put("score", Integer.valueOf(this.field_score));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */