package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bc
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int cke;
  private static final int cnT;
  private static final int cpT;
  private static final int cxA = "msgContent".hashCode();
  private static final int cxB;
  private static final int cxC;
  private static final int cxi;
  private boolean cjF = true;
  private boolean cjI = true;
  private boolean cnF = true;
  private boolean cpL = true;
  private boolean cwT = true;
  private boolean cxx = true;
  private boolean cxy = true;
  private boolean cxz = true;
  public String field_chatroomName;
  public long field_createTime;
  public String field_encryptTalker;
  public int field_isSend;
  public String field_msgContent;
  public long field_svrId;
  public String field_talker;
  public int field_type;
  
  static
  {
    cnT = "isSend".hashCode();
    cpT = "talker".hashCode();
    cxi = "encryptTalker".hashCode();
    cxB = "svrId".hashCode();
    cke = "type".hashCode();
    ckb = "createTime".hashCode();
    cxC = "chatroomName".hashCode();
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
      if (cxA != k) {
        break label60;
      }
      this.field_msgContent = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cnT == k) {
        this.field_isSend = paramCursor.getInt(i);
      } else if (cpT == k) {
        this.field_talker = paramCursor.getString(i);
      } else if (cxi == k) {
        this.field_encryptTalker = paramCursor.getString(i);
      } else if (cxB == k) {
        this.field_svrId = paramCursor.getLong(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (cxC == k) {
        this.field_chatroomName = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_msgContent == null) {
      this.field_msgContent = "";
    }
    if (this.cxx) {
      localContentValues.put("msgContent", this.field_msgContent);
    }
    if (this.cnF) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.field_talker == null) {
      this.field_talker = "";
    }
    if (this.cpL) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.field_encryptTalker == null) {
      this.field_encryptTalker = "";
    }
    if (this.cwT) {
      localContentValues.put("encryptTalker", this.field_encryptTalker);
    }
    if (this.cxy) {
      localContentValues.put("svrId", Long.valueOf(this.field_svrId));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.field_chatroomName == null) {
      this.field_chatroomName = "";
    }
    if (this.cxz) {
      localContentValues.put("chatroomName", this.field_chatroomName);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */