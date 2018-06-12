package com.tencent.mm.protocal.c;

public final class aqg
  extends com.tencent.mm.bk.a
{
  public int rDF;
  public int rSI;
  public String rSJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rSI);
      if (this.rSJ != null) {
        paramVarArgs.g(2, this.rSJ);
      }
      paramVarArgs.fT(3, this.rDF);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rSI) + 0;
      paramInt = i;
      if (this.rSJ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rSJ);
      }
      return paramInt + f.a.a.a.fQ(3, this.rDF);
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
      aqg localaqg = (aqg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localaqg.rSI = locala.vHC.rY();
        return 0;
      case 2: 
        localaqg.rSJ = locala.vHC.readString();
        return 0;
      }
      localaqg.rDF = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */