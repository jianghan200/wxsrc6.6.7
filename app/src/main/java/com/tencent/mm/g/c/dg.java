package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dg
  extends c
{
  private static final int cJQ = "reportId".hashCode();
  private static final int cKE;
  private static final int cKc;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP = "appId".hashCode();
  private static final int cmj = "appVersion".hashCode();
  private boolean cJN = true;
  private boolean cJV = true;
  private boolean cKD = true;
  private boolean cky = true;
  private boolean clM = true;
  public String field_appId;
  public int field_appVersion;
  public String field_decryptKey;
  public String field_pkgMd5;
  public int field_reportId;
  
  static
  {
    cKE = "decryptKey".hashCode();
    cKc = "pkgMd5".hashCode();
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
      if (cmj == k) {
        this.field_appVersion = paramCursor.getInt(i);
      } else if (cKE == k) {
        this.field_decryptKey = paramCursor.getString(i);
      } else if (cKc == k) {
        this.field_pkgMd5 = paramCursor.getString(i);
      } else if (cJQ == k) {
        this.field_reportId = paramCursor.getInt(i);
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
    if (this.clM) {
      localContentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
    }
    if (this.cKD) {
      localContentValues.put("decryptKey", this.field_decryptKey);
    }
    if (this.cJV) {
      localContentValues.put("pkgMd5", this.field_pkgMd5);
    }
    if (this.cJN) {
      localContentValues.put("reportId", Integer.valueOf(this.field_reportId));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */