package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fc
  extends c
{
  private static final int cJs;
  private static final int cVr;
  private static final int cVs;
  private static final int cVt = "contentColor".hashCode();
  private static final int cVu = "updatePeroid".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckj;
  private boolean cJp = true;
  private boolean cVn = true;
  private boolean cVo = true;
  private boolean cVp = true;
  private boolean cVq = true;
  private boolean cjN = true;
  public int field_btnState;
  public String field_content;
  public String field_contentColor;
  public int field_msgState;
  public int field_shareKeyHash;
  public int field_updatePeroid;
  
  static
  {
    cVr = "shareKeyHash".hashCode();
    cVs = "btnState".hashCode();
    cJs = "msgState".hashCode();
    ckj = "content".hashCode();
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
      if (cVr != k) {
        break label65;
      }
      this.field_shareKeyHash = paramCursor.getInt(i);
      this.cVn = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cVs == k) {
        this.field_btnState = paramCursor.getInt(i);
      } else if (cJs == k) {
        this.field_msgState = paramCursor.getInt(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cVt == k) {
        this.field_contentColor = paramCursor.getString(i);
      } else if (cVu == k) {
        this.field_updatePeroid = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cVn) {
      localContentValues.put("shareKeyHash", Integer.valueOf(this.field_shareKeyHash));
    }
    if (this.cVo) {
      localContentValues.put("btnState", Integer.valueOf(this.field_btnState));
    }
    if (this.cJp) {
      localContentValues.put("msgState", Integer.valueOf(this.field_msgState));
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.cVp) {
      localContentValues.put("contentColor", this.field_contentColor);
    }
    if (this.cVq) {
      localContentValues.put("updatePeroid", Integer.valueOf(this.field_updatePeroid));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */