package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cz
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjy = "key".hashCode();
  private static final int ckw;
  private static final int clC = "version".hashCode();
  private static final int clj;
  private boolean cju = true;
  private boolean cku = true;
  private boolean clh = true;
  private boolean clw = true;
  public String field_key;
  public int field_scene;
  public long field_updateTime;
  public int field_version;
  
  static
  {
    ckw = "scene".hashCode();
    clj = "updateTime".hashCode();
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
      if (cjy != k) {
        break label60;
      }
      this.field_key = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (clC == k) {
        this.field_version = paramCursor.getInt(i);
      } else if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cju) {
      localContentValues.put("key", this.field_key);
    }
    if (this.clw) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */