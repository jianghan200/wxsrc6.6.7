package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dv
  extends c
{
  private static final int cBa;
  private static final int cNZ;
  private static final int cOa;
  private static final int cOb = "curActionBuf".hashCode();
  private static final int cOc = "refActionBuf".hashCode();
  private static final int cOd = "commentSvrID".hashCode();
  private static final int cOe = "clientId".hashCode();
  private static final int cOf = "commentflag".hashCode();
  private static final int cOg = "isSilence".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS SnsComment_snsID_index ON SnsComment(snsID)", "CREATE INDEX IF NOT EXISTS SnsComment_parentID_index ON SnsComment(parentID)", "CREATE INDEX IF NOT EXISTS SnsComment_isRead_index ON SnsComment(isRead)", "CREATE INDEX IF NOT EXISTS SnsComment_isSend_index ON SnsComment(isSend)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int cke;
  private static final int cnT;
  private static final int cpT;
  private boolean cAR = true;
  private boolean cNR = true;
  private boolean cNS = true;
  private boolean cNT = true;
  private boolean cNU = true;
  private boolean cNV = true;
  private boolean cNW = true;
  private boolean cNX = true;
  private boolean cNY = true;
  private boolean cjF = true;
  private boolean cjI = true;
  private boolean cnF = true;
  private boolean cpL = true;
  public String field_clientId;
  public long field_commentSvrID;
  public int field_commentflag;
  public int field_createTime;
  public byte[] field_curActionBuf;
  public short field_isRead;
  public boolean field_isSend;
  public int field_isSilence;
  public long field_parentID;
  public byte[] field_refActionBuf;
  public long field_snsID;
  public String field_talker;
  public int field_type;
  
  static
  {
    cNZ = "snsID".hashCode();
    cOa = "parentID".hashCode();
    cBa = "isRead".hashCode();
    ckb = "createTime".hashCode();
    cpT = "talker".hashCode();
    cke = "type".hashCode();
    cnT = "isSend".hashCode();
  }
  
  public void d(Cursor paramCursor)
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
      if (cNZ != k) {
        break label60;
      }
      this.field_snsID = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cOa == k)
      {
        this.field_parentID = paramCursor.getLong(i);
      }
      else if (cBa == k)
      {
        this.field_isRead = paramCursor.getShort(i);
      }
      else if (ckb == k)
      {
        this.field_createTime = paramCursor.getInt(i);
      }
      else if (cpT == k)
      {
        this.field_talker = paramCursor.getString(i);
      }
      else if (cke == k)
      {
        this.field_type = paramCursor.getInt(i);
      }
      else
      {
        if (cnT == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isSend = bool;
            break;
          }
        }
        if (cOb == k) {
          this.field_curActionBuf = paramCursor.getBlob(i);
        } else if (cOc == k) {
          this.field_refActionBuf = paramCursor.getBlob(i);
        } else if (cOd == k) {
          this.field_commentSvrID = paramCursor.getLong(i);
        } else if (cOe == k) {
          this.field_clientId = paramCursor.getString(i);
        } else if (cOf == k) {
          this.field_commentflag = paramCursor.getInt(i);
        } else if (cOg == k) {
          this.field_isSilence = paramCursor.getInt(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cNR) {
      localContentValues.put("snsID", Long.valueOf(this.field_snsID));
    }
    if (this.cNS) {
      localContentValues.put("parentID", Long.valueOf(this.field_parentID));
    }
    if (this.cAR) {
      localContentValues.put("isRead", Short.valueOf(this.field_isRead));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    }
    if (this.cpL) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cnF) {
      localContentValues.put("isSend", Boolean.valueOf(this.field_isSend));
    }
    if (this.cNT) {
      localContentValues.put("curActionBuf", this.field_curActionBuf);
    }
    if (this.cNU) {
      localContentValues.put("refActionBuf", this.field_refActionBuf);
    }
    if (this.cNV) {
      localContentValues.put("commentSvrID", Long.valueOf(this.field_commentSvrID));
    }
    if (this.cNW) {
      localContentValues.put("clientId", this.field_clientId);
    }
    if (this.cNX) {
      localContentValues.put("commentflag", Integer.valueOf(this.field_commentflag));
    }
    if (this.cNY) {
      localContentValues.put("isSilence", Integer.valueOf(this.field_isSilence));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */