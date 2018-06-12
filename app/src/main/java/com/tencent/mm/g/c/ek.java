package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ek
  extends c
{
  private static final int cRE = "wallet_region".hashCode();
  private static final int cRF = "function_list".hashCode();
  private static final int cRG = "new_list".hashCode();
  private static final int cRH = "banner_list".hashCode();
  private static final int cRI = "type_name_list".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cRA = true;
  private boolean cRB = true;
  private boolean cRC = true;
  private boolean cRD = true;
  private boolean cRz = true;
  public String field_banner_list;
  public String field_function_list;
  public String field_new_list;
  public String field_type_name_list;
  public int field_wallet_region;
  
  public void d(Cursor paramCursor)
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
      if (cRE != k) {
        break label65;
      }
      this.field_wallet_region = paramCursor.getInt(i);
      this.cRz = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cRF == k) {
        this.field_function_list = paramCursor.getString(i);
      } else if (cRG == k) {
        this.field_new_list = paramCursor.getString(i);
      } else if (cRH == k) {
        this.field_banner_list = paramCursor.getString(i);
      } else if (cRI == k) {
        this.field_type_name_list = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRz) {
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    }
    if (this.cRA) {
      localContentValues.put("function_list", this.field_function_list);
    }
    if (this.cRB) {
      localContentValues.put("new_list", this.field_new_list);
    }
    if (this.cRC) {
      localContentValues.put("banner_list", this.field_banner_list);
    }
    if (this.cRD) {
      localContentValues.put("type_name_list", this.field_type_name_list);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */