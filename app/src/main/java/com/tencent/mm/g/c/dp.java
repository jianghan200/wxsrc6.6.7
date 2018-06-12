package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dp
  extends c
{
  private static final int cEa;
  private static final int cEb;
  private static final int cEc;
  private static final int cEd;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cke;
  private static final int ckj;
  private static final int ckw;
  private static final int cnT;
  private static final int cpT;
  private static final int cvN = "svrid".hashCode();
  private boolean cDV = true;
  private boolean cDW = true;
  private boolean cDX = true;
  private boolean cDY = true;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean cjN = true;
  private boolean cku = true;
  private boolean cnF = true;
  private boolean cpL = true;
  private boolean cvl = true;
  public String field_content;
  public long field_createtime;
  public String field_imgpath;
  public int field_isSend;
  public String field_sayhicontent;
  public String field_sayhiuser;
  public int field_scene;
  public int field_status;
  public long field_svrid;
  public String field_talker;
  public int field_type;
  
  static
  {
    ciV = "status".hashCode();
    cke = "type".hashCode();
    ckw = "scene".hashCode();
    cEa = "createtime".hashCode();
    cpT = "talker".hashCode();
    ckj = "content".hashCode();
    cEb = "sayhiuser".hashCode();
    cEc = "sayhicontent".hashCode();
    cEd = "imgpath".hashCode();
    cnT = "isSend".hashCode();
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
      if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
      } else if (cEa == k) {
        this.field_createtime = paramCursor.getLong(i);
      } else if (cpT == k) {
        this.field_talker = paramCursor.getString(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cEb == k) {
        this.field_sayhiuser = paramCursor.getString(i);
      } else if (cEc == k) {
        this.field_sayhicontent = paramCursor.getString(i);
      } else if (cEd == k) {
        this.field_imgpath = paramCursor.getString(i);
      } else if (cnT == k) {
        this.field_isSend = paramCursor.getInt(i);
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
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.cDV) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.cpL) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.cDW) {
      localContentValues.put("sayhiuser", this.field_sayhiuser);
    }
    if (this.cDX) {
      localContentValues.put("sayhicontent", this.field_sayhicontent);
    }
    if (this.cDY) {
      localContentValues.put("imgpath", this.field_imgpath);
    }
    if (this.cnF) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */