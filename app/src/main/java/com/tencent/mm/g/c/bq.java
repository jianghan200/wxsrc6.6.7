package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bq
  extends c
{
  private static final int cAW;
  private static final int cAX;
  private static final int cAY;
  private static final int cAZ;
  private static final int cBa;
  private static final int cBb;
  private static final int cBc;
  private static final int cBd;
  private static final int cBe = "receiveTime".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int cjt;
  private static final int ckP;
  private static final int ckb;
  private static final int cnU;
  private boolean cAN = true;
  private boolean cAO = true;
  private boolean cAP = true;
  private boolean cAQ = true;
  private boolean cAR = true;
  private boolean cAS = true;
  private boolean cAT = true;
  private boolean cAU = true;
  private boolean cAV = true;
  private boolean ciK = true;
  private boolean cjF = true;
  private boolean cjp = true;
  private boolean cky = true;
  private boolean cnG = true;
  public String field_appId;
  public long field_createTime;
  public long field_expireTime;
  public String field_gameMsgId;
  public boolean field_isHidden;
  public boolean field_isRead;
  public String field_label;
  public String field_mergerId;
  public long field_msgId;
  public int field_msgType;
  public String field_rawXML;
  public long field_receiveTime;
  public boolean field_showInMsgList;
  public String field_weight;
  
  static
  {
    cAW = "mergerId".hashCode();
    cAX = "gameMsgId".hashCode();
    cnU = "msgType".hashCode();
    ckb = "createTime".hashCode();
    cAY = "expireTime".hashCode();
    ckP = "appId".hashCode();
    cAZ = "showInMsgList".hashCode();
    cBa = "isRead".hashCode();
    cBb = "label".hashCode();
    cBc = "isHidden".hashCode();
    cBd = "weight".hashCode();
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
      if (ciO != k) {
        break label65;
      }
      this.field_msgId = paramCursor.getLong(i);
      this.ciK = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cAW == k)
      {
        this.field_mergerId = paramCursor.getString(i);
      }
      else if (cAX == k)
      {
        this.field_gameMsgId = paramCursor.getString(i);
      }
      else if (cnU == k)
      {
        this.field_msgType = paramCursor.getInt(i);
      }
      else if (ckb == k)
      {
        this.field_createTime = paramCursor.getLong(i);
      }
      else if (cAY == k)
      {
        this.field_expireTime = paramCursor.getLong(i);
      }
      else if (ckP == k)
      {
        this.field_appId = paramCursor.getString(i);
      }
      else
      {
        boolean bool;
        if (cAZ == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_showInMsgList = bool;
            break;
          }
        }
        if (cBa == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_isRead = bool;
            break;
          }
        }
        if (cBb == k)
        {
          this.field_label = paramCursor.getString(i);
        }
        else
        {
          if (cBc == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_isHidden = bool;
              break;
            }
          }
          if (cBd == k) {
            this.field_weight = paramCursor.getString(i);
          } else if (cjt == k) {
            this.field_rawXML = paramCursor.getString(i);
          } else if (cBe == k) {
            this.field_receiveTime = paramCursor.getLong(i);
          } else if (ciP == k) {
            this.sKx = paramCursor.getLong(i);
          }
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciK) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.cAN) {
      localContentValues.put("mergerId", this.field_mergerId);
    }
    if (this.cAO) {
      localContentValues.put("gameMsgId", this.field_gameMsgId);
    }
    if (this.cnG) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.cAP) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cAQ) {
      localContentValues.put("showInMsgList", Boolean.valueOf(this.field_showInMsgList));
    }
    if (this.cAR) {
      localContentValues.put("isRead", Boolean.valueOf(this.field_isRead));
    }
    if (this.field_label == null) {
      this.field_label = "";
    }
    if (this.cAS) {
      localContentValues.put("label", this.field_label);
    }
    if (this.cAT) {
      localContentValues.put("isHidden", Boolean.valueOf(this.field_isHidden));
    }
    if (this.field_weight == null) {
      this.field_weight = "";
    }
    if (this.cAU) {
      localContentValues.put("weight", this.field_weight);
    }
    if (this.field_rawXML == null) {
      this.field_rawXML = "";
    }
    if (this.cjp) {
      localContentValues.put("rawXML", this.field_rawXML);
    }
    if (this.cAV) {
      localContentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */