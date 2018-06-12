package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ag
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS CardQrCodeDataInfo_card_id_index ON CardQrCodeDataInfo(card_id)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cqC;
  private static final int crg = "code_id".hashCode();
  private static final int crh;
  private boolean ciS = true;
  private boolean cqj = true;
  private boolean cre = true;
  private boolean crf = true;
  public String field_card_id;
  public String field_code;
  public String field_code_id;
  public int field_status;
  
  static
  {
    cqC = "card_id".hashCode();
    crh = "code".hashCode();
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
      if (crg != k) {
        break label60;
      }
      this.field_code_id = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cqC == k) {
        this.field_card_id = paramCursor.getString(i);
      } else if (crh == k) {
        this.field_code = paramCursor.getString(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cre) {
      localContentValues.put("code_id", this.field_code_id);
    }
    if (this.cqj) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.crf) {
      localContentValues.put("code", this.field_code);
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */