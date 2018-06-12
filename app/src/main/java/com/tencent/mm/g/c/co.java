package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class co
  extends c
{
  private static final int cGT;
  private static final int cGX;
  private static final int cHb;
  private static final int cHc;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cjZ;
  private static final int ckb;
  private boolean cGN = true;
  private boolean cGR = true;
  private boolean cGZ = true;
  private boolean cHa = true;
  private boolean ciS = true;
  private boolean cjD = true;
  private boolean cjF = true;
  public long field_createTime;
  public String field_inviteUserName;
  public long field_memberId;
  public long field_memberUuid;
  public int field_status;
  public String field_userName;
  public String field_wxGroupId;
  
  static
  {
    cHb = "memberUuid".hashCode();
    cGT = "wxGroupId".hashCode();
    cjZ = "userName".hashCode();
    cGX = "inviteUserName".hashCode();
    cHc = "memberId".hashCode();
    ciV = "status".hashCode();
    ckb = "createTime".hashCode();
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
      if (cHb != k) {
        break label60;
      }
      this.field_memberUuid = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cGT == k) {
        this.field_wxGroupId = paramCursor.getString(i);
      } else if (cjZ == k) {
        this.field_userName = paramCursor.getString(i);
      } else if (cGX == k) {
        this.field_inviteUserName = paramCursor.getString(i);
      } else if (cHc == k) {
        this.field_memberId = paramCursor.getLong(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cGZ) {
      localContentValues.put("memberUuid", Long.valueOf(this.field_memberUuid));
    }
    if (this.cGN) {
      localContentValues.put("wxGroupId", this.field_wxGroupId);
    }
    if (this.cjD) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.cGR) {
      localContentValues.put("inviteUserName", this.field_inviteUserName);
    }
    if (this.cHa) {
      localContentValues.put("memberId", Long.valueOf(this.field_memberId));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */