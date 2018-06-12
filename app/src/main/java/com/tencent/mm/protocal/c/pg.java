package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class pg
  extends com.tencent.mm.bk.a
{
  public String hcr;
  public int otY;
  public String rtC;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtC == null) {
        throw new b("Not all required fields were included: PkgId");
      }
      if (this.rtC != null) {
        paramVarArgs.g(1, this.rtC);
      }
      if (this.hcr != null) {
        paramVarArgs.g(2, this.hcr);
      }
      paramVarArgs.fT(3, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rtC == null) {
        break label305;
      }
    }
    label305:
    for (paramInt = f.a.a.b.b.a.h(1, this.rtC) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hcr != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hcr);
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
        if (this.rtC != null) {
          break;
        }
        throw new b("Not all required fields were included: PkgId");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        pg localpg = (pg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localpg.rtC = locala.vHC.readString();
          return 0;
        case 2: 
          localpg.hcr = locala.vHC.readString();
          return 0;
        }
        localpg.otY = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/pg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */