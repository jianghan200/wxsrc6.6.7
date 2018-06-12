package com.tencent.mm.protocal.c;

public final class cfd
  extends com.tencent.mm.bk.a
{
  public int szK;
  public long szL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.szK);
      paramVarArgs.T(2, this.szL);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.szK) + 0 + f.a.a.a.S(2, this.szL);
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
      cfd localcfd = (cfd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcfd.szK = locala.vHC.rY();
        return 0;
      }
      localcfd.szL = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */