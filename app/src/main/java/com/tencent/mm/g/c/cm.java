package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public abstract class cm
  extends c
{
  private static final int cBM;
  private static final int cGA;
  private static final int cGv;
  private static final int cGw;
  private static final int cGx;
  private static final int cGy;
  private static final int cGz;
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckb;
  private static final int cke;
  private static final int ckj;
  private static final int cnI;
  private static final int cnT;
  private static final int cnk;
  private static final int cpS = "msgSvrId".hashCode();
  private static final int cpT;
  private static final int cpU;
  private static final int cpV;
  private static final int cpW;
  private String bZN;
  private boolean cBG = false;
  public String cGB;
  public int cGC;
  public int cGD;
  public int cGE;
  public int cGF;
  public int cGG;
  public int cGH;
  public String cGI;
  public String cGJ;
  public String cGK;
  public int cGL;
  public byte[] cGM;
  public boolean cGp = false;
  private boolean cGq = false;
  private boolean cGr = false;
  public boolean cGs = false;
  private boolean cGt = false;
  public boolean cGu = false;
  private boolean ciK = false;
  private boolean ciS = false;
  private boolean cjF = false;
  private boolean cjI = false;
  private boolean cjN = false;
  private boolean cnF = false;
  private boolean cni = false;
  private boolean cnu = false;
  private boolean cpK = false;
  private boolean cpL = false;
  private boolean cpM = false;
  public boolean cpN = false;
  public boolean cpO = false;
  public int cqa;
  public String cqb;
  public long field_bizChatId;
  public String field_bizChatUserId;
  private String field_bizClientMsgId;
  public String field_content;
  public long field_createTime;
  public int field_flag;
  public String field_imgPath;
  public int field_isSend;
  public int field_isShowTimer;
  public byte[] field_lvbuffer;
  public long field_msgId;
  public long field_msgSeq;
  public long field_msgSvrId;
  public String field_reserved;
  public int field_status;
  public String field_talker;
  public int field_talkerId;
  public String field_transBrandWording;
  public String field_transContent;
  private int field_type;
  
  static
  {
    cke = "type".hashCode();
    ciV = "status".hashCode();
    cnT = "isSend".hashCode();
    cGv = "isShowTimer".hashCode();
    ckb = "createTime".hashCode();
    cpT = "talker".hashCode();
    ckj = "content".hashCode();
    cpU = "imgPath".hashCode();
    cGw = "reserved".hashCode();
    cpV = "lvbuffer".hashCode();
    cpW = "talkerId".hashCode();
    cGx = "transContent".hashCode();
    cGy = "transBrandWording".hashCode();
    cGz = "bizClientMsgId".hashCode();
    cnI = "bizChatId".hashCode();
    cGA = "bizChatUserId".hashCode();
    cBM = "msgSeq".hashCode();
    cnk = "flag".hashCode();
  }
  
  public final void C(byte[] paramArrayOfByte)
  {
    this.field_lvbuffer = paramArrayOfByte;
    this.cpN = true;
  }
  
  public final void aA(long paramLong)
  {
    this.field_msgSeq = paramLong;
    this.cBG = true;
  }
  
  public final void ax(long paramLong)
  {
    this.field_msgSvrId = paramLong;
    this.cpK = true;
  }
  
  public final void ay(long paramLong)
  {
    this.field_createTime = paramLong;
    this.cjF = true;
  }
  
  public final void az(long paramLong)
  {
    this.field_bizChatId = paramLong;
    this.cnu = true;
  }
  
  public void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {}
    do
    {
      for (;;)
      {
        return;
        int i = 0;
        int j = arrayOfString.length;
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
            if (cpS == k) {
              this.field_msgSvrId = paramCursor.getLong(i);
            } else if (cke == k) {
              this.field_type = paramCursor.getInt(i);
            } else if (ciV == k) {
              this.field_status = paramCursor.getInt(i);
            } else if (cnT == k) {
              this.field_isSend = paramCursor.getInt(i);
            } else if (cGv == k) {
              this.field_isShowTimer = paramCursor.getInt(i);
            } else if (ckb == k) {
              this.field_createTime = paramCursor.getLong(i);
            } else if (cpT == k) {
              this.field_talker = paramCursor.getString(i);
            } else if (ckj == k) {
              this.field_content = paramCursor.getString(i);
            } else if (cpU == k) {
              this.field_imgPath = paramCursor.getString(i);
            } else if (cGw == k) {
              this.field_reserved = paramCursor.getString(i);
            } else if (cpV == k) {
              this.field_lvbuffer = paramCursor.getBlob(i);
            } else if (cpW == k) {
              this.field_talkerId = paramCursor.getInt(i);
            } else if (cGx == k) {
              this.field_transContent = paramCursor.getString(i);
            } else if (cGy == k) {
              this.field_transBrandWording = paramCursor.getString(i);
            } else if (cGz == k) {
              this.field_bizClientMsgId = paramCursor.getString(i);
            } else if (cnI == k) {
              this.field_bizChatId = paramCursor.getLong(i);
            } else if (cGA == k) {
              this.field_bizChatUserId = paramCursor.getString(i);
            } else if (cBM == k) {
              this.field_msgSeq = paramCursor.getLong(i);
            } else if (cnk == k) {
              this.field_flag = paramCursor.getInt(i);
            } else if (ciP == k) {
              this.sKx = paramCursor.getLong(i);
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
              x.e("MicroMsg.SDK.BaseMsgInfo", "parse LVBuffer error:" + i);
              return;
            }
          }
        }
        catch (Exception paramCursor)
        {
          x.e("MicroMsg.SDK.BaseMsgInfo", "get value failed");
          return;
        }
      }
      if (!paramCursor.chD()) {
        this.cGB = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cqa = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cqb = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cGC = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cGD = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cGE = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cGF = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cGG = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cGH = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.cGI = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cGJ = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cGK = paramCursor.getString();
      }
      if (!paramCursor.chD()) {
        this.cGL = paramCursor.getInt();
      }
      if (!paramCursor.chD()) {
        this.bZN = paramCursor.getString();
      }
    } while (paramCursor.chD());
    this.cGM = paramCursor.getBuffer();
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
  
  public final void eX(int paramInt)
  {
    this.field_isSend = paramInt;
    this.cnF = true;
  }
  
  public final void ep(String paramString)
  {
    this.field_talker = paramString;
    this.cpL = true;
  }
  
  public final void eq(String paramString)
  {
    this.field_imgPath = paramString;
    this.cpM = true;
  }
  
  public final void er(String paramString)
  {
    this.field_reserved = paramString;
    this.cGq = true;
  }
  
  public final void es(String paramString)
  {
    this.field_transContent = paramString;
    this.cGr = true;
  }
  
  public final void et(String paramString)
  {
    this.field_bizClientMsgId = paramString;
    this.cGt = true;
  }
  
  public final void eu(String paramString)
  {
    this.cGB = paramString;
    this.cpN = true;
  }
  
  public final void ev(String paramString)
  {
    this.cGJ = paramString;
    this.cpN = true;
  }
  
  public final void ew(String paramString)
  {
    this.cGK = paramString;
    this.cpN = true;
  }
  
  public final void fg(int paramInt)
  {
    this.field_flag = paramInt;
    this.cni = true;
  }
  
  public final void fh(int paramInt)
  {
    this.cGC = paramInt;
    this.cpN = true;
  }
  
  public final void fi(int paramInt)
  {
    this.cGD = paramInt;
    this.cpN = true;
  }
  
  public final void fj(int paramInt)
  {
    this.cGH = paramInt;
    this.cpN = true;
  }
  
  public final void fk(int paramInt)
  {
    this.cGL = paramInt;
    this.cpN = true;
  }
  
  public final String getContent()
  {
    return this.field_content;
  }
  
  public int getType()
  {
    return this.field_type;
  }
  
  public final void setContent(String paramString)
  {
    this.field_content = paramString;
    this.cjN = true;
  }
  
  public final void setMsgId(long paramLong)
  {
    this.field_msgId = paramLong;
    this.ciK = true;
  }
  
  public void setStatus(int paramInt)
  {
    this.field_status = paramInt;
    this.ciS = true;
  }
  
  public final void setType(int paramInt)
  {
    this.field_type = paramInt;
    this.cjI = true;
  }
  
  public ContentValues wH()
  {
    try
    {
      if (this.cpN)
      {
        localObject = new u();
        ((u)localObject).chE();
        ((u)localObject).Wj(this.cGB);
        ((u)localObject).CZ(this.cqa);
        ((u)localObject).Wj(this.cqb);
        ((u)localObject).CZ(this.cGC);
        ((u)localObject).CZ(this.cGD);
        ((u)localObject).CZ(this.cGE);
        ((u)localObject).CZ(this.cGF);
        ((u)localObject).CZ(this.cGG);
        ((u)localObject).CZ(this.cGH);
        ((u)localObject).Wj(this.cGI);
        ((u)localObject).Wj(this.cGJ);
        ((u)localObject).Wj(this.cGK);
        ((u)localObject).CZ(this.cGL);
        ((u)localObject).Wj(this.bZN);
        ((u)localObject).bz(this.cGM);
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
      if (this.cnF) {
        ((ContentValues)localObject).put("isSend", Integer.valueOf(this.field_isSend));
      }
      if (this.cGp) {
        ((ContentValues)localObject).put("isShowTimer", Integer.valueOf(this.field_isShowTimer));
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
      if (this.cGq) {
        ((ContentValues)localObject).put("reserved", this.field_reserved);
      }
      if (this.cpN) {
        ((ContentValues)localObject).put("lvbuffer", this.field_lvbuffer);
      }
      if (this.cpO) {
        ((ContentValues)localObject).put("talkerId", Integer.valueOf(this.field_talkerId));
      }
      if (this.field_transContent == null) {
        this.field_transContent = "";
      }
      if (this.cGr) {
        ((ContentValues)localObject).put("transContent", this.field_transContent);
      }
      if (this.field_transBrandWording == null) {
        this.field_transBrandWording = "";
      }
      if (this.cGs) {
        ((ContentValues)localObject).put("transBrandWording", this.field_transBrandWording);
      }
      if (this.field_bizClientMsgId == null) {
        this.field_bizClientMsgId = "";
      }
      if (this.cGt) {
        ((ContentValues)localObject).put("bizClientMsgId", this.field_bizClientMsgId);
      }
      if (this.cnu) {
        ((ContentValues)localObject).put("bizChatId", Long.valueOf(this.field_bizChatId));
      }
      if (this.field_bizChatUserId == null) {
        this.field_bizChatUserId = "";
      }
      if (this.cGu) {
        ((ContentValues)localObject).put("bizChatUserId", this.field_bizChatUserId);
      }
      if (this.cBG) {
        ((ContentValues)localObject).put("msgSeq", Long.valueOf(this.field_msgSeq));
      }
      if (this.cni) {
        ((ContentValues)localObject).put("flag", Integer.valueOf(this.field_flag));
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
        x.e("MicroMsg.SDK.BaseMsgInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public final long wW()
  {
    return this.field_msgSvrId;
  }
  
  public final int wX()
  {
    return this.field_isSend;
  }
  
  public final long wY()
  {
    return this.field_createTime;
  }
  
  public final String wZ()
  {
    return this.field_talker;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */