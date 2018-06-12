package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class wv
  extends com.tencent.mm.bk.a
{
  public int bkq;
  public String qdu;
  public String rBS;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.qdu == null) {
        throw new b("Not all required fields were included: tagName");
      }
      if (this.rBS == null) {
        throw new b("Not all required fields were included: tagPinYin");
      }
      if (this.qdu != null) {
        paramVarArgs.g(1, this.qdu);
      }
      if (this.rBS != null) {
        paramVarArgs.g(2, this.rBS);
      }
      paramVarArgs.fT(3, this.bkq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.qdu == null) {
        break label337;
      }
    }
    label337:
    for (paramInt = f.a.a.b.b.a.h(1, this.qdu) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rBS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rBS);
      }
      return i + f.a.a.a.fQ(3, this.bkq);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.qdu == null) {
          throw new b("Not all required fields were included: tagName");
        }
        if (this.rBS != null) {
          break;
        }
        throw new b("Not all required fields were included: tagPinYin");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        wv localwv = (wv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localwv.qdu = locala.vHC.readString();
          return 0;
        case 2: 
          localwv.rBS = locala.vHC.readString();
          return 0;
        }
        localwv.bkq = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/wv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */