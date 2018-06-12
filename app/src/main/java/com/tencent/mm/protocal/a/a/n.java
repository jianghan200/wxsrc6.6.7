package com.tencent.mm.protocal.a.a;

public final class n
  extends com.tencent.mm.bk.a
{
  public int qXP;
  public int qXQ;
  public int qXR;
  public int qXS;
  public int qXT;
  public int qXU;
  public int qXg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qXg);
      paramVarArgs.fT(2, this.qXP);
      paramVarArgs.fT(3, this.qXQ);
      paramVarArgs.fT(4, this.qXR);
      paramVarArgs.fT(5, this.qXS);
      paramVarArgs.fT(6, this.qXT);
      paramVarArgs.fT(7, this.qXU);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.qXg) + 0 + f.a.a.a.fQ(2, this.qXP) + f.a.a.a.fQ(3, this.qXQ) + f.a.a.a.fQ(4, this.qXR) + f.a.a.a.fQ(5, this.qXS) + f.a.a.a.fQ(6, this.qXT) + f.a.a.a.fQ(7, this.qXU);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      n localn = (n)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localn.qXg = locala.vHC.rY();
        return 0;
      case 2: 
        localn.qXP = locala.vHC.rY();
        return 0;
      case 3: 
        localn.qXQ = locala.vHC.rY();
        return 0;
      case 4: 
        localn.qXR = locala.vHC.rY();
        return 0;
      case 5: 
        localn.qXS = locala.vHC.rY();
        return 0;
      case 6: 
        localn.qXT = locala.vHC.rY();
        return 0;
      }
      localn.qXU = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/a/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */