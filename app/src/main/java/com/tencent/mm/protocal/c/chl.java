package com.tencent.mm.protocal.c;

public final class chl
  extends com.tencent.mm.bk.a
{
  public int sBq;
  public int sBr;
  public int sBs;
  public int sBt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sBq);
      paramVarArgs.fT(2, this.sBr);
      paramVarArgs.fT(3, this.sBs);
      paramVarArgs.fT(4, this.sBt);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.sBq) + 0 + f.a.a.a.fQ(2, this.sBr) + f.a.a.a.fQ(3, this.sBs) + f.a.a.a.fQ(4, this.sBt);
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
      chl localchl = (chl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localchl.sBq = locala.vHC.rY();
        return 0;
      case 2: 
        localchl.sBr = locala.vHC.rY();
        return 0;
      case 3: 
        localchl.sBs = locala.vHC.rY();
        return 0;
      }
      localchl.sBt = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/chl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */