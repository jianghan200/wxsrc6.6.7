package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;

public final class c
  extends a
{
  public int cgm = 0;
  public int cgn = 0;
  public int cgo = 0;
  public String cgp;
  public String cgq;
  public String cgr;
  public String cgs;
  public String cgt;
  public String cgu;
  public String cgv;
  public String cgw;
  
  public final int getId()
  {
    return 15548;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cgm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgt);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgw);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("CgiCmd:").append(this.cgm);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ErrType:").append(this.cgn);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ErrCode:").append(this.cgo);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptKey:").append(this.cgp);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptUserinfo:").append(this.cgq);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptCellinfoLength:").append(this.cgr);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptCellinfo_01:").append(this.cgs);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptCellinfo_02:").append(this.cgt);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptCellinfo_03:").append(this.cgu);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptCellinfo_04:").append(this.cgv);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EncryptCellinfo_05:").append(this.cgw);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */