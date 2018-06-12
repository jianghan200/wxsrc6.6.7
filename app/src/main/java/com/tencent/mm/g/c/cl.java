package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cl
  extends c
{
  private static final int cGj = "loan_jump_url".hashCode();
  private static final int cGk = "red_dot_index".hashCode();
  private static final int cGl = "is_show_entry".hashCode();
  private static final int cGm = "tips".hashCode();
  private static final int cGn = "is_overdue".hashCode();
  private static final int cGo = "available_otb".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnf = "title".hashCode();
  private boolean cGd = true;
  private boolean cGe = true;
  private boolean cGf = true;
  private boolean cGg = true;
  private boolean cGh = true;
  private boolean cGi = true;
  private boolean cnb = true;
  public String field_available_otb;
  public int field_is_overdue;
  public int field_is_show_entry;
  public String field_loan_jump_url;
  public int field_red_dot_index;
  public String field_tips;
  public String field_title;
  
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
      if (cnf != k) {
        break label65;
      }
      this.field_title = paramCursor.getString(i);
      this.cnb = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cGj == k) {
        this.field_loan_jump_url = paramCursor.getString(i);
      } else if (cGk == k) {
        this.field_red_dot_index = paramCursor.getInt(i);
      } else if (cGl == k) {
        this.field_is_show_entry = paramCursor.getInt(i);
      } else if (cGm == k) {
        this.field_tips = paramCursor.getString(i);
      } else if (cGn == k) {
        this.field_is_overdue = paramCursor.getInt(i);
      } else if (cGo == k) {
        this.field_available_otb = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cGd) {
      localContentValues.put("loan_jump_url", this.field_loan_jump_url);
    }
    if (this.cGe) {
      localContentValues.put("red_dot_index", Integer.valueOf(this.field_red_dot_index));
    }
    if (this.cGf) {
      localContentValues.put("is_show_entry", Integer.valueOf(this.field_is_show_entry));
    }
    if (this.cGg) {
      localContentValues.put("tips", this.field_tips);
    }
    if (this.cGh) {
      localContentValues.put("is_overdue", Integer.valueOf(this.field_is_overdue));
    }
    if (this.cGi) {
      localContentValues.put("available_otb", this.field_available_otb);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */