package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class d
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjg;
  private static final int cjh;
  private static final int cji;
  private static final int cjj;
  private static final int cjk;
  private static final int cjq = "layerId".hashCode();
  private static final int cjr = "business".hashCode();
  private static final int cjs;
  private static final int cjt;
  private boolean ciY = true;
  private boolean ciZ = true;
  private boolean cja = true;
  private boolean cjb = true;
  private boolean cjc = true;
  private boolean cjm = true;
  private boolean cjn = true;
  private boolean cjo = true;
  private boolean cjp = true;
  public String field_business;
  public long field_endTime;
  public String field_expId;
  public String field_layerId;
  public boolean field_needReport;
  public int field_prioritylevel;
  public String field_rawXML;
  public long field_sequence;
  public long field_startTime;
  
  static
  {
    cjg = "expId".hashCode();
    cjh = "sequence".hashCode();
    cji = "prioritylevel".hashCode();
    cjj = "startTime".hashCode();
    cjk = "endTime".hashCode();
    cjs = "needReport".hashCode();
    cjt = "rawXML".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cjq != k) {
        break label65;
      }
      this.field_layerId = paramCursor.getString(i);
      this.cjm = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cjr == k)
      {
        this.field_business = paramCursor.getString(i);
      }
      else if (cjg == k)
      {
        this.field_expId = paramCursor.getString(i);
      }
      else if (cjh == k)
      {
        this.field_sequence = paramCursor.getLong(i);
      }
      else if (cji == k)
      {
        this.field_prioritylevel = paramCursor.getInt(i);
      }
      else if (cjj == k)
      {
        this.field_startTime = paramCursor.getLong(i);
      }
      else if (cjk == k)
      {
        this.field_endTime = paramCursor.getLong(i);
      }
      else
      {
        if (cjs == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_needReport = bool;
            break;
          }
        }
        if (cjt == k) {
          this.field_rawXML = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cjm) {
      localContentValues.put("layerId", this.field_layerId);
    }
    if (this.cjn) {
      localContentValues.put("business", this.field_business);
    }
    if (this.ciY) {
      localContentValues.put("expId", this.field_expId);
    }
    if (this.ciZ) {
      localContentValues.put("sequence", Long.valueOf(this.field_sequence));
    }
    if (this.cja) {
      localContentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
    }
    if (this.cjb) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.cjc) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.cjo) {
      localContentValues.put("needReport", Boolean.valueOf(this.field_needReport));
    }
    if (this.field_rawXML == null) {
      this.field_rawXML = "";
    }
    if (this.cjp) {
      localContentValues.put("rawXML", this.field_rawXML);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */