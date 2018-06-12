package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cee
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jSA;
  public String szk;
  public long szl;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jSA == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jSA != null) {
        paramVarArgs.g(3, this.jSA);
      }
      paramVarArgs.T(4, this.szl);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label428;
      }
    }
    label428:
    for (int i = f.a.a.b.b.a.h(1, this.szk) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.jSA != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSA);
      }
      return i + f.a.a.a.S(4, this.szl);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.szk == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jSA != null) {
          break;
        }
        throw new b("Not all required fields were included: Content");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cee localcee = (cee)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcee.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcee.bHD = locala.vHC.readString();
          return 0;
        case 3: 
          localcee.jSA = locala.vHC.readString();
          return 0;
        }
        localcee.szl = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */