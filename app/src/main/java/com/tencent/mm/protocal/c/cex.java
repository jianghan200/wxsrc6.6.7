package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cex
  extends com.tencent.mm.bk.a
{
  public int otY;
  public String rBM;
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
      if (this.rBM == null) {
        throw new b("Not all required fields were included: Text");
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
      if (this.rBM != null) {
        paramVarArgs.g(2, this.rBM);
      }
      if (this.rwt != null) {
        paramVarArgs.g(3, this.rwt);
      }
      if (this.rlw != null) {
        paramVarArgs.g(4, this.rlw);
      }
      paramVarArgs.fT(5, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label515;
      }
    }
    label515:
    for (int i = f.a.a.b.b.a.h(1, this.szk) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rBM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rBM);
      }
      i = paramInt;
      if (this.rwt != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwt);
      }
      paramInt = i;
      if (this.rlw != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rlw);
      }
      return paramInt + f.a.a.a.fQ(5, this.otY);
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
        if (this.rBM == null) {
          throw new b("Not all required fields were included: Text");
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
        cex localcex = (cex)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcex.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcex.rBM = locala.vHC.readString();
          return 0;
        case 3: 
          localcex.rwt = locala.vHC.readString();
          return 0;
        case 4: 
          localcex.rlw = locala.vHC.readString();
          return 0;
        }
        localcex.otY = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */