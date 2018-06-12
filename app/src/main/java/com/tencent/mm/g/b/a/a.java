package com.tencent.mm.g.b.a;

public final class a
  extends com.tencent.mm.plugin.report.a
{
  public String cgb = "";
  public String cgc = "";
  public int cgd = 0;
  
  public final int getId()
  {
    return 15459;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cgb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgd);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ChatroomName:").append(this.cgb);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ExptScore:").append(this.cgc);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ExptFlag:").append(this.cgd);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */