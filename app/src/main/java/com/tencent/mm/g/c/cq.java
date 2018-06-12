package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.btb;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class cq
  extends c
{
  private static final int cID;
  private static final int cIE;
  private static final int cIF;
  private static final int cIG;
  private static final int cIH;
  private static final int cII;
  private static final int cIJ;
  private static final int cIK;
  private static final int cIL;
  private static final int cIM;
  private static final int cIN;
  private static final int cIO = "pagestaytime".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cps;
  private boolean cIA = true;
  private boolean cIB = true;
  private boolean cIC = true;
  private boolean cIr = true;
  private boolean cIs = true;
  private boolean cIt = true;
  private boolean cIu = true;
  private boolean cIv = true;
  private boolean cIw = true;
  private boolean cIx = true;
  private boolean cIy = true;
  private boolean cIz = true;
  private boolean cpe = true;
  public long field_beginShowTime;
  public long field_disappearTime;
  public String field_extInfo;
  public boolean field_hadRead;
  public boolean field_isExit;
  public boolean field_isReject;
  public long field_overdueTime;
  public long field_pagestaytime;
  public int field_tipId;
  public int field_tipType;
  public int field_tipVersion;
  public String field_tipkey;
  public btb field_tipsShowInfo;
  
  static
  {
    cID = "tipId".hashCode();
    cIE = "tipVersion".hashCode();
    cIF = "tipkey".hashCode();
    cIG = "tipType".hashCode();
    cIH = "isExit".hashCode();
    cII = "hadRead".hashCode();
    cIJ = "isReject".hashCode();
    cIK = "beginShowTime".hashCode();
    cIL = "disappearTime".hashCode();
    cIM = "overdueTime".hashCode();
    cIN = "tipsShowInfo".hashCode();
    cps = "extInfo".hashCode();
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
      if (cID != k) {
        break label65;
      }
      this.field_tipId = paramCursor.getInt(i);
      this.cIr = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cIE == k)
      {
        this.field_tipVersion = paramCursor.getInt(i);
      }
      else if (cIF == k)
      {
        this.field_tipkey = paramCursor.getString(i);
      }
      else if (cIG == k)
      {
        this.field_tipType = paramCursor.getInt(i);
      }
      else
      {
        boolean bool;
        if (cIH == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_isExit = bool;
            break;
          }
        }
        if (cII == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_hadRead = bool;
            break;
          }
        }
        if (cIJ == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_isReject = bool;
            break;
          }
        }
        if (cIK == k) {
          this.field_beginShowTime = paramCursor.getLong(i);
        } else if (cIL == k) {
          this.field_disappearTime = paramCursor.getLong(i);
        } else if (cIM == k) {
          this.field_overdueTime = paramCursor.getLong(i);
        } else if (cIN == k) {
          try
          {
            byte[] arrayOfByte = paramCursor.getBlob(i);
            if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
              continue;
            }
            this.field_tipsShowInfo = ((btb)new btb().aG(arrayOfByte));
          }
          catch (IOException localIOException)
          {
            x.e("MicroMsg.SDK.BaseNewTipsInfo", localIOException.getMessage());
          }
        } else if (cps == k) {
          this.field_extInfo = paramCursor.getString(i);
        } else if (cIO == k) {
          this.field_pagestaytime = paramCursor.getLong(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cIr) {
      localContentValues.put("tipId", Integer.valueOf(this.field_tipId));
    }
    if (this.cIs) {
      localContentValues.put("tipVersion", Integer.valueOf(this.field_tipVersion));
    }
    if (this.cIt) {
      localContentValues.put("tipkey", this.field_tipkey);
    }
    if (this.cIu) {
      localContentValues.put("tipType", Integer.valueOf(this.field_tipType));
    }
    if (this.cIv) {
      localContentValues.put("isExit", Boolean.valueOf(this.field_isExit));
    }
    if (this.cIw) {
      localContentValues.put("hadRead", Boolean.valueOf(this.field_hadRead));
    }
    if (this.cIx) {
      localContentValues.put("isReject", Boolean.valueOf(this.field_isReject));
    }
    if (this.cIy) {
      localContentValues.put("beginShowTime", Long.valueOf(this.field_beginShowTime));
    }
    if (this.cIz) {
      localContentValues.put("disappearTime", Long.valueOf(this.field_disappearTime));
    }
    if (this.cIA) {
      localContentValues.put("overdueTime", Long.valueOf(this.field_overdueTime));
    }
    if ((this.cIB) && (this.field_tipsShowInfo != null)) {}
    try
    {
      localContentValues.put("tipsShowInfo", this.field_tipsShowInfo.toByteArray());
      if (this.cpe) {
        localContentValues.put("extInfo", this.field_extInfo);
      }
      if (this.cIC) {
        localContentValues.put("pagestaytime", Long.valueOf(this.field_pagestaytime));
      }
      if (this.sKx > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.sKx));
      }
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseNewTipsInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */