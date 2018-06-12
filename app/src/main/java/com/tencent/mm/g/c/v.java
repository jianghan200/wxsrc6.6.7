package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class v
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckj;
  private static final int cnI = "bizChatId".hashCode();
  private static final int cnJ = "brandUserName".hashCode();
  private static final int cnK = "unReadCount".hashCode();
  private static final int cnL = "newUnReadCount".hashCode();
  private static final int cnM = "lastMsgID".hashCode();
  private static final int cnN = "lastMsgTime".hashCode();
  private static final int cnO;
  private static final int cnP;
  private static final int cnQ;
  private static final int cnR;
  private static final int cnS;
  private static final int cnT;
  private static final int cnU;
  private static final int cnV;
  private static final int cnk;
  private boolean ciS = true;
  private boolean cjN = true;
  private boolean cnA = true;
  private boolean cnB = true;
  private boolean cnC = true;
  private boolean cnD = true;
  private boolean cnE = true;
  private boolean cnF = true;
  private boolean cnG = true;
  private boolean cnH = true;
  private boolean cni = true;
  private boolean cnu = true;
  private boolean cnv = true;
  private boolean cnw = true;
  private boolean cnx = true;
  private boolean cny = true;
  private boolean cnz = true;
  public int field_atCount;
  public long field_bizChatId;
  public String field_brandUserName;
  public int field_chatType;
  public String field_content;
  public String field_digest;
  public String field_digestUser;
  public String field_editingMsg;
  public long field_flag;
  public int field_isSend;
  public long field_lastMsgID;
  public long field_lastMsgTime;
  public int field_msgCount;
  public String field_msgType;
  public int field_newUnReadCount;
  public int field_status;
  public int field_unReadCount;
  
  static
  {
    ckj = "content".hashCode();
    cnO = "digest".hashCode();
    cnP = "digestUser".hashCode();
    cnQ = "atCount".hashCode();
    cnR = "editingMsg".hashCode();
    cnS = "chatType".hashCode();
    ciV = "status".hashCode();
    cnT = "isSend".hashCode();
    cnU = "msgType".hashCode();
    cnV = "msgCount".hashCode();
    cnk = "flag".hashCode();
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
      if (cnI != k) {
        break label65;
      }
      this.field_bizChatId = paramCursor.getLong(i);
      this.cnu = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cnJ == k) {
        this.field_brandUserName = paramCursor.getString(i);
      } else if (cnK == k) {
        this.field_unReadCount = paramCursor.getInt(i);
      } else if (cnL == k) {
        this.field_newUnReadCount = paramCursor.getInt(i);
      } else if (cnM == k) {
        this.field_lastMsgID = paramCursor.getLong(i);
      } else if (cnN == k) {
        this.field_lastMsgTime = paramCursor.getLong(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cnO == k) {
        this.field_digest = paramCursor.getString(i);
      } else if (cnP == k) {
        this.field_digestUser = paramCursor.getString(i);
      } else if (cnQ == k) {
        this.field_atCount = paramCursor.getInt(i);
      } else if (cnR == k) {
        this.field_editingMsg = paramCursor.getString(i);
      } else if (cnS == k) {
        this.field_chatType = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cnT == k) {
        this.field_isSend = paramCursor.getInt(i);
      } else if (cnU == k) {
        this.field_msgType = paramCursor.getString(i);
      } else if (cnV == k) {
        this.field_msgCount = paramCursor.getInt(i);
      } else if (cnk == k) {
        this.field_flag = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cnu) {
      localContentValues.put("bizChatId", Long.valueOf(this.field_bizChatId));
    }
    if (this.cnv) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.cnw) {
      localContentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
    }
    if (this.cnx) {
      localContentValues.put("newUnReadCount", Integer.valueOf(this.field_newUnReadCount));
    }
    if (this.cny) {
      localContentValues.put("lastMsgID", Long.valueOf(this.field_lastMsgID));
    }
    if (this.cnz) {
      localContentValues.put("lastMsgTime", Long.valueOf(this.field_lastMsgTime));
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_digest == null) {
      this.field_digest = "";
    }
    if (this.cnA) {
      localContentValues.put("digest", this.field_digest);
    }
    if (this.field_digestUser == null) {
      this.field_digestUser = "";
    }
    if (this.cnB) {
      localContentValues.put("digestUser", this.field_digestUser);
    }
    if (this.cnC) {
      localContentValues.put("atCount", Integer.valueOf(this.field_atCount));
    }
    if (this.cnD) {
      localContentValues.put("editingMsg", this.field_editingMsg);
    }
    if (this.cnE) {
      localContentValues.put("chatType", Integer.valueOf(this.field_chatType));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cnF) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.field_msgType == null) {
      this.field_msgType = "";
    }
    if (this.cnG) {
      localContentValues.put("msgType", this.field_msgType);
    }
    if (this.cnH) {
      localContentValues.put("msgCount", Integer.valueOf(this.field_msgCount));
    }
    if (this.cni) {
      localContentValues.put("flag", Long.valueOf(this.field_flag));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */