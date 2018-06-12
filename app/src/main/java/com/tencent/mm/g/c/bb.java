package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bb
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS fmconversation_isnew_Index ON fmessage_conversation(isNew)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cpT = "talker".hashCode();
  private static final int cvQ;
  private static final int cxi = "encryptTalker".hashCode();
  private static final int cxj = "displayName".hashCode();
  private static final int cxk;
  private static final int cxl;
  private static final int cxm;
  private static final int cxn;
  private static final int cxo;
  private static final int cxp;
  private static final int cxq;
  private static final int cxr;
  private static final int cxs;
  private static final int cxt;
  private static final int cxu;
  private static final int cxv;
  private static final int cxw;
  private boolean cpL = true;
  private boolean cvo = true;
  private boolean cwT = true;
  private boolean cwU = true;
  private boolean cwV = true;
  private boolean cwW = true;
  private boolean cwX = true;
  private boolean cwY = true;
  private boolean cwZ = true;
  private boolean cxa = true;
  private boolean cxb = true;
  private boolean cxc = true;
  private boolean cxd = true;
  private boolean cxe = true;
  private boolean cxf = true;
  private boolean cxg = true;
  private boolean cxh = true;
  public int field_addScene;
  public String field_contentFromUsername;
  public String field_contentFullPhoneNumMD5;
  public String field_contentNickname;
  public String field_contentPhoneNumMD5;
  public String field_contentVerifyContent;
  public String field_displayName;
  public String field_encryptTalker;
  public String field_fmsgContent;
  public int field_fmsgIsSend;
  public long field_fmsgSysRowId;
  public int field_fmsgType;
  public int field_isNew;
  public long field_lastModifiedTime;
  public int field_recvFmsgType;
  public int field_state;
  public String field_talker;
  
  static
  {
    cvQ = "state".hashCode();
    cxk = "lastModifiedTime".hashCode();
    cxl = "isNew".hashCode();
    cxm = "addScene".hashCode();
    cxn = "fmsgSysRowId".hashCode();
    cxo = "fmsgIsSend".hashCode();
    cxp = "fmsgType".hashCode();
    cxq = "fmsgContent".hashCode();
    cxr = "recvFmsgType".hashCode();
    cxs = "contentFromUsername".hashCode();
    cxt = "contentNickname".hashCode();
    cxu = "contentPhoneNumMD5".hashCode();
    cxv = "contentFullPhoneNumMD5".hashCode();
    cxw = "contentVerifyContent".hashCode();
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
      if (cpT != k) {
        break label65;
      }
      this.field_talker = paramCursor.getString(i);
      this.cpL = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cxi == k) {
        this.field_encryptTalker = paramCursor.getString(i);
      } else if (cxj == k) {
        this.field_displayName = paramCursor.getString(i);
      } else if (cvQ == k) {
        this.field_state = paramCursor.getInt(i);
      } else if (cxk == k) {
        this.field_lastModifiedTime = paramCursor.getLong(i);
      } else if (cxl == k) {
        this.field_isNew = paramCursor.getInt(i);
      } else if (cxm == k) {
        this.field_addScene = paramCursor.getInt(i);
      } else if (cxn == k) {
        this.field_fmsgSysRowId = paramCursor.getLong(i);
      } else if (cxo == k) {
        this.field_fmsgIsSend = paramCursor.getInt(i);
      } else if (cxp == k) {
        this.field_fmsgType = paramCursor.getInt(i);
      } else if (cxq == k) {
        this.field_fmsgContent = paramCursor.getString(i);
      } else if (cxr == k) {
        this.field_recvFmsgType = paramCursor.getInt(i);
      } else if (cxs == k) {
        this.field_contentFromUsername = paramCursor.getString(i);
      } else if (cxt == k) {
        this.field_contentNickname = paramCursor.getString(i);
      } else if (cxu == k) {
        this.field_contentPhoneNumMD5 = paramCursor.getString(i);
      } else if (cxv == k) {
        this.field_contentFullPhoneNumMD5 = paramCursor.getString(i);
      } else if (cxw == k) {
        this.field_contentVerifyContent = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_talker == null) {
      this.field_talker = "0";
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
    if (this.field_displayName == null) {
      this.field_displayName = "";
    }
    if (this.cwU) {
      localContentValues.put("displayName", this.field_displayName);
    }
    if (this.cvo) {
      localContentValues.put("state", Integer.valueOf(this.field_state));
    }
    if (this.cwV) {
      localContentValues.put("lastModifiedTime", Long.valueOf(this.field_lastModifiedTime));
    }
    if (this.cwW) {
      localContentValues.put("isNew", Integer.valueOf(this.field_isNew));
    }
    if (this.cwX) {
      localContentValues.put("addScene", Integer.valueOf(this.field_addScene));
    }
    if (this.cwY) {
      localContentValues.put("fmsgSysRowId", Long.valueOf(this.field_fmsgSysRowId));
    }
    if (this.cwZ) {
      localContentValues.put("fmsgIsSend", Integer.valueOf(this.field_fmsgIsSend));
    }
    if (this.cxa) {
      localContentValues.put("fmsgType", Integer.valueOf(this.field_fmsgType));
    }
    if (this.field_fmsgContent == null) {
      this.field_fmsgContent = "";
    }
    if (this.cxb) {
      localContentValues.put("fmsgContent", this.field_fmsgContent);
    }
    if (this.cxc) {
      localContentValues.put("recvFmsgType", Integer.valueOf(this.field_recvFmsgType));
    }
    if (this.field_contentFromUsername == null) {
      this.field_contentFromUsername = "";
    }
    if (this.cxd) {
      localContentValues.put("contentFromUsername", this.field_contentFromUsername);
    }
    if (this.field_contentNickname == null) {
      this.field_contentNickname = "";
    }
    if (this.cxe) {
      localContentValues.put("contentNickname", this.field_contentNickname);
    }
    if (this.field_contentPhoneNumMD5 == null) {
      this.field_contentPhoneNumMD5 = "";
    }
    if (this.cxf) {
      localContentValues.put("contentPhoneNumMD5", this.field_contentPhoneNumMD5);
    }
    if (this.field_contentFullPhoneNumMD5 == null) {
      this.field_contentFullPhoneNumMD5 = "";
    }
    if (this.cxg) {
      localContentValues.put("contentFullPhoneNumMD5", this.field_contentFullPhoneNumMD5);
    }
    if (this.field_contentVerifyContent == null) {
      this.field_contentVerifyContent = "";
    }
    if (this.cxh) {
      localContentValues.put("contentVerifyContent", this.field_contentVerifyContent);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */