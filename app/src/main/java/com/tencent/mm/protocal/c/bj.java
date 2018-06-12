package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class bj
  extends com.tencent.mm.bk.a
{
  public int rbJ;
  public b rbK;
  public long rbL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rbJ);
      if (this.rbK != null) {
        paramVarArgs.b(2, this.rbK);
      }
      paramVarArgs.T(3, this.rbL);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rbJ) + 0;
      paramInt = i;
      if (this.rbK != null) {
        paramInt = i + f.a.a.a.a(2, this.rbK);
      }
      return paramInt + f.a.a.a.S(3, this.rbL);
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
      bj localbj = (bj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbj.rbJ = locala.vHC.rY();
        return 0;
      case 2: 
        localbj.rbK = locala.cJR();
        return 0;
      }
      localbj.rbL = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */