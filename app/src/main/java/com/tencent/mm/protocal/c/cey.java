package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cey
  extends com.tencent.mm.bk.a
{
  public int otY;
  public String rBM;
  public String szk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.rBM == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      if (this.rBM != null) {
        paramVarArgs.g(2, this.rBM);
      }
      paramVarArgs.fT(3, this.otY);
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
      if (this.rBM != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rBM);
      }
      return i + f.a.a.a.fQ(3, this.otY);
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
        if (this.rBM != null) {
          break;
        }
        throw new b("Not all required fields were included: Text");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cey localcey = (cey)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcey.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcey.rBM = locala.vHC.readString();
          return 0;
        }
        localcey.otY = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */