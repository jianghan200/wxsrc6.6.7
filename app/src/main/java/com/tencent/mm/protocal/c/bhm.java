package com.tencent.mm.protocal.c;

public final class bhm
  extends com.tencent.mm.bk.a
{
  public int qCh;
  public int sdX;
  public int sip;
  public int sir;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sdX);
      paramVarArgs.fT(2, this.sir);
      paramVarArgs.fT(3, this.sip);
      paramVarArgs.fT(4, this.qCh);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.sdX) + 0 + f.a.a.a.fQ(2, this.sir) + f.a.a.a.fQ(3, this.sip) + f.a.a.a.fQ(4, this.qCh);
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
      bhm localbhm = (bhm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbhm.sdX = locala.vHC.rY();
        return 0;
      case 2: 
        localbhm.sir = locala.vHC.rY();
        return 0;
      case 3: 
        localbhm.sip = locala.vHC.rY();
        return 0;
      }
      localbhm.qCh = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */