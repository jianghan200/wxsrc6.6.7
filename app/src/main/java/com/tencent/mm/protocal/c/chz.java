package com.tencent.mm.protocal.c;

public final class chz
  extends com.tencent.mm.bk.a
{
  public int sBV;
  public boolean sBW;
  public boolean sBX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sBV);
      paramVarArgs.av(2, this.sBW);
      paramVarArgs.av(3, this.sBX);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.sBV) + 0 + (f.a.a.b.b.a.ec(2) + 1) + (f.a.a.b.b.a.ec(3) + 1);
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
      chz localchz = (chz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localchz.sBV = locala.vHC.rY();
        return 0;
      case 2: 
        localchz.sBW = locala.cJQ();
        return 0;
      }
      localchz.sBX = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/chz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */