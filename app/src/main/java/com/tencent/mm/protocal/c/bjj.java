package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bjj
  extends com.tencent.mm.bk.a
{
  public long see;
  public String sjx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sjx == null) {
        throw new b("Not all required fields were included: Query");
      }
      if (this.sjx != null) {
        paramVarArgs.g(1, this.sjx);
      }
      paramVarArgs.T(2, this.see);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sjx == null) {
        break label244;
      }
    }
    label244:
    for (paramInt = f.a.a.b.b.a.h(1, this.sjx) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.S(2, this.see);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sjx != null) {
          break;
        }
        throw new b("Not all required fields were included: Query");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bjj localbjj = (bjj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbjj.sjx = locala.vHC.readString();
          return 0;
        }
        localbjj.see = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */