package com.tencent.mm.ar;

public final class g
  extends com.tencent.mm.bk.a
{
  public int ecA;
  public int ecL;
  public int ecM;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.ecA);
      paramVarArgs.fT(2, this.ecL);
      paramVarArgs.fT(3, this.ecM);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.ecA) + 0 + f.a.a.a.fQ(2, this.ecL) + f.a.a.a.fQ(3, this.ecM);
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
      g localg = (g)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localg.ecA = locala.vHC.rY();
        return 0;
      case 2: 
        localg.ecL = locala.vHC.rY();
        return 0;
      }
      localg.ecM = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ar/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */