package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fe
  extends c
{
  private static final int cVE;
  private static final int cVF;
  private static final int cVG;
  private static final int cVH;
  private static final int cVI;
  private static final int cVJ;
  private static final int cVK;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int clG;
  private boolean cVA = true;
  private boolean cVB = true;
  private boolean cVC = true;
  private boolean cVD = true;
  private boolean cVx = true;
  private boolean cVy = true;
  private boolean cVz = true;
  private boolean cjF = true;
  private boolean clA = true;
  public String field_AppId;
  public String field_AppName;
  public String field_BriefIntro;
  public String field_IconUrl;
  public String field_RecordId;
  public String field_UserName;
  public long field_createTime;
  public int field_debugType;
  public boolean field_isSync;
  
  static
  {
    cVE = "RecordId".hashCode();
    cVF = "AppId".hashCode();
    cVG = "AppName".hashCode();
    cVH = "UserName".hashCode();
    cVI = "IconUrl".hashCode();
    cVJ = "BriefIntro".hashCode();
    cVK = "isSync".hashCode();
    clG = "debugType".hashCode();
    ckb = "createTime".hashCode();
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
      if (cVE != k) {
        break label65;
      }
      this.field_RecordId = paramCursor.getString(i);
      this.cVx = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cVF == k)
      {
        this.field_AppId = paramCursor.getString(i);
      }
      else if (cVG == k)
      {
        this.field_AppName = paramCursor.getString(i);
      }
      else if (cVH == k)
      {
        this.field_UserName = paramCursor.getString(i);
      }
      else if (cVI == k)
      {
        this.field_IconUrl = paramCursor.getString(i);
      }
      else if (cVJ == k)
      {
        this.field_BriefIntro = paramCursor.getString(i);
      }
      else
      {
        if (cVK == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isSync = bool;
            break;
          }
        }
        if (clG == k) {
          this.field_debugType = paramCursor.getInt(i);
        } else if (ckb == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cVx) {
      localContentValues.put("RecordId", this.field_RecordId);
    }
    if (this.cVy) {
      localContentValues.put("AppId", this.field_AppId);
    }
    if (this.cVz) {
      localContentValues.put("AppName", this.field_AppName);
    }
    if (this.cVA) {
      localContentValues.put("UserName", this.field_UserName);
    }
    if (this.cVB) {
      localContentValues.put("IconUrl", this.field_IconUrl);
    }
    if (this.cVC) {
      localContentValues.put("BriefIntro", this.field_BriefIntro);
    }
    if (this.cVD) {
      localContentValues.put("isSync", Boolean.valueOf(this.field_isSync));
    }
    if (this.clA) {
      localContentValues.put("debugType", Integer.valueOf(this.field_debugType));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */