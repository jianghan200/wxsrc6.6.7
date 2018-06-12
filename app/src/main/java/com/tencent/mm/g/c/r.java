package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class r
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int cnk = "flag".hashCode();
  private static final int cnl;
  private boolean cky = true;
  private boolean cni = true;
  private boolean cnj = true;
  public String field_appId;
  public long field_flag;
  public int field_sortId;
  
  static
  {
    ckP = "appId".hashCode();
    cnl = "sortId".hashCode();
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
      if (cnk != k) {
        break label60;
      }
      this.field_flag = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cnl == k) {
        this.field_sortId = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cni) {
      localContentValues.put("flag", Long.valueOf(this.field_flag));
    }
    if (this.field_appId == null) {
      this.field_appId = "";
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cnj) {
      localContentValues.put("sortId", Integer.valueOf(this.field_sortId));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */