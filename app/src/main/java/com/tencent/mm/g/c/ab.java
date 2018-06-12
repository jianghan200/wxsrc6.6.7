package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ab
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int clj;
  private static final int cmt = "openId".hashCode();
  private static final int cpG = "brandUsername".hashCode();
  private static final int cpH = "headImgUrl".hashCode();
  private static final int cpI = "nickname".hashCode();
  private static final int cpJ = "kfType".hashCode();
  private boolean clW = true;
  private boolean clh = true;
  private boolean cpC = true;
  private boolean cpD = true;
  private boolean cpE = true;
  private boolean cpF = true;
  public String field_brandUsername;
  public String field_headImgUrl;
  public int field_kfType;
  public String field_nickname;
  public String field_openId;
  public long field_updateTime;
  
  static
  {
    clj = "updateTime".hashCode();
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
      if (cmt != k) {
        break label65;
      }
      this.field_openId = paramCursor.getString(i);
      this.clW = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cpG == k) {
        this.field_brandUsername = paramCursor.getString(i);
      } else if (cpH == k) {
        this.field_headImgUrl = paramCursor.getString(i);
      } else if (cpI == k) {
        this.field_nickname = paramCursor.getString(i);
      } else if (cpJ == k) {
        this.field_kfType = paramCursor.getInt(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clW) {
      localContentValues.put("openId", this.field_openId);
    }
    if (this.field_brandUsername == null) {
      this.field_brandUsername = "";
    }
    if (this.cpC) {
      localContentValues.put("brandUsername", this.field_brandUsername);
    }
    if (this.cpD) {
      localContentValues.put("headImgUrl", this.field_headImgUrl);
    }
    if (this.cpE) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.cpF) {
      localContentValues.put("kfType", Integer.valueOf(this.field_kfType));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */