package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class da
  extends c
{
  private static final int cJJ = "hit".hashCode();
  private static final int cJK = "hitTimeMS".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP = "appId".hashCode();
  private static final int cke = "type".hashCode();
  private boolean cJH = true;
  private boolean cJI = true;
  private boolean cjI = true;
  private boolean cky = true;
  public String field_appId;
  public int field_hit;
  public long field_hitTimeMS;
  public int field_type;
  
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
      if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cJJ == k) {
        this.field_hit = paramCursor.getInt(i);
      } else if (cJK == k) {
        this.field_hitTimeMS = paramCursor.getLong(i);
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
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cJH) {
      localContentValues.put("hit", Integer.valueOf(this.field_hit));
    }
    if (this.cJI) {
      localContentValues.put("hitTimeMS", Long.valueOf(this.field_hitTimeMS));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */