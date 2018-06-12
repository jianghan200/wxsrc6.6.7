package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class xg
  extends com.tencent.mm.bk.a
{
  public int hcy;
  public String rDd;
  public long rDe;
  public String rDf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rDd == null) {
        throw new b("Not all required fields were included: Rid");
      }
      if (this.rDf == null) {
        throw new b("Not all required fields were included: MimeType");
      }
      if (this.rDd != null) {
        paramVarArgs.g(1, this.rDd);
      }
      paramVarArgs.T(2, this.rDe);
      paramVarArgs.fT(3, this.hcy);
      if (this.rDf != null) {
        paramVarArgs.g(4, this.rDf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rDd == null) {
        break label376;
      }
    }
    label376:
    for (paramInt = f.a.a.b.b.a.h(1, this.rDd) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.rDe) + f.a.a.a.fQ(3, this.hcy);
      paramInt = i;
      if (this.rDf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rDf);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rDd == null) {
          throw new b("Not all required fields were included: Rid");
        }
        if (this.rDf != null) {
          break;
        }
        throw new b("Not all required fields were included: MimeType");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        xg localxg = (xg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localxg.rDd = locala.vHC.readString();
          return 0;
        case 2: 
          localxg.rDe = locala.vHC.rZ();
          return 0;
        case 3: 
          localxg.hcy = locala.vHC.rY();
          return 0;
        }
        localxg.rDf = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */