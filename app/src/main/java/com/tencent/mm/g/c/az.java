package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class az
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjj;
  private static final int cjk;
  private static final int cvX;
  private static final int cwO = "exptId".hashCode();
  private static final int cwP;
  private static final int cwQ;
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cvw = true;
  private boolean cwL = true;
  private boolean cwM = true;
  private boolean cwN = true;
  public long field_endTime;
  public String field_exptContent;
  public int field_exptId;
  public int field_exptSeq;
  public int field_groupId;
  public long field_startTime;
  
  static
  {
    cvX = "groupId".hashCode();
    cwP = "exptSeq".hashCode();
    cwQ = "exptContent".hashCode();
    cjj = "startTime".hashCode();
    cjk = "endTime".hashCode();
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
      if (cwO != k) {
        break label65;
      }
      this.field_exptId = paramCursor.getInt(i);
      this.cwL = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cvX == k) {
        this.field_groupId = paramCursor.getInt(i);
      } else if (cwP == k) {
        this.field_exptSeq = paramCursor.getInt(i);
      } else if (cwQ == k) {
        this.field_exptContent = paramCursor.getString(i);
      } else if (cjj == k) {
        this.field_startTime = paramCursor.getLong(i);
      } else if (cjk == k) {
        this.field_endTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cwL) {
      localContentValues.put("exptId", Integer.valueOf(this.field_exptId));
    }
    if (this.cvw) {
      localContentValues.put("groupId", Integer.valueOf(this.field_groupId));
    }
    if (this.cwM) {
      localContentValues.put("exptSeq", Integer.valueOf(this.field_exptSeq));
    }
    if (this.cwN) {
      localContentValues.put("exptContent", this.field_exptContent);
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */