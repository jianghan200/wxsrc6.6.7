package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public abstract class ac
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckb;
  private static final int cke;
  private static final int ckj;
  private static final int cpS = "msgSvrId".hashCode();
  private static final int cpT;
  private static final int cpU;
  private static final int cpV;
  private static final int cpW;
  private static final int cpX;
  private static final int cpY;
  private static final int cpZ;
  private boolean ciK = true;
  private boolean ciS = true;
  private boolean cjF = true;
  private boolean cjI = true;
  private boolean cjN = true;
  private boolean cpK = true;
  private boolean cpL = true;
  private boolean cpM = true;
  private boolean cpN = true;
  private boolean cpO = true;
  private boolean cpP = true;
  private boolean cpQ = true;
  private boolean cpR = true;
  private int cqa;
  private String cqb;
  public String field_content;
  public long field_createTime;
  public int field_hasShow;
  public String field_imgPath;
  public boolean field_isExpand;
  public byte[] field_lvbuffer;
  public long field_msgId;
  public long field_msgSvrId;
  public long field_orderFlag;
  public int field_status;
  public String field_talker;
  public int field_talkerId;
  public int field_type;
  
  static
  {
    cke = "type".hashCode();
    ciV = "status".hashCode();
    ckb = "createTime".hashCode();
    cpT = "talker".hashCode();
    ckj = "content".hashCode();
    cpU = "imgPath".hashCode();
    cpV = "lvbuffer".hashCode();
    cpW = "talkerId".hashCode();
    cpX = "isExpand".hashCode();
    cpY = "orderFlag".hashCode();
    cpZ = "hasShow".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {}
    do
    {
      for (;;)
      {
        return;
        int j = arrayOfString.length;
        int i = 0;
        if (i < j)
        {
          int k = arrayOfString[i].hashCode();
          if (ciO == k)
          {
            this.field_msgId = paramCursor.getLong(i);
            this.ciK = true;
          }
          for (;;)
          {
            i += 1;
            break;
            if (cpS == k)
            {
              this.field_msgSvrId = paramCursor.getLong(i);
            }
            else if (cke == k)
            {
              this.field_type = paramCursor.getInt(i);
            }
            else if (ciV == k)
            {
              this.field_status = paramCursor.getInt(i);
            }
            else if (ckb == k)
            {
              this.field_createTime = paramCursor.getLong(i);
            }
            else if (cpT == k)
            {
              this.field_talker = paramCursor.getString(i);
            }
            else if (ckj == k)
            {
              this.field_content = paramCursor.getString(i);
            }
            else if (cpU == k)
            {
              this.field_imgPath = paramCursor.getString(i);
            }
            else if (cpV == k)
            {
              this.field_lvbuffer = paramCursor.getBlob(i);
            }
            else if (cpW == k)
            {
              this.field_talkerId = paramCursor.getInt(i);
            }
            else
            {
              if (cpX == k)
              {
                if (paramCursor.getInt(i) != 0) {}
                for (boolean bool = true;; bool = false)
                {
                  this.field_isExpand = bool;
                  break;
                }
              }
              if (cpY == k) {
                this.field_orderFlag = paramCursor.getLong(i);
              } else if (cpZ == k) {
                this.field_hasShow = paramCursor.getInt(i);
              } else if (ciP == k) {
                this.sKx = paramCursor.getLong(i);
              }
            }
          }
        }
        try
        {
          if ((this.field_lvbuffer != null) && (this.field_lvbuffer.length != 0))
          {
            paramCursor = new u();
            i = paramCursor.by(this.field_lvbuffer);
            if (i != 0)
            {
              x.e("MicroMsg.SDK.BaseBizTimeLineInfo", "parse LVBuffer error:" + i);
              return;
            }
          }
        }
        catch (Exception paramCursor)
        {
          x.e("MicroMsg.SDK.BaseBizTimeLineInfo", "get value failed");
          return;
        }
      }
      if (!paramCursor.chD()) {
        this.cqa = paramCursor.getInt();
      }
    } while (paramCursor.chD());
    this.cqb = paramCursor.getString();
  }
  
  public final void dt(String paramString)
  {
    this.cqb = paramString;
    this.cpN = true;
  }
  
  public final void eC(int paramInt)
  {
    this.cqa = paramInt;
    this.cpN = true;
  }
  
  public final ContentValues wH()
  {
    try
    {
      if (this.cpN)
      {
        localObject = new u();
        ((u)localObject).chE();
        ((u)localObject).CZ(this.cqa);
        ((u)localObject).Wj(this.cqb);
        this.field_lvbuffer = ((u)localObject).chF();
      }
      Object localObject = new ContentValues();
      if (this.ciK) {
        ((ContentValues)localObject).put("msgId", Long.valueOf(this.field_msgId));
      }
      if (this.cpK) {
        ((ContentValues)localObject).put("msgSvrId", Long.valueOf(this.field_msgSvrId));
      }
      if (this.cjI) {
        ((ContentValues)localObject).put("type", Integer.valueOf(this.field_type));
      }
      if (this.ciS) {
        ((ContentValues)localObject).put("status", Integer.valueOf(this.field_status));
      }
      if (this.cjF) {
        ((ContentValues)localObject).put("createTime", Long.valueOf(this.field_createTime));
      }
      if (this.cpL) {
        ((ContentValues)localObject).put("talker", this.field_talker);
      }
      if (this.field_content == null) {
        this.field_content = "";
      }
      if (this.cjN) {
        ((ContentValues)localObject).put("content", this.field_content);
      }
      if (this.cpM) {
        ((ContentValues)localObject).put("imgPath", this.field_imgPath);
      }
      if (this.cpN) {
        ((ContentValues)localObject).put("lvbuffer", this.field_lvbuffer);
      }
      if (this.cpO) {
        ((ContentValues)localObject).put("talkerId", Integer.valueOf(this.field_talkerId));
      }
      if (this.cpP) {
        ((ContentValues)localObject).put("isExpand", Boolean.valueOf(this.field_isExpand));
      }
      if (this.cpQ) {
        ((ContentValues)localObject).put("orderFlag", Long.valueOf(this.field_orderFlag));
      }
      if (this.cpR) {
        ((ContentValues)localObject).put("hasShow", Integer.valueOf(this.field_hasShow));
      }
      if (this.sKx > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.sKx));
      }
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseBizTimeLineInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */