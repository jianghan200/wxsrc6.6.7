package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bt
  extends c
{
  private static final int cBH;
  private static final int cBI;
  private static final int cBJ;
  private static final int cBK;
  private static final int cBL;
  private static final int cBM;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int ckj;
  private static final int cnk;
  private static final int cvS;
  private static final int cvT;
  private static final int cvU;
  private static final int cvV;
  private boolean cBB = true;
  private boolean cBC = true;
  private boolean cBD = true;
  private boolean cBE = true;
  private boolean cBF = true;
  private boolean cBG = true;
  private boolean cjF = true;
  private boolean cjN = true;
  private boolean cni = true;
  private boolean cvq = true;
  private boolean cvr = true;
  private boolean cvs = true;
  private boolean cvt = true;
  public String field_content;
  public long field_createTime;
  public int field_flag;
  public String field_fromUserName;
  public int field_msgSeq;
  public String field_msgSource;
  public long field_newMsgId;
  public long field_originSvrId;
  public int field_reserved1;
  public long field_reserved2;
  public String field_reserved3;
  public String field_reserved4;
  public String field_toUserName;
  
  static
  {
    cBH = "originSvrId".hashCode();
    cBI = "newMsgId".hashCode();
    cBJ = "fromUserName".hashCode();
    cBK = "toUserName".hashCode();
    ckb = "createTime".hashCode();
    ckj = "content".hashCode();
    cBL = "msgSource".hashCode();
    cBM = "msgSeq".hashCode();
    cnk = "flag".hashCode();
    cvS = "reserved1".hashCode();
    cvT = "reserved2".hashCode();
    cvU = "reserved3".hashCode();
    cvV = "reserved4".hashCode();
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
      if (cBH != k) {
        break label65;
      }
      this.field_originSvrId = paramCursor.getLong(i);
      this.cBB = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cBI == k) {
        this.field_newMsgId = paramCursor.getLong(i);
      } else if (cBJ == k) {
        this.field_fromUserName = paramCursor.getString(i);
      } else if (cBK == k) {
        this.field_toUserName = paramCursor.getString(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cBL == k) {
        this.field_msgSource = paramCursor.getString(i);
      } else if (cBM == k) {
        this.field_msgSeq = paramCursor.getInt(i);
      } else if (cnk == k) {
        this.field_flag = paramCursor.getInt(i);
      } else if (cvS == k) {
        this.field_reserved1 = paramCursor.getInt(i);
      } else if (cvT == k) {
        this.field_reserved2 = paramCursor.getLong(i);
      } else if (cvU == k) {
        this.field_reserved3 = paramCursor.getString(i);
      } else if (cvV == k) {
        this.field_reserved4 = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cBB) {
      localContentValues.put("originSvrId", Long.valueOf(this.field_originSvrId));
    }
    if (this.cBC) {
      localContentValues.put("newMsgId", Long.valueOf(this.field_newMsgId));
    }
    if (this.field_fromUserName == null) {
      this.field_fromUserName = "";
    }
    if (this.cBD) {
      localContentValues.put("fromUserName", this.field_fromUserName);
    }
    if (this.field_toUserName == null) {
      this.field_toUserName = "";
    }
    if (this.cBE) {
      localContentValues.put("toUserName", this.field_toUserName);
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.field_content == null) {
      this.field_content = "";
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_msgSource == null) {
      this.field_msgSource = "";
    }
    if (this.cBF) {
      localContentValues.put("msgSource", this.field_msgSource);
    }
    if (this.cBG) {
      localContentValues.put("msgSeq", Integer.valueOf(this.field_msgSeq));
    }
    if (this.cni) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.cvq) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.cvr) {
      localContentValues.put("reserved2", Long.valueOf(this.field_reserved2));
    }
    if (this.field_reserved3 == null) {
      this.field_reserved3 = "";
    }
    if (this.cvs) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if (this.field_reserved4 == null) {
      this.field_reserved4 = "";
    }
    if (this.cvt) {
      localContentValues.put("reserved4", this.field_reserved4);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */