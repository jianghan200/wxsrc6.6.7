package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Arrays;

public final class f
  extends a
{
  private String cgA = "";
  private String cgB = "";
  private String cgD = "";
  private long cgE = 0L;
  private long cgF = 0L;
  private String cgN = "";
  private String cgR = "";
  private String cgx = "";
  private String cgy = "";
  private long chE = 0L;
  private long chF = 0L;
  private int chG = 0;
  private long chH = 0L;
  private long chI = 0L;
  
  public f() {}
  
  public f(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 14) {
          break label264;
        }
        String[] arrayOfString = new String[14];
        Arrays.fill(arrayOfString, 0, 14, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label264:
    for (;;)
    {
      this.cgE = bi.getLong(paramString[0], 0L);
      this.cgF = bi.getLong(paramString[1], 0L);
      this.chE = bi.getLong(paramString[2], 0L);
      this.cgD = paramString[3];
      this.chF = bi.getLong(paramString[4], 0L);
      this.chG = bi.getInt(paramString[5], 0);
      this.chH = bi.getLong(paramString[6], 0L);
      this.cgN = paramString[7];
      this.cgx = paramString[8];
      this.cgy = paramString[9];
      this.chI = bi.getLong(paramString[10], 0L);
      this.cgA = paramString[11];
      this.cgB = paramString[12];
      this.cgR = paramString[13];
      return;
    }
  }
  
  public final int getId()
  {
    return 14499;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cgE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chI);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgR);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("DownloadStartTime:").append(this.cgE);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadEndTime:").append(this.cgF);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadSize:").append(this.chE);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NewMd5:").append(this.cgD);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MsgType:").append(this.chF);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadSpeed:").append(this.chG);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("HadFinishSize:").append(this.chH);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CDNIp:").append(this.cgN);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FromUser:").append(this.cgx);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Session:").append(this.cgy);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ChatroomNum:").append(this.chI);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FileId:").append(this.cgA);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("SnsUrl:").append(this.cgB);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Publishid:").append(this.cgR);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */