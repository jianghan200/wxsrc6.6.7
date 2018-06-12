package com.tencent.mm.protocal.c;

public final class atc
  extends com.tencent.mm.bk.a
{
  public int jSO;
  public int rVA;
  public int rdq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rdq);
      paramVarArgs.fT(2, this.jSO);
      paramVarArgs.fT(3, this.rVA);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rdq) + 0 + f.a.a.a.fQ(2, this.jSO) + f.a.a.a.fQ(3, this.rVA);
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
      atc localatc = (atc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localatc.rdq = locala.vHC.rY();
        return 0;
      case 2: 
        localatc.jSO = locala.vHC.rY();
        return 0;
      }
      localatc.rVA = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/atc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */