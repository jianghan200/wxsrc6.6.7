package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cn
  extends c
{
  private static final int cGT;
  private static final int cGU;
  private static final int cGV;
  private static final int cGW;
  private static final int cGX;
  private static final int cGY;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int cvQ;
  private static final int cvX;
  private boolean cGN = true;
  private boolean cGO = true;
  private boolean cGP = true;
  private boolean cGQ = true;
  private boolean cGR = true;
  private boolean cGS = true;
  private boolean cjF = true;
  private boolean cvo = true;
  private boolean cvw = true;
  public long field_createTime;
  public String field_groupId;
  public String field_inviteUserName;
  public int field_memberCount;
  public int field_roomId;
  public long field_roomKey;
  public int field_routeId;
  public int field_state;
  public String field_wxGroupId;
  
  static
  {
    cGT = "wxGroupId".hashCode();
    cvX = "groupId".hashCode();
    cGU = "roomId".hashCode();
    cGV = "roomKey".hashCode();
    cGW = "routeId".hashCode();
    cGX = "inviteUserName".hashCode();
    cGY = "memberCount".hashCode();
    ckb = "createTime".hashCode();
    cvQ = "state".hashCode();
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
      if (cGT != k) {
        break label65;
      }
      this.field_wxGroupId = paramCursor.getString(i);
      this.cGN = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cvX == k) {
        this.field_groupId = paramCursor.getString(i);
      } else if (cGU == k) {
        this.field_roomId = paramCursor.getInt(i);
      } else if (cGV == k) {
        this.field_roomKey = paramCursor.getLong(i);
      } else if (cGW == k) {
        this.field_routeId = paramCursor.getInt(i);
      } else if (cGX == k) {
        this.field_inviteUserName = paramCursor.getString(i);
      } else if (cGY == k) {
        this.field_memberCount = paramCursor.getInt(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (cvQ == k) {
        this.field_state = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cGN) {
      localContentValues.put("wxGroupId", this.field_wxGroupId);
    }
    if (this.cvw) {
      localContentValues.put("groupId", this.field_groupId);
    }
    if (this.cGO) {
      localContentValues.put("roomId", Integer.valueOf(this.field_roomId));
    }
    if (this.cGP) {
      localContentValues.put("roomKey", Long.valueOf(this.field_roomKey));
    }
    if (this.cGQ) {
      localContentValues.put("routeId", Integer.valueOf(this.field_routeId));
    }
    if (this.cGR) {
      localContentValues.put("inviteUserName", this.field_inviteUserName);
    }
    if (this.cGS) {
      localContentValues.put("memberCount", Integer.valueOf(this.field_memberCount));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.cvo) {
      localContentValues.put("state", Integer.valueOf(this.field_state));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */