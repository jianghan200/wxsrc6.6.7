package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class ceg
  extends com.tencent.mm.bk.a
{
  public String hcS;
  public String szk;
  public long szm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.hcS == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      paramVarArgs.T(3, this.szm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label337;
      }
    }
    label337:
    for (paramInt = f.a.a.b.b.a.h(1, this.szk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hcS);
      }
      return i + f.a.a.a.S(3, this.szm);
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
        if (this.hcS != null) {
          break;
        }
        throw new b("Not all required fields were included: NickName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ceg localceg = (ceg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localceg.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localceg.hcS = locala.vHC.readString();
          return 0;
        }
        localceg.szm = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ceg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */