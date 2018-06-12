package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class ps
  extends com.tencent.mm.bk.a
{
  public String aAL;
  public long rtU;
  public String rtV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.aAL == null) {
        throw new b("Not all required fields were included: key");
      }
      if (this.aAL != null) {
        paramVarArgs.g(1, this.aAL);
      }
      paramVarArgs.T(2, this.rtU);
      if (this.rtV != null) {
        paramVarArgs.g(3, this.rtV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.aAL == null) {
        break label305;
      }
    }
    label305:
    for (paramInt = f.a.a.b.b.a.h(1, this.aAL) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.rtU);
      paramInt = i;
      if (this.rtV != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rtV);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.aAL != null) {
          break;
        }
        throw new b("Not all required fields were included: key");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ps localps = (ps)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localps.aAL = locala.vHC.readString();
          return 0;
        case 2: 
          localps.rtU = locala.vHC.rZ();
          return 0;
        }
        localps.rtV = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */