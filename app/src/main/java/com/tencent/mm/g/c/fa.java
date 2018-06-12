package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fa
  extends c
{
  private static final int cJQ = "reportId".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS WxaAttrVersionServerNotifyRecordAppVersionIndex ON WxaAttrVersionServerNotifyRecord(appVersion)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cli = "username".hashCode();
  private static final int cmj = "appVersion".hashCode();
  private boolean cJN = true;
  private boolean clM = true;
  private boolean clg = true;
  public int field_appVersion;
  public int field_reportId;
  public String field_username;
  
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
      if (cli != k) {
        break label65;
      }
      this.field_username = paramCursor.getString(i);
      this.clg = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cmj == k) {
        this.field_appVersion = paramCursor.getInt(i);
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
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.clM) {
      localContentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */