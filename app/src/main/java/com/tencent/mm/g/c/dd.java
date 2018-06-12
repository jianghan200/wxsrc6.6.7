package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dd
  extends c
{
  private static final int cKc;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP = "appId".hashCode();
  private static final int cke;
  private static final int clC = "version".hashCode();
  private static final int clF;
  private boolean cJV = true;
  private boolean cjI = true;
  private boolean cky = true;
  private boolean clw = true;
  private boolean clz = true;
  public String field_appId;
  public String field_pkgMd5;
  public String field_pkgPath;
  public int field_type;
  public int field_version;
  
  static
  {
    cke = "type".hashCode();
    cKc = "pkgMd5".hashCode();
    clF = "pkgPath".hashCode();
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
      if (ckP != k) {
        break label60;
      }
      this.field_appId = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (clC == k) {
        this.field_version = paramCursor.getInt(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cKc == k) {
        this.field_pkgMd5 = paramCursor.getString(i);
      } else if (clF == k) {
        this.field_pkgPath = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.clw) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cJV) {
      localContentValues.put("pkgMd5", this.field_pkgMd5);
    }
    if (this.clz) {
      localContentValues.put("pkgPath", this.field_pkgPath);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */