package com.tencent.mm.protocal.c;

public final class td
  extends com.tencent.mm.bk.a
{
  public long rcq;
  public int rdV;
  public int rdW;
  public int rfn;
  public String rwt;
  public int rwz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rfn);
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      if (this.rwt != null) {
        paramVarArgs.g(4, this.rwt);
      }
      paramVarArgs.fT(5, this.rwz);
      paramVarArgs.T(6, this.rcq);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rfn) + 0 + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV);
      paramInt = i;
      if (this.rwt != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwt);
      }
      return paramInt + f.a.a.a.fQ(5, this.rwz) + f.a.a.a.S(6, this.rcq);
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
      td localtd = (td)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localtd.rfn = locala.vHC.rY();
        return 0;
      case 2: 
        localtd.rdW = locala.vHC.rY();
        return 0;
      case 3: 
        localtd.rdV = locala.vHC.rY();
        return 0;
      case 4: 
        localtd.rwt = locala.vHC.readString();
        return 0;
      case 5: 
        localtd.rwz = locala.vHC.rY();
        return 0;
      }
      localtd.rcq = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */