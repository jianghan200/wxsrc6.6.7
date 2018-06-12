package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cew
  extends com.tencent.mm.bk.a
{
  public int otY;
  public String rlw;
  public String rwt;
  public String szk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.rwt == null) {
        throw new b("Not all required fields were included: MD5");
      }
      if (this.rlw == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      if (this.rwt != null) {
        paramVarArgs.g(2, this.rwt);
      }
      if (this.rlw != null) {
        paramVarArgs.g(3, this.rlw);
      }
      paramVarArgs.fT(4, this.otY);
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
      if (this.rwt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rwt);
      }
      i = paramInt;
      if (this.rlw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rlw);
      }
      return i + f.a.a.a.fQ(4, this.otY);
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
        if (this.rwt == null) {
          throw new b("Not all required fields were included: MD5");
        }
        if (this.rlw != null) {
          break;
        }
        throw new b("Not all required fields were included: ProductId");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cew localcew = (cew)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcew.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcew.rwt = locala.vHC.readString();
          return 0;
        case 3: 
          localcew.rlw = locala.vHC.readString();
          return 0;
        }
        localcew.otY = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */