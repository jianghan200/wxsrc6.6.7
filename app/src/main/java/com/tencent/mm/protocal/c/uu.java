package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class uu
  extends com.tencent.mm.bk.a
{
  public String rya;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rya == null) {
        throw new b("Not all required fields were included: LoginUrl");
      }
      if (this.rya != null) {
        paramVarArgs.g(1, this.rya);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rya == null) {
        break label210;
      }
    }
    label210:
    for (paramInt = f.a.a.b.b.a.h(1, this.rya) + 0;; paramInt = 0)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rya != null) {
          break;
        }
        throw new b("Not all required fields were included: LoginUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        uu localuu = (uu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        }
        localuu.rya = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/uu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */