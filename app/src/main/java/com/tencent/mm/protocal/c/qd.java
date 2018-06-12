package com.tencent.mm.protocal.c;

public final class qd
  extends com.tencent.mm.bk.a
{
  public int hcd;
  public int rci;
  public long rcq;
  public String ruD;
  public int ruE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rci);
      if (this.ruD != null) {
        paramVarArgs.g(2, this.ruD);
      }
      paramVarArgs.fT(3, this.hcd);
      paramVarArgs.fT(4, this.ruE);
      paramVarArgs.T(5, this.rcq);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rci) + 0;
      paramInt = i;
      if (this.ruD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ruD);
      }
      return paramInt + f.a.a.a.fQ(3, this.hcd) + f.a.a.a.fQ(4, this.ruE) + f.a.a.a.S(5, this.rcq);
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
      qd localqd = (qd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localqd.rci = locala.vHC.rY();
        return 0;
      case 2: 
        localqd.ruD = locala.vHC.readString();
        return 0;
      case 3: 
        localqd.hcd = locala.vHC.rY();
        return 0;
      case 4: 
        localqd.ruE = locala.vHC.rY();
        return 0;
      }
      localqd.rcq = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */