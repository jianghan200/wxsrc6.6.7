package com.tencent.mm.protocal.c;

public final class bqd
  extends com.tencent.mm.bk.a
{
  public int eJS;
  public String eJT;
  public long eJU;
  public int sod;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.eJS);
      if (this.eJT != null) {
        paramVarArgs.g(2, this.eJT);
      }
      paramVarArgs.T(3, this.eJU);
      paramVarArgs.fT(4, this.sod);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.eJS) + 0;
      paramInt = i;
      if (this.eJT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.eJT);
      }
      return paramInt + f.a.a.a.S(3, this.eJU) + f.a.a.a.fQ(4, this.sod);
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
      bqd localbqd = (bqd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbqd.eJS = locala.vHC.rY();
        return 0;
      case 2: 
        localbqd.eJT = locala.vHC.readString();
        return 0;
      case 3: 
        localbqd.eJU = locala.vHC.rZ();
        return 0;
      }
      localbqd.sod = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */