package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cff
  extends com.tencent.mm.bk.a
{
  public int qZk;
  public String rBM;
  public boolean szO;
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
      paramVarArgs.av(3, this.szO);
      paramVarArgs.fT(4, this.qZk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label369;
      }
    }
    label369:
    for (paramInt = f.a.a.b.b.a.h(1, this.szk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rBM != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rBM);
      }
      return i + (f.a.a.b.b.a.ec(3) + 1) + f.a.a.a.fQ(4, this.qZk);
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
        cff localcff = (cff)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcff.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcff.rBM = locala.vHC.readString();
          return 0;
        case 3: 
          localcff.szO = locala.cJQ();
          return 0;
        }
        localcff.qZk = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/cff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */