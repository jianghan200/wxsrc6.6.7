package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cii
  extends com.tencent.mm.bk.a
{
  public String dxc;
  public int sCd;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.dxc == null) {
        throw new b("Not all required fields were included: rankid");
      }
      if (this.title == null) {
        throw new b("Not all required fields were included: title");
      }
      if (this.dxc != null) {
        paramVarArgs.g(1, this.dxc);
      }
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      paramVarArgs.fT(3, this.sCd);
      return 0;
    }
    if (paramInt == 1) {
      if (this.dxc == null) {
        break label337;
      }
    }
    label337:
    for (paramInt = f.a.a.b.b.a.h(1, this.dxc) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.title);
      }
      return i + f.a.a.a.fQ(3, this.sCd);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.dxc == null) {
          throw new b("Not all required fields were included: rankid");
        }
        if (this.title != null) {
          break;
        }
        throw new b("Not all required fields were included: title");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cii localcii = (cii)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcii.dxc = locala.vHC.readString();
          return 0;
        case 2: 
          localcii.title = locala.vHC.readString();
          return 0;
        }
        localcii.sCd = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */