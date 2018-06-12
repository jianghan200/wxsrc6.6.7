package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dz
  extends c
{
  private static final int cOS;
  private static final int cOT;
  private static final int cOU = "memberList".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cvj;
  private boolean cOP = true;
  private boolean cOQ = true;
  private boolean cOR = true;
  private boolean cuJ = true;
  public int field_count;
  public String field_memberList;
  public long field_tagId;
  public String field_tagName;
  
  static
  {
    cOS = "tagId".hashCode();
    cOT = "tagName".hashCode();
    cvj = "count".hashCode();
  }
  
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
      if (cOS != k) {
        break label60;
      }
      this.field_tagId = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cOT == k) {
        this.field_tagName = paramCursor.getString(i);
      } else if (cvj == k) {
        this.field_count = paramCursor.getInt(i);
      } else if (cOU == k) {
        this.field_memberList = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cOP) {
      localContentValues.put("tagId", Long.valueOf(this.field_tagId));
    }
    if (this.field_tagName == null) {
      this.field_tagName = "";
    }
    if (this.cOQ) {
      localContentValues.put("tagName", this.field_tagName);
    }
    if (this.cuJ) {
      localContentValues.put("count", Integer.valueOf(this.field_count));
    }
    if (this.field_memberList == null) {
      this.field_memberList = "";
    }
    if (this.cOR) {
      localContentValues.put("memberList", this.field_memberList);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */