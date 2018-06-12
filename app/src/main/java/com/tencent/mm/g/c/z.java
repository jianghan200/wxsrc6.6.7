package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class z
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjZ = "userName".hashCode();
  private static final int coO = "qyUin".hashCode();
  private static final int coP = "userUin".hashCode();
  private static final int coQ = "userFlag".hashCode();
  private static final int coR = "wwExposeTimes".hashCode();
  private static final int coS = "wwMaxExposeTimes".hashCode();
  private static final int coT = "wwCorpId".hashCode();
  private static final int coU = "wwUserVid".hashCode();
  private static final int coV = "userType".hashCode();
  private static final int coW = "chatOpen".hashCode();
  private static final int coX = "wwUnreadCnt".hashCode();
  private static final int coY = "show_confirm".hashCode();
  private static final int coZ = "use_preset_banner_tips".hashCode();
  private boolean cjD = true;
  private boolean coC = true;
  private boolean coD = true;
  private boolean coE = true;
  private boolean coF = true;
  private boolean coG = true;
  private boolean coH = true;
  private boolean coI = true;
  private boolean coJ = true;
  private boolean coK = true;
  private boolean coL = true;
  private boolean coM = true;
  private boolean coN = true;
  public boolean field_chatOpen;
  public int field_qyUin;
  public boolean field_show_confirm;
  public boolean field_use_preset_banner_tips;
  public int field_userFlag;
  public String field_userName;
  public int field_userType;
  public int field_userUin;
  public long field_wwCorpId;
  public int field_wwExposeTimes;
  public int field_wwMaxExposeTimes;
  public int field_wwUnreadCnt;
  public long field_wwUserVid;
  
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
      if (cjZ != k) {
        break label65;
      }
      this.field_userName = paramCursor.getString(i);
      this.cjD = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (coO == k)
      {
        this.field_qyUin = paramCursor.getInt(i);
      }
      else if (coP == k)
      {
        this.field_userUin = paramCursor.getInt(i);
      }
      else if (coQ == k)
      {
        this.field_userFlag = paramCursor.getInt(i);
      }
      else if (coR == k)
      {
        this.field_wwExposeTimes = paramCursor.getInt(i);
      }
      else if (coS == k)
      {
        this.field_wwMaxExposeTimes = paramCursor.getInt(i);
      }
      else if (coT == k)
      {
        this.field_wwCorpId = paramCursor.getLong(i);
      }
      else if (coU == k)
      {
        this.field_wwUserVid = paramCursor.getLong(i);
      }
      else if (coV == k)
      {
        this.field_userType = paramCursor.getInt(i);
      }
      else
      {
        boolean bool;
        if (coW == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_chatOpen = bool;
            break;
          }
        }
        if (coX == k)
        {
          this.field_wwUnreadCnt = paramCursor.getInt(i);
        }
        else
        {
          if (coY == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_show_confirm = bool;
              break;
            }
          }
          if (coZ == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_use_preset_banner_tips = bool;
              break;
            }
          }
          if (ciP == k) {
            this.sKx = paramCursor.getLong(i);
          }
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cjD) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.coC) {
      localContentValues.put("qyUin", Integer.valueOf(this.field_qyUin));
    }
    if (this.coD) {
      localContentValues.put("userUin", Integer.valueOf(this.field_userUin));
    }
    if (this.coE) {
      localContentValues.put("userFlag", Integer.valueOf(this.field_userFlag));
    }
    if (this.coF) {
      localContentValues.put("wwExposeTimes", Integer.valueOf(this.field_wwExposeTimes));
    }
    if (this.coG) {
      localContentValues.put("wwMaxExposeTimes", Integer.valueOf(this.field_wwMaxExposeTimes));
    }
    if (this.coH) {
      localContentValues.put("wwCorpId", Long.valueOf(this.field_wwCorpId));
    }
    if (this.coI) {
      localContentValues.put("wwUserVid", Long.valueOf(this.field_wwUserVid));
    }
    if (this.coJ) {
      localContentValues.put("userType", Integer.valueOf(this.field_userType));
    }
    if (this.coK) {
      localContentValues.put("chatOpen", Boolean.valueOf(this.field_chatOpen));
    }
    if (this.coL) {
      localContentValues.put("wwUnreadCnt", Integer.valueOf(this.field_wwUnreadCnt));
    }
    if (this.coM) {
      localContentValues.put("show_confirm", Boolean.valueOf(this.field_show_confirm));
    }
    if (this.coN) {
      localContentValues.put("use_preset_banner_tips", Boolean.valueOf(this.field_use_preset_banner_tips));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */