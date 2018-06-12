package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dm
  extends c
{
  private static final int cEa = "createtime".hashCode();
  private static final int cMf;
  private static final int cMg;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cvR;
  private boolean cDV = true;
  private boolean cMd = true;
  private boolean cMe = true;
  private boolean cvp = true;
  public long field_createtime;
  public String field_devicetype;
  public String field_name;
  public String field_uid;
  
  static
  {
    cMf = "uid".hashCode();
    cvR = "name".hashCode();
    cMg = "devicetype".hashCode();
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
      if (cMf != k) {
        break label65;
      }
      this.field_uid = paramCursor.getString(i);
      this.cMd = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cvR == k) {
        this.field_name = paramCursor.getString(i);
      } else if (cMg == k) {
        this.field_devicetype = paramCursor.getString(i);
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
    if (this.field_uid == null) {
      this.field_uid = "";
    }
    if (this.cMd) {
      localContentValues.put("uid", this.field_uid);
    }
    if (this.field_name == null) {
      this.field_name = "";
    }
    if (this.cvp) {
      localContentValues.put("name", this.field_name);
    }
    if (this.field_devicetype == null) {
      this.field_devicetype = "";
    }
    if (this.cMe) {
      localContentValues.put("devicetype", this.field_devicetype);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */