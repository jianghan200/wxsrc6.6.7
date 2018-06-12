package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class w
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnJ;
  private static final int cnS;
  private static final int coi = "bizChatLocalId".hashCode();
  private static final int coj = "bizChatServId".hashCode();
  private static final int cok;
  private static final int col;
  private static final int com;
  private static final int con;
  private static final int coo;
  private static final int cop;
  private static final int coq;
  private static final int cor;
  private static final int cos;
  private static final int cot;
  private boolean cnE = true;
  private boolean cnW = true;
  private boolean cnX = true;
  private boolean cnY = true;
  private boolean cnZ = true;
  private boolean cnv = true;
  private boolean coa = true;
  private boolean cob = true;
  private boolean coc = true;
  private boolean cod = true;
  private boolean coe = true;
  private boolean cof = true;
  private boolean cog = true;
  private boolean coh = true;
  public String field_addMemberUrl;
  public int field_bitFlag;
  public long field_bizChatLocalId;
  public String field_bizChatServId;
  public String field_brandUserName;
  public String field_chatName;
  public String field_chatNamePY;
  public int field_chatType;
  public int field_chatVersion;
  public String field_headImageUrl;
  public int field_maxMemberCnt;
  public boolean field_needToUpdate;
  public String field_ownerUserId;
  public String field_userList;
  
  static
  {
    cnJ = "brandUserName".hashCode();
    cnS = "chatType".hashCode();
    cok = "headImageUrl".hashCode();
    col = "chatName".hashCode();
    com = "chatNamePY".hashCode();
    con = "chatVersion".hashCode();
    coo = "needToUpdate".hashCode();
    cop = "bitFlag".hashCode();
    coq = "maxMemberCnt".hashCode();
    cor = "ownerUserId".hashCode();
    cos = "userList".hashCode();
    cot = "addMemberUrl".hashCode();
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
      if (coi != k) {
        break label65;
      }
      this.field_bizChatLocalId = paramCursor.getLong(i);
      this.cnW = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (coj == k)
      {
        this.field_bizChatServId = paramCursor.getString(i);
      }
      else if (cnJ == k)
      {
        this.field_brandUserName = paramCursor.getString(i);
      }
      else if (cnS == k)
      {
        this.field_chatType = paramCursor.getInt(i);
      }
      else if (cok == k)
      {
        this.field_headImageUrl = paramCursor.getString(i);
      }
      else if (col == k)
      {
        this.field_chatName = paramCursor.getString(i);
      }
      else if (com == k)
      {
        this.field_chatNamePY = paramCursor.getString(i);
      }
      else if (con == k)
      {
        this.field_chatVersion = paramCursor.getInt(i);
      }
      else
      {
        if (coo == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_needToUpdate = bool;
            break;
          }
        }
        if (cop == k) {
          this.field_bitFlag = paramCursor.getInt(i);
        } else if (coq == k) {
          this.field_maxMemberCnt = paramCursor.getInt(i);
        } else if (cor == k) {
          this.field_ownerUserId = paramCursor.getString(i);
        } else if (cos == k) {
          this.field_userList = paramCursor.getString(i);
        } else if (cot == k) {
          this.field_addMemberUrl = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cnW) {
      localContentValues.put("bizChatLocalId", Long.valueOf(this.field_bizChatLocalId));
    }
    if (this.cnX) {
      localContentValues.put("bizChatServId", this.field_bizChatServId);
    }
    if (this.field_brandUserName == null) {
      this.field_brandUserName = "";
    }
    if (this.cnv) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.cnE) {
      localContentValues.put("chatType", Integer.valueOf(this.field_chatType));
    }
    if (this.cnY) {
      localContentValues.put("headImageUrl", this.field_headImageUrl);
    }
    if (this.field_chatName == null) {
      this.field_chatName = "";
    }
    if (this.cnZ) {
      localContentValues.put("chatName", this.field_chatName);
    }
    if (this.field_chatNamePY == null) {
      this.field_chatNamePY = "";
    }
    if (this.coa) {
      localContentValues.put("chatNamePY", this.field_chatNamePY);
    }
    if (this.cob) {
      localContentValues.put("chatVersion", Integer.valueOf(this.field_chatVersion));
    }
    if (this.coc) {
      localContentValues.put("needToUpdate", Boolean.valueOf(this.field_needToUpdate));
    }
    if (this.cod) {
      localContentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
    }
    if (this.coe) {
      localContentValues.put("maxMemberCnt", Integer.valueOf(this.field_maxMemberCnt));
    }
    if (this.cof) {
      localContentValues.put("ownerUserId", this.field_ownerUserId);
    }
    if (this.cog) {
      localContentValues.put("userList", this.field_userList);
    }
    if (this.coh) {
      localContentValues.put("addMemberUrl", this.field_addMemberUrl);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */