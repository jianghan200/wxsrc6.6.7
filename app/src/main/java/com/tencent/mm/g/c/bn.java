package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class bn
  extends c
{
  private static final int cAB;
  private static final int cAC;
  private static final int cAD;
  private static final int cAE;
  private static final int cAF;
  private static final int cAG;
  private static final int cAH;
  private static final int cAI;
  private static final int cAJ;
  private static final int cAK;
  private static final int cAL;
  private static final int cAM = "needShow".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int clC;
  private boolean cAA = true;
  private boolean cAp = true;
  private boolean cAq = true;
  private boolean cAr = true;
  private boolean cAs = true;
  private boolean cAt = true;
  private boolean cAu = true;
  private boolean cAv = true;
  private boolean cAw = true;
  private boolean cAx = true;
  private boolean cAy = true;
  private boolean cAz = true;
  private boolean ciS = true;
  private boolean clw = true;
  public by field_addMsg;
  public String field_cgi;
  public int field_cmdid;
  public String field_custombuff;
  public int field_failkey;
  public int field_finalfailkey;
  public String field_functionmsgid;
  public boolean field_needShow;
  public long field_preVersion;
  public int field_reportid;
  public int field_retryinterval;
  public int field_status;
  public int field_successkey;
  public long field_version;
  
  static
  {
    cAB = "cgi".hashCode();
    cAC = "cmdid".hashCode();
    cAD = "functionmsgid".hashCode();
    clC = "version".hashCode();
    cAE = "preVersion".hashCode();
    cAF = "retryinterval".hashCode();
    cAG = "reportid".hashCode();
    cAH = "successkey".hashCode();
    cAI = "failkey".hashCode();
    cAJ = "finalfailkey".hashCode();
    cAK = "custombuff".hashCode();
    cAL = "addMsg".hashCode();
    ciV = "status".hashCode();
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
      if (cAB != k) {
        break label60;
      }
      this.field_cgi = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cAC == k)
      {
        this.field_cmdid = paramCursor.getInt(i);
      }
      else if (cAD == k)
      {
        this.field_functionmsgid = paramCursor.getString(i);
        this.cAr = true;
      }
      else if (clC == k)
      {
        this.field_version = paramCursor.getLong(i);
      }
      else if (cAE == k)
      {
        this.field_preVersion = paramCursor.getLong(i);
      }
      else if (cAF == k)
      {
        this.field_retryinterval = paramCursor.getInt(i);
      }
      else if (cAG == k)
      {
        this.field_reportid = paramCursor.getInt(i);
      }
      else if (cAH == k)
      {
        this.field_successkey = paramCursor.getInt(i);
      }
      else if (cAI == k)
      {
        this.field_failkey = paramCursor.getInt(i);
      }
      else if (cAJ == k)
      {
        this.field_finalfailkey = paramCursor.getInt(i);
      }
      else if (cAK == k)
      {
        this.field_custombuff = paramCursor.getString(i);
      }
      else if (cAL == k)
      {
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(i);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
            continue;
          }
          this.field_addMsg = ((by)new by().aG(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.SDK.BaseFunctionMsgItem", localIOException.getMessage());
        }
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getInt(i);
      }
      else
      {
        if (cAM == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_needShow = bool;
            break;
          }
        }
        if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cAp) {
      localContentValues.put("cgi", this.field_cgi);
    }
    if (this.cAq) {
      localContentValues.put("cmdid", Integer.valueOf(this.field_cmdid));
    }
    if (this.cAr) {
      localContentValues.put("functionmsgid", this.field_functionmsgid);
    }
    if (this.clw) {
      localContentValues.put("version", Long.valueOf(this.field_version));
    }
    if (this.cAs) {
      localContentValues.put("preVersion", Long.valueOf(this.field_preVersion));
    }
    if (this.cAt) {
      localContentValues.put("retryinterval", Integer.valueOf(this.field_retryinterval));
    }
    if (this.cAu) {
      localContentValues.put("reportid", Integer.valueOf(this.field_reportid));
    }
    if (this.cAv) {
      localContentValues.put("successkey", Integer.valueOf(this.field_successkey));
    }
    if (this.cAw) {
      localContentValues.put("failkey", Integer.valueOf(this.field_failkey));
    }
    if (this.cAx) {
      localContentValues.put("finalfailkey", Integer.valueOf(this.field_finalfailkey));
    }
    if (this.cAy) {
      localContentValues.put("custombuff", this.field_custombuff);
    }
    if ((this.cAz) && (this.field_addMsg != null)) {}
    try
    {
      localContentValues.put("addMsg", this.field_addMsg.toByteArray());
      if (this.ciS) {
        localContentValues.put("status", Integer.valueOf(this.field_status));
      }
      if (this.cAA) {
        localContentValues.put("needShow", Boolean.valueOf(this.field_needShow));
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
        x.e("MicroMsg.SDK.BaseFunctionMsgItem", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */