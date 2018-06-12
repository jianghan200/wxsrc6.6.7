package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bu
  extends c
{
  private static final int cCa;
  private static final int cCb;
  private static final int cCc;
  private static final int cCd;
  private static final int cCe;
  private static final int cCf;
  private static final int cCg;
  private static final int cCh;
  private static final int cCi;
  private static final int cCj = "googleitemid".hashCode();
  private static final int cCk = "googlecgistatus".hashCode();
  private static final int cCl = "contecttype".hashCode();
  private static final int cCm = "googlenamepy".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cli;
  private static final int cpI;
  private boolean cBN = true;
  private boolean cBO = true;
  private boolean cBP = true;
  private boolean cBQ = true;
  private boolean cBR = true;
  private boolean cBS = true;
  private boolean cBT = true;
  private boolean cBU = true;
  private boolean cBV = true;
  private boolean cBW = true;
  private boolean cBX = true;
  private boolean cBY = true;
  private boolean cBZ = true;
  private boolean ciS = true;
  private boolean clg = true;
  private boolean cpE = true;
  public String field_big_url;
  public String field_contecttype;
  public int field_googlecgistatus;
  public String field_googlegmail;
  public String field_googleid;
  public String field_googleitemid;
  public String field_googlename;
  public String field_googlenamepy;
  public String field_googlephotourl;
  public String field_nickname;
  public String field_nicknameqp;
  public int field_ret;
  public String field_small_url;
  public int field_status;
  public String field_username;
  public String field_usernamepy;
  
  static
  {
    cCa = "googleid".hashCode();
    cCb = "googlename".hashCode();
    cCc = "googlephotourl".hashCode();
    cCd = "googlegmail".hashCode();
    cli = "username".hashCode();
    cpI = "nickname".hashCode();
    cCe = "nicknameqp".hashCode();
    cCf = "usernamepy".hashCode();
    cCg = "small_url".hashCode();
    cCh = "big_url".hashCode();
    cCi = "ret".hashCode();
    ciV = "status".hashCode();
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
      if (cCa != k) {
        break label60;
      }
      this.field_googleid = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cCb == k)
      {
        this.field_googlename = paramCursor.getString(i);
      }
      else if (cCc == k)
      {
        this.field_googlephotourl = paramCursor.getString(i);
      }
      else if (cCd == k)
      {
        this.field_googlegmail = paramCursor.getString(i);
      }
      else if (cli == k)
      {
        this.field_username = paramCursor.getString(i);
      }
      else if (cpI == k)
      {
        this.field_nickname = paramCursor.getString(i);
      }
      else if (cCe == k)
      {
        this.field_nicknameqp = paramCursor.getString(i);
      }
      else if (cCf == k)
      {
        this.field_usernamepy = paramCursor.getString(i);
      }
      else if (cCg == k)
      {
        this.field_small_url = paramCursor.getString(i);
      }
      else if (cCh == k)
      {
        this.field_big_url = paramCursor.getString(i);
      }
      else if (cCi == k)
      {
        this.field_ret = paramCursor.getInt(i);
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getInt(i);
      }
      else if (cCj == k)
      {
        this.field_googleitemid = paramCursor.getString(i);
        this.cBW = true;
      }
      else if (cCk == k)
      {
        this.field_googlecgistatus = paramCursor.getInt(i);
      }
      else if (cCl == k)
      {
        this.field_contecttype = paramCursor.getString(i);
      }
      else if (cCm == k)
      {
        this.field_googlenamepy = paramCursor.getString(i);
      }
      else if (ciP == k)
      {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cBN) {
      localContentValues.put("googleid", this.field_googleid);
    }
    if (this.cBO) {
      localContentValues.put("googlename", this.field_googlename);
    }
    if (this.cBP) {
      localContentValues.put("googlephotourl", this.field_googlephotourl);
    }
    if (this.cBQ) {
      localContentValues.put("googlegmail", this.field_googlegmail);
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cpE) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.cBR) {
      localContentValues.put("nicknameqp", this.field_nicknameqp);
    }
    if (this.cBS) {
      localContentValues.put("usernamepy", this.field_usernamepy);
    }
    if (this.cBT) {
      localContentValues.put("small_url", this.field_small_url);
    }
    if (this.cBU) {
      localContentValues.put("big_url", this.field_big_url);
    }
    if (this.cBV) {
      localContentValues.put("ret", Integer.valueOf(this.field_ret));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cBW) {
      localContentValues.put("googleitemid", this.field_googleitemid);
    }
    if (this.cBX) {
      localContentValues.put("googlecgistatus", Integer.valueOf(this.field_googlecgistatus));
    }
    if (this.cBY) {
      localContentValues.put("contecttype", this.field_contecttype);
    }
    if (this.cBZ) {
      localContentValues.put("googlenamepy", this.field_googlenamepy);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */