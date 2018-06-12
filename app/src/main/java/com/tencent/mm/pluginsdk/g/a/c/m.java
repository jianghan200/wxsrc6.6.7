package com.tencent.mm.pluginsdk.g.a.c;

public final class m
{
  public final String aBC;
  public final long cfA;
  public final String filePath;
  final String groupId;
  public final int httpStatusCode;
  public final String qBy;
  public final Exception qDk;
  public final int status;
  private final String url;
  
  public m(e parame, long paramLong, String paramString)
  {
    this(parame.aca(), parame.cco(), parame.getURL(), parame.getFilePath(), paramLong, paramString, 2, null, -1);
  }
  
  public m(e parame, Exception paramException, int paramInt)
  {
    this(parame, paramException, -1, paramInt);
  }
  
  public m(e parame, Exception paramException, int paramInt1, int paramInt2)
  {
    this(parame.aca(), parame.cco(), parame.getURL(), parame.getFilePath(), -1L, null, paramInt2, paramException, paramInt1);
  }
  
  public m(l paraml, long paramLong)
  {
    this(paraml.aca(), paraml.qBy, paraml.url, paraml.getFilePath(), paramLong, null, 2, null, -1);
  }
  
  private m(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, int paramInt1, Exception paramException, int paramInt2)
  {
    this.groupId = paramString1;
    this.qBy = paramString2;
    this.url = paramString3;
    this.filePath = paramString4;
    this.cfA = paramLong;
    this.aBC = paramString5;
    this.status = paramInt1;
    this.qDk = paramException;
    this.httpStatusCode = paramInt2;
  }
  
  public m(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, Exception paramException)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramLong, paramString5, 3, paramException, -1);
  }
  
  public final String toString()
  {
    return "NetworkResponse{urlKey='" + this.qBy + '\'' + ", url='" + this.url + '\'' + ", filePath='" + this.filePath + '\'' + ", contentLength=" + this.cfA + ", contentType='" + this.aBC + '\'' + ", status=" + this.status + ", e=" + this.qDk + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */