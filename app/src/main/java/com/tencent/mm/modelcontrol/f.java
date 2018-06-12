package com.tencent.mm.modelcontrol;

public final class f
  implements Comparable
{
  public int dQL;
  public int dQM;
  public int dQN;
  public int dQO;
  public int dQP;
  public int dQQ;
  public int dQR;
  
  public f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.dQL = paramInt1;
    this.dQM = paramInt2;
    this.dQN = paramInt3;
    this.dQO = paramInt4;
    this.dQP = paramInt5;
    this.dQQ = paramInt6;
    this.dQR = paramInt7;
  }
  
  public final int compareTo(Object paramObject)
  {
    if (paramObject == null) {}
    while (!(paramObject instanceof f)) {
      return 0;
    }
    paramObject = (f)paramObject;
    return this.dQL - ((f)paramObject).dQL;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelcontrol/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */