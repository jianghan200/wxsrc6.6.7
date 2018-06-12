package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class y
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjZ;
  private static final int cnJ;
  private static final int coA;
  private static final int coB;
  private static final int cok;
  private static final int coo;
  private static final int cop;
  private static final int cot;
  private static final int cov = "userId".hashCode();
  private static final int coz;
  private boolean cjD = true;
  private boolean cnY = true;
  private boolean cnv = true;
  private boolean coc = true;
  private boolean cod = true;
  private boolean coh = true;
  private boolean cou = true;
  private boolean cow = true;
  private boolean cox = true;
  private boolean coy = true;
  public int field_UserVersion;
  public String field_addMemberUrl;
  public int field_bitFlag;
  public String field_brandUserName;
  public String field_headImageUrl;
  public boolean field_needToUpdate;
  public String field_profileUrl;
  public String field_userId;
  public String field_userName;
  public String field_userNamePY;
  
  static
  {
    cjZ = "userName".hashCode();
    coz = "userNamePY".hashCode();
    cnJ = "brandUserName".hashCode();
    coA = "UserVersion".hashCode();
    coo = "needToUpdate".hashCode();
    cok = "headImageUrl".hashCode();
    coB = "profileUrl".hashCode();
    cop = "bitFlag".hashCode();
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
      if (cov != k) {
        break label65;
      }
      this.field_userId = paramCursor.getString(i);
      this.cou = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cjZ == k)
      {
        this.field_userName = paramCursor.getString(i);
      }
      else if (coz == k)
      {
        this.field_userNamePY = paramCursor.getString(i);
      }
      else if (cnJ == k)
      {
        this.field_brandUserName = paramCursor.getString(i);
      }
      else if (coA == k)
      {
        this.field_UserVersion = paramCursor.getInt(i);
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
        if (cok == k) {
          this.field_headImageUrl = paramCursor.getString(i);
        } else if (coB == k) {
          this.field_profileUrl = paramCursor.getString(i);
        } else if (cop == k) {
          this.field_bitFlag = paramCursor.getInt(i);
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
    if (this.cou) {
      localContentValues.put("userId", this.field_userId);
    }
    if (this.field_userName == null) {
      this.field_userName = "";
    }
    if (this.cjD) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.field_userNamePY == null) {
      this.field_userNamePY = "";
    }
    if (this.cow) {
      localContentValues.put("userNamePY", this.field_userNamePY);
    }
    if (this.field_brandUserName == null) {
      this.field_brandUserName = "";
    }
    if (this.cnv) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.cox) {
      localContentValues.put("UserVersion", Integer.valueOf(this.field_UserVersion));
    }
    if (this.coc) {
      localContentValues.put("needToUpdate", Boolean.valueOf(this.field_needToUpdate));
    }
    if (this.cnY) {
      localContentValues.put("headImageUrl", this.field_headImageUrl);
    }
    if (this.coy) {
      localContentValues.put("profileUrl", this.field_profileUrl);
    }
    if (this.cod) {
      localContentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */