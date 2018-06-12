package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class am
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckj;
  private static final int cli;
  private static final int cnK;
  private static final int cnO;
  private static final int cnP;
  private static final int cnQ;
  private static final int cnR;
  private static final int cnT;
  private static final int cnU;
  private static final int cnV = "msgCount".hashCode();
  private static final int cnk;
  private static final int ctJ;
  private static final int ctK;
  private static final int ctL;
  private static final int ctM;
  private static final int ctN;
  private static final int ctO;
  private static final int ctP;
  private static final int ctQ;
  private static final int ctR;
  private static final int ctS;
  private static final int ctT;
  private static final int ctU;
  private static final int ctV;
  private boolean ciS = false;
  private boolean cjN = false;
  private boolean clg = false;
  private boolean cnA = false;
  private boolean cnB = false;
  private boolean cnC = false;
  private boolean cnD = false;
  private boolean cnF = false;
  private boolean cnG = false;
  private boolean cnH = false;
  private boolean cni = false;
  private boolean cnw = false;
  private boolean ctA = false;
  private boolean ctB = false;
  private boolean ctC = false;
  public boolean ctD = false;
  private boolean ctE = false;
  private boolean ctF = false;
  private boolean ctG = false;
  private boolean ctH = false;
  private boolean ctI = false;
  private boolean ctv = false;
  private boolean ctw = false;
  private boolean cty = false;
  public boolean ctz = false;
  public int field_UnDeliverCount;
  public int field_UnReadInvite;
  public int field_atCount;
  public int field_attrflag;
  public int field_chatmode;
  public String field_content;
  public long field_conversationTime;
  private String field_customNotify;
  public String field_digest;
  public String field_digestUser;
  public String field_editingMsg;
  public long field_firstUnDeliverSeq;
  public long field_flag;
  private int field_hasTrunc;
  public int field_isSend;
  public long field_lastSeq;
  public int field_msgCount;
  public String field_msgType;
  public String field_parentRef;
  public int field_showTips;
  public long field_sightTime;
  public int field_status;
  public int field_unReadCount;
  public int field_unReadMuteCount;
  public String field_username;
  
  static
  {
    cli = "username".hashCode();
    cnK = "unReadCount".hashCode();
    ctJ = "chatmode".hashCode();
    ciV = "status".hashCode();
    cnT = "isSend".hashCode();
    ctK = "conversationTime".hashCode();
    ckj = "content".hashCode();
    cnU = "msgType".hashCode();
    ctL = "customNotify".hashCode();
    ctM = "showTips".hashCode();
    cnk = "flag".hashCode();
    cnO = "digest".hashCode();
    cnP = "digestUser".hashCode();
    ctN = "hasTrunc".hashCode();
    ctO = "parentRef".hashCode();
    ctP = "attrflag".hashCode();
    cnR = "editingMsg".hashCode();
    cnQ = "atCount".hashCode();
    ctQ = "sightTime".hashCode();
    ctR = "unReadMuteCount".hashCode();
    ctS = "lastSeq".hashCode();
    ctT = "UnDeliverCount".hashCode();
    ctU = "UnReadInvite".hashCode();
    ctV = "firstUnDeliverSeq".hashCode();
  }
  
  public final void as(long paramLong)
  {
    this.field_conversationTime = paramLong;
    this.ctw = true;
  }
  
  public final void at(long paramLong)
  {
    this.field_flag = paramLong;
    this.cni = true;
  }
  
  public final void au(long paramLong)
  {
    this.field_lastSeq = paramLong;
    this.ctF = true;
  }
  
  public final void av(long paramLong)
  {
    this.field_firstUnDeliverSeq = paramLong;
    this.ctI = true;
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
      if (cnV != k) {
        break label60;
      }
      this.field_msgCount = paramCursor.getInt(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cli == k)
      {
        this.field_username = paramCursor.getString(i);
        this.clg = true;
      }
      else if (cnK == k)
      {
        this.field_unReadCount = paramCursor.getInt(i);
      }
      else if (ctJ == k)
      {
        this.field_chatmode = paramCursor.getInt(i);
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getInt(i);
      }
      else if (cnT == k)
      {
        this.field_isSend = paramCursor.getInt(i);
      }
      else if (ctK == k)
      {
        this.field_conversationTime = paramCursor.getLong(i);
      }
      else if (ckj == k)
      {
        this.field_content = paramCursor.getString(i);
      }
      else if (cnU == k)
      {
        this.field_msgType = paramCursor.getString(i);
      }
      else if (ctL == k)
      {
        this.field_customNotify = paramCursor.getString(i);
      }
      else if (ctM == k)
      {
        this.field_showTips = paramCursor.getInt(i);
      }
      else if (cnk == k)
      {
        this.field_flag = paramCursor.getLong(i);
      }
      else if (cnO == k)
      {
        this.field_digest = paramCursor.getString(i);
      }
      else if (cnP == k)
      {
        this.field_digestUser = paramCursor.getString(i);
      }
      else if (ctN == k)
      {
        this.field_hasTrunc = paramCursor.getInt(i);
      }
      else if (ctO == k)
      {
        this.field_parentRef = paramCursor.getString(i);
      }
      else if (ctP == k)
      {
        this.field_attrflag = paramCursor.getInt(i);
      }
      else if (cnR == k)
      {
        this.field_editingMsg = paramCursor.getString(i);
      }
      else if (cnQ == k)
      {
        this.field_atCount = paramCursor.getInt(i);
      }
      else if (ctQ == k)
      {
        this.field_sightTime = paramCursor.getLong(i);
      }
      else if (ctR == k)
      {
        this.field_unReadMuteCount = paramCursor.getInt(i);
      }
      else if (ctS == k)
      {
        this.field_lastSeq = paramCursor.getLong(i);
      }
      else if (ctT == k)
      {
        this.field_UnDeliverCount = paramCursor.getInt(i);
      }
      else if (ctU == k)
      {
        this.field_UnReadInvite = paramCursor.getInt(i);
      }
      else if (ctV == k)
      {
        this.field_firstUnDeliverSeq = paramCursor.getLong(i);
      }
      else if (ciP == k)
      {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final void eU(int paramInt)
  {
    this.field_msgCount = paramInt;
    this.cnH = true;
  }
  
  public final void eV(int paramInt)
  {
    this.field_unReadCount = paramInt;
    this.cnw = true;
  }
  
  public final void eW(int paramInt)
  {
    this.field_chatmode = paramInt;
    this.ctv = true;
  }
  
  public final void eX(int paramInt)
  {
    this.field_isSend = paramInt;
    this.cnF = true;
  }
  
  public final void eY(int paramInt)
  {
    this.field_hasTrunc = paramInt;
    this.ctA = true;
  }
  
  public final void eZ(int paramInt)
  {
    this.field_attrflag = paramInt;
    this.ctC = true;
  }
  
  public final void ec(String paramString)
  {
    this.field_msgType = paramString;
    this.cnG = true;
  }
  
  public final void ed(String paramString)
  {
    this.field_digest = paramString;
    this.cnA = true;
  }
  
  public final void ee(String paramString)
  {
    this.field_digestUser = paramString;
    this.cnB = true;
  }
  
  public final void ef(String paramString)
  {
    this.field_parentRef = paramString;
    this.ctB = true;
  }
  
  public final void eg(String paramString)
  {
    this.field_editingMsg = paramString;
    this.cnD = true;
  }
  
  public final void fa(int paramInt)
  {
    this.field_atCount = paramInt;
    this.cnC = true;
  }
  
  public final void fb(int paramInt)
  {
    this.field_unReadMuteCount = paramInt;
    this.ctE = true;
  }
  
  public final void fc(int paramInt)
  {
    this.field_UnDeliverCount = paramInt;
    this.ctG = true;
  }
  
  public final void fd(int paramInt)
  {
    this.field_UnReadInvite = paramInt;
    this.ctH = true;
  }
  
  public final String getUsername()
  {
    return this.field_username;
  }
  
  public final void setContent(String paramString)
  {
    this.field_content = paramString;
    this.cjN = true;
  }
  
  public final void setStatus(int paramInt)
  {
    this.field_status = paramInt;
    this.ciS = true;
  }
  
  public final void setUsername(String paramString)
  {
    this.field_username = paramString;
    this.clg = true;
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cnH) {
      localContentValues.put("msgCount", Integer.valueOf(this.field_msgCount));
    }
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cnw) {
      localContentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
    }
    if (this.ctv) {
      localContentValues.put("chatmode", Integer.valueOf(this.field_chatmode));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cnF) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.ctw) {
      localContentValues.put("conversationTime", Long.valueOf(this.field_conversationTime));
    }
    if (this.field_content == null) {
      this.field_content = "";
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_msgType == null) {
      this.field_msgType = "";
    }
    if (this.cnG) {
      localContentValues.put("msgType", this.field_msgType);
    }
    if (this.field_customNotify == null) {
      this.field_customNotify = "";
    }
    if (this.cty) {
      localContentValues.put("customNotify", this.field_customNotify);
    }
    if (this.ctz) {
      localContentValues.put("showTips", Integer.valueOf(this.field_showTips));
    }
    if (this.cni) {
      localContentValues.put("flag", Long.valueOf(this.field_flag));
    }
    if (this.field_digest == null) {
      this.field_digest = "";
    }
    if (this.cnA) {
      localContentValues.put("digest", this.field_digest);
    }
    if (this.field_digestUser == null) {
      this.field_digestUser = "";
    }
    if (this.cnB) {
      localContentValues.put("digestUser", this.field_digestUser);
    }
    if (this.ctA) {
      localContentValues.put("hasTrunc", Integer.valueOf(this.field_hasTrunc));
    }
    if (this.ctB) {
      localContentValues.put("parentRef", this.field_parentRef);
    }
    if (this.ctC) {
      localContentValues.put("attrflag", Integer.valueOf(this.field_attrflag));
    }
    if (this.field_editingMsg == null) {
      this.field_editingMsg = "";
    }
    if (this.cnD) {
      localContentValues.put("editingMsg", this.field_editingMsg);
    }
    if (this.cnC) {
      localContentValues.put("atCount", Integer.valueOf(this.field_atCount));
    }
    if (this.ctD) {
      localContentValues.put("sightTime", Long.valueOf(this.field_sightTime));
    }
    if (this.ctE) {
      localContentValues.put("unReadMuteCount", Integer.valueOf(this.field_unReadMuteCount));
    }
    if (this.ctF) {
      localContentValues.put("lastSeq", Long.valueOf(this.field_lastSeq));
    }
    if (this.ctG) {
      localContentValues.put("UnDeliverCount", Integer.valueOf(this.field_UnDeliverCount));
    }
    if (this.ctH) {
      localContentValues.put("UnReadInvite", Integer.valueOf(this.field_UnReadInvite));
    }
    if (this.ctI) {
      localContentValues.put("firstUnDeliverSeq", Long.valueOf(this.field_firstUnDeliverSeq));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
  
  public final long wT()
  {
    return this.field_lastSeq;
  }
  
  public final int wU()
  {
    return this.field_UnDeliverCount;
  }
  
  public final long wV()
  {
    return this.field_firstUnDeliverSeq;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */