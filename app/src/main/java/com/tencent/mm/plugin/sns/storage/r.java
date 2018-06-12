package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.plugin.sns.data.i;

public final class r
{
  long createTime;
  private int eJD;
  private long nJG;
  public int nJH;
  public String nJI;
  private int nJJ;
  private long nJK;
  public String nJL;
  public byte[] nJM;
  public int nJc;
  public int offset;
  public int type;
  private String userName;
  
  public final ContentValues bBA()
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("seqId", Long.valueOf(this.nJG));
    localContentValues.put("type", Integer.valueOf(this.type));
    localContentValues.put("createTime", Long.valueOf(this.createTime));
    localContentValues.put("userName", this.userName);
    localContentValues.put("totallen", Integer.valueOf(this.nJH));
    localContentValues.put("offset", Integer.valueOf(this.offset));
    localContentValues.put("local_flag", Integer.valueOf(this.eJD));
    localContentValues.put("tmp_path", this.nJI);
    localContentValues.put("nums", Integer.valueOf(this.nJJ));
    localContentValues.put("try_times", Long.valueOf(this.nJK));
    localContentValues.put("StrId", this.nJL);
    localContentValues.put("upload_buf", this.nJM);
    return localContentValues;
  }
  
  public final void bBB()
  {
    this.eJD |= 0x4;
  }
  
  public final void bBC()
  {
    this.eJD &= 0xFFFFFFFB;
  }
  
  public final void d(Cursor paramCursor)
  {
    this.nJc = paramCursor.getInt(0);
    long l = paramCursor.getLong(1);
    this.nJG = l;
    this.nJL = i.eF(l);
    this.type = paramCursor.getInt(2);
    this.createTime = paramCursor.getLong(3);
    this.userName = paramCursor.getString(4);
    this.nJH = paramCursor.getInt(5);
    this.offset = paramCursor.getInt(6);
    this.eJD = paramCursor.getInt(7);
    this.nJI = paramCursor.getString(8);
    this.nJJ = paramCursor.getInt(9);
    this.nJK = paramCursor.getLong(10);
    this.nJL = paramCursor.getString(11);
    this.nJM = paramCursor.getBlob(12);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */