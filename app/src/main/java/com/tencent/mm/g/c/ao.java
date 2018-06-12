package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ao
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP = "appId".hashCode();
  private static final int clv = "versionType".hashCode();
  private static final int ctZ = "extJson".hashCode();
  private boolean cky = true;
  private boolean cls = true;
  private boolean ctY = true;
  public String field_appId;
  public String field_extJson;
  public int field_versionType;
  
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
      if (clv == k) {
        this.field_versionType = paramCursor.getInt(i);
      } else if (ctZ == k) {
        this.field_extJson = paramCursor.getString(i);
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
    if (this.cls) {
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    }
    if (this.ctY) {
      localContentValues.put("extJson", this.field_extJson);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */