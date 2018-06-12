package com.tencent.mm.protocal.c;

public final class alw
  extends com.tencent.mm.bk.a
{
  public long rOp;
  public int rOq;
  public long rOr;
  public int rOs;
  public long rOt;
  public int rOu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.rOp);
      paramVarArgs.fT(2, this.rOq);
      paramVarArgs.T(3, this.rOr);
      paramVarArgs.fT(4, this.rOs);
      paramVarArgs.T(5, this.rOt);
      paramVarArgs.fT(6, this.rOu);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.rOp) + 0 + f.a.a.a.fQ(2, this.rOq) + f.a.a.a.S(3, this.rOr) + f.a.a.a.fQ(4, this.rOs) + f.a.a.a.S(5, this.rOt) + f.a.a.a.fQ(6, this.rOu);
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
      alw localalw = (alw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localalw.rOp = locala.vHC.rZ();
        return 0;
      case 2: 
        localalw.rOq = locala.vHC.rY();
        return 0;
      case 3: 
        localalw.rOr = locala.vHC.rZ();
        return 0;
      case 4: 
        localalw.rOs = locala.vHC.rY();
        return 0;
      case 5: 
        localalw.rOt = locala.vHC.rZ();
        return 0;
      }
      localalw.rOu = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/alw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */