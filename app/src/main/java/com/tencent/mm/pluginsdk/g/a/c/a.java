package com.tencent.mm.pluginsdk.g.a.c;

public abstract class a
{
  public final String bKg;
  private volatile int ecw;
  private final long eiD;
  private final String filePath;
  public final int networkType;
  public final int priority;
  public final int qBI;
  public final String qBy;
  public final String qCR;
  private final String qCS;
  private final String qCT;
  protected volatile int status = 0;
  public final String url;
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, long paramLong, String paramString5, String paramString6, String paramString7, int paramInt3)
  {
    this.url = paramString1;
    this.qBy = paramString2;
    this.qCR = paramString3;
    this.networkType = paramInt1;
    this.qBI = paramInt2;
    this.ecw = this.qBI;
    this.filePath = paramString4;
    this.eiD = paramLong;
    this.qCS = paramString6;
    this.qCT = paramString7;
    this.bKg = paramString5;
    this.priority = paramInt3;
  }
  
  public int Th(String paramString)
  {
    return 0;
  }
  
  public s cct()
  {
    s locals = new s();
    locals.field_url = this.url;
    locals.field_urlKey = this.qBy;
    locals.field_fileVersion = this.qCR;
    locals.field_networkType = this.networkType;
    locals.field_maxRetryTimes = this.qBI;
    locals.field_retryTimes = this.ecw;
    locals.field_filePath = this.filePath;
    locals.field_status = this.status;
    locals.field_expireTime = this.eiD;
    locals.field_groupId1 = this.qCS;
    locals.field_groupId2 = this.qCT;
    locals.field_md5 = this.bKg;
    locals.field_priority = this.priority;
    return locals;
  }
  
  public String toString()
  {
    return "BaseResDownloadRequest | urlKey='" + this.qBy + '\'' + ", networkType=" + this.networkType + ", expireTime=" + this.eiD + ", fileVersion=" + this.qCR + ", maxRetryTimes=" + this.qBI + ", md5='" + this.bKg + '\'' + ", groupId1='" + this.qCS + '\'' + ", groupId2='" + this.qCT + '\'' + ", filePath='" + this.filePath + '\'' + ", retryTimes=" + this.ecw + ", status=" + this.status + ", priority=" + this.priority;
  }
  
  public static abstract class a<T extends a>
  {
    public String bKg;
    public long eiD;
    public int networkType;
    public int priority;
    public int qBI;
    public String qBy;
    public final String url;
    
    public a(String paramString)
    {
      this.url = paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */