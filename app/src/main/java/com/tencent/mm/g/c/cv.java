package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cv
  extends c
{
  private static final int cJq = "sceneFlag".hashCode();
  private static final int cJr = "msgTypeFlag".hashCode();
  private static final int cJs = "msgState".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckP = "appId".hashCode();
  private static final int cml = "packageName".hashCode();
  private boolean cJn = true;
  private boolean cJo = true;
  private boolean cJp = true;
  private boolean ciS = true;
  private boolean cky = true;
  private boolean clO = true;
  public String field_appId;
  public int field_msgState;
  public int field_msgTypeFlag;
  public String field_packageName;
  public int field_sceneFlag;
  public int field_status;
  
  static
  {
    ciV = "status".hashCode();
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
        break label65;
      }
      this.field_appId = paramCursor.getString(i);
      this.cky = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cml == k) {
        this.field_packageName = paramCursor.getString(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cJq == k) {
        this.field_sceneFlag = paramCursor.getInt(i);
      } else if (cJr == k) {
        this.field_msgTypeFlag = paramCursor.getInt(i);
      } else if (cJs == k) {
        this.field_msgState = paramCursor.getInt(i);
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
    if (this.clO) {
      localContentValues.put("packageName", this.field_packageName);
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cJn) {
      localContentValues.put("sceneFlag", Integer.valueOf(this.field_sceneFlag));
    }
    if (this.cJo) {
      localContentValues.put("msgTypeFlag", Integer.valueOf(this.field_msgTypeFlag));
    }
    if (this.cJp) {
      localContentValues.put("msgState", Integer.valueOf(this.field_msgState));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */