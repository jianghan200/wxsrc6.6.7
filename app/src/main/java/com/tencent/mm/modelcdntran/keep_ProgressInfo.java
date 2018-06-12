package com.tencent.mm.modelcdntran;

public class keep_ProgressInfo
{
  public int field_finishedLength;
  public boolean field_isUploadTask = false;
  public boolean field_mtlnotify;
  public int field_status;
  public int field_toltalLength;
  public String mediaId;
  
  public String toString()
  {
    return String.format("id:%s total:%d finLen:%d status:%d,mtl:%b, upload:%b", new Object[] { this.mediaId, Integer.valueOf(this.field_toltalLength), Integer.valueOf(this.field_finishedLength), Integer.valueOf(this.field_status), Boolean.valueOf(this.field_mtlnotify), Boolean.valueOf(this.field_isUploadTask) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelcdntran/keep_ProgressInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */