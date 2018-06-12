package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cih
  extends com.tencent.mm.bk.a
{
  public int score;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title == null) {
        throw new b("Not all required fields were included: title");
      }
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      paramVarArgs.fT(2, this.score);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label244;
      }
    }
    label244:
    for (paramInt = f.a.a.b.b.a.h(1, this.title) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.score);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.title != null) {
          break;
        }
        throw new b("Not all required fields were included: title");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cih localcih = (cih)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcih.title = locala.vHC.readString();
          return 0;
        }
        localcih.score = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */