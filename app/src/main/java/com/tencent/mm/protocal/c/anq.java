package com.tencent.mm.protocal.c;

public final class anq
  extends com.tencent.mm.bk.a
{
  public int key;
  public int length;
  public long rQr;
  public int rQs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.key);
      paramVarArgs.T(2, this.rQr);
      paramVarArgs.fT(3, this.length);
      paramVarArgs.fT(4, this.rQs);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.key) + 0 + f.a.a.a.S(2, this.rQr) + f.a.a.a.fQ(3, this.length) + f.a.a.a.fQ(4, this.rQs);
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
      anq localanq = (anq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localanq.key = locala.vHC.rY();
        return 0;
      case 2: 
        localanq.rQr = locala.vHC.rZ();
        return 0;
      case 3: 
        localanq.length = locala.vHC.rY();
        return 0;
      }
      localanq.rQs = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/anq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */