package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class ced
  extends com.tencent.mm.bk.a
{
  public String iwP;
  public String rdS;
  public boolean szj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdS == null) {
        throw new b("Not all required fields were included: Username");
      }
      if (this.iwP == null) {
        throw new b("Not all required fields were included: Language");
      }
      if (this.rdS != null) {
        paramVarArgs.g(1, this.rdS);
      }
      if (this.iwP != null) {
        paramVarArgs.g(2, this.iwP);
      }
      paramVarArgs.av(3, this.szj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rdS == null) {
        break label334;
      }
    }
    label334:
    for (paramInt = f.a.a.b.b.a.h(1, this.rdS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.iwP != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.iwP);
      }
      return i + (f.a.a.b.b.a.ec(3) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rdS == null) {
          throw new b("Not all required fields were included: Username");
        }
        if (this.iwP != null) {
          break;
        }
        throw new b("Not all required fields were included: Language");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ced localced = (ced)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localced.rdS = locala.vHC.readString();
          return 0;
        case 2: 
          localced.iwP = locala.vHC.readString();
          return 0;
        }
        localced.szj = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ced.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */