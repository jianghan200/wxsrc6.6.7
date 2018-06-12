package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dl
  extends c
{
  private static final int cDi = "score".hashCode();
  private static final int cLX;
  private static final int cLY;
  private static final int cLZ;
  private static final int cMa;
  private static final int cMb;
  private static final int cMc;
  public static final String[] ciG = new String[0];
  private static final int ciN = "chatroom".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int cnK;
  private static final int cpI;
  private boolean cDh = true;
  private boolean cLR = true;
  private boolean cLS = true;
  private boolean cLT = true;
  private boolean cLU = true;
  private boolean cLV = true;
  private boolean cLW = true;
  private boolean ciJ = true;
  private boolean cnw = true;
  private boolean cpE = true;
  public String field_chatroom;
  public String field_daySec;
  public int field_disRedDotCount;
  public int field_enterCount;
  public int field_isMute;
  public String field_nickname;
  public float field_score;
  public int field_sendCount;
  public long field_stayTime;
  public int field_unReadCount;
  
  static
  {
    cLX = "daySec".hashCode();
    cpI = "nickname".hashCode();
    cLY = "isMute".hashCode();
    cnK = "unReadCount".hashCode();
    cLZ = "sendCount".hashCode();
    cMa = "enterCount".hashCode();
    cMb = "disRedDotCount".hashCode();
    cMc = "stayTime".hashCode();
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
      if (ciN != k) {
        break label60;
      }
      this.field_chatroom = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cLX == k) {
        this.field_daySec = paramCursor.getString(i);
      } else if (cpI == k) {
        this.field_nickname = paramCursor.getString(i);
      } else if (cLY == k) {
        this.field_isMute = paramCursor.getInt(i);
      } else if (cnK == k) {
        this.field_unReadCount = paramCursor.getInt(i);
      } else if (cLZ == k) {
        this.field_sendCount = paramCursor.getInt(i);
      } else if (cMa == k) {
        this.field_enterCount = paramCursor.getInt(i);
      } else if (cMb == k) {
        this.field_disRedDotCount = paramCursor.getInt(i);
      } else if (cMc == k) {
        this.field_stayTime = paramCursor.getLong(i);
      } else if (cDi == k) {
        this.field_score = paramCursor.getFloat(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciJ) {
      localContentValues.put("chatroom", this.field_chatroom);
    }
    if (this.cLR) {
      localContentValues.put("daySec", this.field_daySec);
    }
    if (this.cpE) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.cLS) {
      localContentValues.put("isMute", Integer.valueOf(this.field_isMute));
    }
    if (this.cnw) {
      localContentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
    }
    if (this.cLT) {
      localContentValues.put("sendCount", Integer.valueOf(this.field_sendCount));
    }
    if (this.cLU) {
      localContentValues.put("enterCount", Integer.valueOf(this.field_enterCount));
    }
    if (this.cLV) {
      localContentValues.put("disRedDotCount", Integer.valueOf(this.field_disRedDotCount));
    }
    if (this.cLW) {
      localContentValues.put("stayTime", Long.valueOf(this.field_stayTime));
    }
    if (this.cDh) {
      localContentValues.put("score", Float.valueOf(this.field_score));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */