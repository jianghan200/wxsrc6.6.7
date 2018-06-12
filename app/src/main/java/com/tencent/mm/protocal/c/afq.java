package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class afq
  extends com.tencent.mm.bk.a
{
  public String bLe;
  public String eup;
  public String reg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.eup == null) {
        throw new b("Not all required fields were included: tp_username");
      }
      if (this.eup != null) {
        paramVarArgs.g(1, this.eup);
      }
      if (this.reg != null) {
        paramVarArgs.g(2, this.reg);
      }
      if (this.bLe != null) {
        paramVarArgs.g(3, this.bLe);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.eup == null) {
        break label321;
      }
    }
    label321:
    for (int i = f.a.a.b.b.a.h(1, this.eup) + 0;; i = 0)
    {
      paramInt = i;
      if (this.reg != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.reg);
      }
      i = paramInt;
      if (this.bLe != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bLe);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.eup != null) {
          break;
        }
        throw new b("Not all required fields were included: tp_username");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        afq localafq = (afq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localafq.eup = locala.vHC.readString();
          return 0;
        case 2: 
          localafq.reg = locala.vHC.readString();
          return 0;
        }
        localafq.bLe = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/afq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */