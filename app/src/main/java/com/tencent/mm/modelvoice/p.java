package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;

public final class p
{
  public int bWA = -1;
  public String bWJ = "";
  public long bYu = 0L;
  public String clientId = "";
  int cqa = 0;
  String cqb = "";
  public long createTime = 0L;
  public int dHI = 0;
  int dYP = 0;
  public int emu = 0;
  public String enF = "";
  public int enH = 0;
  public long enK = 0L;
  public int enN = 0;
  int enO = 0;
  String eoB = "";
  int eoI = 0;
  public int epI = 0;
  long epJ = 0L;
  int epK = 0;
  public String fileName = "";
  public int status = 0;
  
  public final boolean TL()
  {
    return (this.status == 5) || (this.status == 6);
  }
  
  public final boolean TM()
  {
    return ((this.status > 1) && (this.status <= 3)) || (this.status == 8);
  }
  
  public final void d(Cursor paramCursor)
  {
    this.fileName = paramCursor.getString(0);
    this.bWJ = paramCursor.getString(1);
    this.bYu = paramCursor.getLong(2);
    this.emu = paramCursor.getInt(3);
    this.enH = paramCursor.getInt(4);
    this.dHI = paramCursor.getInt(5);
    this.status = paramCursor.getInt(6);
    this.createTime = paramCursor.getLong(7);
    this.enK = paramCursor.getLong(8);
    this.clientId = paramCursor.getString(9);
    this.epI = paramCursor.getInt(10);
    this.enN = paramCursor.getInt(11);
    this.enF = paramCursor.getString(12);
    this.enO = paramCursor.getInt(13);
    this.eoB = paramCursor.getString(14);
    this.cqb = paramCursor.getString(15);
    this.cqa = paramCursor.getInt(16);
    this.dYP = paramCursor.getInt(17);
    this.epJ = paramCursor.getLong(18);
    this.epK = paramCursor.getInt(19);
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("FileName", this.fileName);
    }
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("User", this.bWJ);
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("MsgId", Long.valueOf(this.bYu));
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("NetOffset", Integer.valueOf(this.emu));
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("FileNowSize", Integer.valueOf(this.enH));
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("TotalLen", Integer.valueOf(this.dHI));
    }
    if ((this.bWA & 0x40) != 0) {
      localContentValues.put("Status", Integer.valueOf(this.status));
    }
    if ((this.bWA & 0x80) != 0) {
      localContentValues.put("CreateTime", Long.valueOf(this.createTime));
    }
    if ((this.bWA & 0x100) != 0) {
      localContentValues.put("LastModifyTime", Long.valueOf(this.enK));
    }
    if ((this.bWA & 0x200) != 0) {
      localContentValues.put("ClientId", this.clientId);
    }
    if ((this.bWA & 0x400) != 0) {
      localContentValues.put("VoiceLength", Integer.valueOf(this.epI));
    }
    if ((this.bWA & 0x800) != 0) {
      localContentValues.put("MsgLocalId", Integer.valueOf(this.enN));
    }
    if ((this.bWA & 0x1000) != 0) {
      localContentValues.put("Human", this.enF);
    }
    if ((this.bWA & 0x2000) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.enO));
    }
    if ((this.bWA & 0x4000) != 0) {
      localContentValues.put("reserved2", this.eoB);
    }
    if ((this.bWA & 0x8000) != 0) {
      localContentValues.put("MsgSource", this.cqb);
    }
    if ((this.bWA & 0x10000) != 0) {
      localContentValues.put("MsgFlag", Integer.valueOf(this.cqa));
    }
    if ((this.bWA & 0x20000) != 0) {
      localContentValues.put("MsgSeq", Integer.valueOf(this.dYP));
    }
    if ((this.bWA & 0x40000) != 0) {
      localContentValues.put("MasterBufId", Long.valueOf(this.epJ));
    }
    if ((this.bWA & 0x80000) != 0) {
      localContentValues.put("checksum", Integer.valueOf(this.epK));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvoice/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */