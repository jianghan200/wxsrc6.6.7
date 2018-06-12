package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cc
  extends c
{
  private static final int cDv = "wechatUsername".hashCode();
  private static final int cDw = "systemAddressBookUsername".hashCode();
  private static final int cDx = "contactId".hashCode();
  private static final int cDy = "sortKey".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cDr = true;
  private boolean cDs = true;
  private boolean cDt = true;
  private boolean cDu = true;
  public String field_contactId;
  public String field_sortKey;
  public String field_systemAddressBookUsername;
  public String field_wechatUsername;
  
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
      if (cDv != k) {
        break label60;
      }
      this.field_wechatUsername = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cDw == k) {
        this.field_systemAddressBookUsername = paramCursor.getString(i);
      } else if (cDx == k) {
        this.field_contactId = paramCursor.getString(i);
      } else if (cDy == k) {
        this.field_sortKey = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cDr) {
      localContentValues.put("wechatUsername", this.field_wechatUsername);
    }
    if (this.cDs) {
      localContentValues.put("systemAddressBookUsername", this.field_systemAddressBookUsername);
    }
    if (this.cDt) {
      localContentValues.put("contactId", this.field_contactId);
    }
    if (this.cDu) {
      localContentValues.put("sortKey", this.field_sortKey);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */