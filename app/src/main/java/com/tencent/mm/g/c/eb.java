package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class eb
  extends c
{
  private static final int cPa = "contactLabels".hashCode();
  private static final int cPb = "conDescription".hashCode();
  private static final int cPc = "conPhone".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int csk;
  private static final int csu = "encryptUsername".hashCode();
  private boolean cOX = true;
  private boolean cOY = true;
  private boolean cOZ = true;
  private boolean crT = true;
  private boolean csd = true;
  public String field_conDescription;
  public String field_conPhone;
  public String field_conRemark;
  public String field_contactLabels;
  public String field_encryptUsername;
  
  static
  {
    csk = "conRemark".hashCode();
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
      if (csu != k) {
        break label65;
      }
      this.field_encryptUsername = paramCursor.getString(i);
      this.csd = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (csk == k) {
        this.field_conRemark = paramCursor.getString(i);
      } else if (cPa == k) {
        this.field_contactLabels = paramCursor.getString(i);
      } else if (cPb == k) {
        this.field_conDescription = paramCursor.getString(i);
      } else if (cPc == k) {
        this.field_conPhone = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_encryptUsername == null) {
      this.field_encryptUsername = "";
    }
    if (this.csd) {
      localContentValues.put("encryptUsername", this.field_encryptUsername);
    }
    if (this.field_conRemark == null) {
      this.field_conRemark = "";
    }
    if (this.crT) {
      localContentValues.put("conRemark", this.field_conRemark);
    }
    if (this.field_contactLabels == null) {
      this.field_contactLabels = "";
    }
    if (this.cOX) {
      localContentValues.put("contactLabels", this.field_contactLabels);
    }
    if (this.field_conDescription == null) {
      this.field_conDescription = "";
    }
    if (this.cOY) {
      localContentValues.put("conDescription", this.field_conDescription);
    }
    if (this.field_conPhone == null) {
      this.field_conPhone = "";
    }
    if (this.cOZ) {
      localContentValues.put("conPhone", this.field_conPhone);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */