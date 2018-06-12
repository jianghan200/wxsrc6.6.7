package com.tencent.mm.pluginsdk.g.a.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class l
  implements f.b
{
  private final String filePath;
  protected volatile int gDm = 15000;
  private final String groupId;
  private final String method;
  final int networkType;
  final int priority;
  final int qBI;
  public final String qBy;
  private final String qCR;
  protected final Map<String, String> qDh = new HashMap();
  protected volatile int qDi = 20000;
  protected volatile int qDj = 15000;
  public final String url;
  
  public l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, int paramInt2, int paramInt3)
  {
    this.qBy = paramString1;
    this.filePath = paramString2;
    this.qCR = paramString3;
    this.groupId = paramString4;
    this.url = paramString5;
    this.method = paramString6;
    this.qBI = paramInt1;
    this.networkType = paramInt2;
    this.priority = Math.max(paramInt3, 0);
  }
  
  public String aca()
  {
    return this.groupId;
  }
  
  public final int ccD()
  {
    return this.qDj;
  }
  
  public final String cco()
  {
    return this.qBy;
  }
  
  public boolean ccs()
  {
    return false;
  }
  
  public final int getConnectTimeout()
  {
    return this.gDm;
  }
  
  public String getFilePath()
  {
    return this.filePath;
  }
  
  public final int getReadTimeout()
  {
    return this.qDi;
  }
  
  public final Map<String, String> getRequestHeaders()
  {
    if (this.qDh.size() == 0) {
      return null;
    }
    return Collections.unmodifiableMap(this.qDh);
  }
  
  public final void setConnectTimeout(int paramInt)
  {
    this.gDm = paramInt;
  }
  
  public final void setReadTimeout(int paramInt)
  {
    this.qDi = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */