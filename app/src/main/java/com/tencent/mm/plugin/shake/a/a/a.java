package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class a
  extends c
{
  private static final int cEa;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cke;
  private static final int cnf;
  private static final int cvN = "svrid".hashCode();
  private static final int cvS;
  private static final int cvT;
  private static final int cvU;
  private static final int cws;
  private static final int cyA;
  private static final int cyO;
  private static final int mWq;
  private static final int mWr;
  private boolean cDV = true;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean cnb = true;
  private boolean cvl = true;
  private boolean cvq = true;
  private boolean cvr = true;
  private boolean cvs = true;
  private boolean cwo = true;
  private boolean cyE = true;
  private boolean cyy = true;
  public long field_createtime;
  public String field_desc;
  public String field_reserved1;
  public String field_reserved2;
  public int field_reserved3;
  public byte[] field_reservedBuf;
  public int field_status;
  public int field_subtype;
  public long field_svrid;
  public String field_tag;
  public String field_thumburl;
  public String field_title;
  public int field_type;
  private boolean mWo = true;
  private boolean mWp = true;
  
  static
  {
    cke = "type".hashCode();
    cyA = "subtype".hashCode();
    cEa = "createtime".hashCode();
    cyO = "tag".hashCode();
    ciV = "status".hashCode();
    cnf = "title".hashCode();
    cws = "desc".hashCode();
    mWq = "thumburl".hashCode();
    cvS = "reserved1".hashCode();
    cvT = "reserved2".hashCode();
    cvU = "reserved3".hashCode();
    mWr = "reservedBuf".hashCode();
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
      if (cvN != k) {
        break label65;
      }
      this.field_svrid = paramCursor.getLong(i);
      this.cvl = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cyA == k) {
        this.field_subtype = paramCursor.getInt(i);
      } else if (cEa == k) {
        this.field_createtime = paramCursor.getLong(i);
      } else if (cyO == k) {
        this.field_tag = paramCursor.getString(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (cws == k) {
        this.field_desc = paramCursor.getString(i);
      } else if (mWq == k) {
        this.field_thumburl = paramCursor.getString(i);
      } else if (cvS == k) {
        this.field_reserved1 = paramCursor.getString(i);
      } else if (cvT == k) {
        this.field_reserved2 = paramCursor.getString(i);
      } else if (cvU == k) {
        this.field_reserved3 = paramCursor.getInt(i);
      } else if (mWr == k) {
        this.field_reservedBuf = paramCursor.getBlob(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cvl) {
      localContentValues.put("svrid", Long.valueOf(this.field_svrid));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cyy) {
      localContentValues.put("subtype", Integer.valueOf(this.field_subtype));
    }
    if (this.cDV) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.cyE) {
      localContentValues.put("tag", this.field_tag);
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cwo) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.mWo) {
      localContentValues.put("thumburl", this.field_thumburl);
    }
    if (this.cvq) {
      localContentValues.put("reserved1", this.field_reserved1);
    }
    if (this.cvr) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.cvs) {
      localContentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
    }
    if (this.mWp) {
      localContentValues.put("reservedBuf", this.field_reservedBuf);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */