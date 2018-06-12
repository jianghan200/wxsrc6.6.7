package com.tencent.mm.protocal.c;

public final class cal
  extends com.tencent.mm.bk.a
{
  public int swR;
  public int swS;
  public int swT;
  public int swU;
  public int swV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.swR);
      paramVarArgs.fT(2, this.swS);
      paramVarArgs.fT(3, this.swT);
      paramVarArgs.fT(4, this.swU);
      paramVarArgs.fT(5, this.swV);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.swR) + 0 + f.a.a.a.fQ(2, this.swS) + f.a.a.a.fQ(3, this.swT) + f.a.a.a.fQ(4, this.swU) + f.a.a.a.fQ(5, this.swV);
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
      cal localcal = (cal)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcal.swR = locala.vHC.rY();
        return 0;
      case 2: 
        localcal.swS = locala.vHC.rY();
        return 0;
      case 3: 
        localcal.swT = locala.vHC.rY();
        return 0;
      case 4: 
        localcal.swU = locala.vHC.rY();
        return 0;
      }
      localcal.swV = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */