package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cdr
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public int hcE;
  public String hcS;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.hcS == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      paramVarArgs.fT(3, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label337;
      }
    }
    label337:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hcS);
      }
      return i + f.a.a.a.fQ(3, this.hcE);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hbL == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.hcS != null) {
          break;
        }
        throw new b("Not all required fields were included: NickName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cdr localcdr = (cdr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcdr.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localcdr.hcS = locala.vHC.readString();
          return 0;
        }
        localcdr.hcE = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */