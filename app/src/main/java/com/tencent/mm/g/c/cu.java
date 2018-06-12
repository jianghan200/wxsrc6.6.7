package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cu
  extends c
{
  private static final int cIZ;
  private static final int cJd;
  private static final int cJj;
  private static final int cJk;
  private static final int cJl;
  private static final int cJm;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int clj;
  private boolean cIW = true;
  private boolean cJb = true;
  private boolean cJf = true;
  private boolean cJg = true;
  private boolean cJh = true;
  private boolean cJi = true;
  private boolean clh = true;
  public String field_appid;
  public String field_language;
  public String field_pinyin;
  public String field_quanpin;
  public long field_updateTime;
  public String field_wording;
  public String field_wordingId;
  
  static
  {
    cJd = "appid".hashCode();
    cJj = "wordingId".hashCode();
    cIZ = "language".hashCode();
    cJk = "wording".hashCode();
    cJl = "pinyin".hashCode();
    cJm = "quanpin".hashCode();
    clj = "updateTime".hashCode();
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
      if (cJd != k) {
        break label60;
      }
      this.field_appid = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cJj == k) {
        this.field_wordingId = paramCursor.getString(i);
      } else if (cIZ == k) {
        this.field_language = paramCursor.getString(i);
      } else if (cJk == k) {
        this.field_wording = paramCursor.getString(i);
      } else if (cJl == k) {
        this.field_pinyin = paramCursor.getString(i);
      } else if (cJm == k) {
        this.field_quanpin = paramCursor.getString(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cJb) {
      localContentValues.put("appid", this.field_appid);
    }
    if (this.cJf) {
      localContentValues.put("wordingId", this.field_wordingId);
    }
    if (this.cIW) {
      localContentValues.put("language", this.field_language);
    }
    if (this.cJg) {
      localContentValues.put("wording", this.field_wording);
    }
    if (this.cJh) {
      localContentValues.put("pinyin", this.field_pinyin);
    }
    if (this.cJi) {
      localContentValues.put("quanpin", this.field_quanpin);
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */