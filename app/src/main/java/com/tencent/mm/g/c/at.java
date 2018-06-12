package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class at
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cvM;
  private static final int cvX;
  private static final int cvg;
  private static final int cwr = "md5_lang".hashCode();
  private static final int cws;
  private static final int cwt;
  private static final int cwu;
  private boolean cuG = true;
  private boolean cvk = true;
  private boolean cvw = true;
  private boolean cwn = true;
  private boolean cwo = true;
  private boolean cwp = true;
  private boolean cwq = true;
  public int field_click_flag;
  public String field_desc;
  public int field_download_flag;
  public String field_groupId;
  public String field_lang;
  public String field_md5;
  public String field_md5_lang;
  
  static
  {
    cvM = "md5".hashCode();
    cvg = "lang".hashCode();
    cws = "desc".hashCode();
    cvX = "groupId".hashCode();
    cwt = "click_flag".hashCode();
    cwu = "download_flag".hashCode();
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
      if (cwr != k) {
        break label65;
      }
      this.field_md5_lang = paramCursor.getString(i);
      this.cwn = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cvM == k) {
        this.field_md5 = paramCursor.getString(i);
      } else if (cvg == k) {
        this.field_lang = paramCursor.getString(i);
      } else if (cws == k) {
        this.field_desc = paramCursor.getString(i);
      } else if (cvX == k) {
        this.field_groupId = paramCursor.getString(i);
      } else if (cwt == k) {
        this.field_click_flag = paramCursor.getInt(i);
      } else if (cwu == k) {
        this.field_download_flag = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cwn) {
      localContentValues.put("md5_lang", this.field_md5_lang);
    }
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.cuG) {
      localContentValues.put("lang", this.field_lang);
    }
    if (this.cwo) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.field_groupId == null) {
      this.field_groupId = "";
    }
    if (this.cvw) {
      localContentValues.put("groupId", this.field_groupId);
    }
    if (this.cwp) {
      localContentValues.put("click_flag", Integer.valueOf(this.field_click_flag));
    }
    if (this.cwq) {
      localContentValues.put("download_flag", Integer.valueOf(this.field_download_flag));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */