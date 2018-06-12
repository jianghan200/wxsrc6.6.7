package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cft
  extends com.tencent.mm.bk.a
{
  public String rcY;
  public String rwk;
  public int sAo;
  public int sAp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwk == null) {
        throw new b("Not all required fields were included: Md5");
      }
      if (this.rcY == null) {
        throw new b("Not all required fields were included: DownloadUrl");
      }
      if (this.rwk != null) {
        paramVarArgs.g(1, this.rwk);
      }
      if (this.rcY != null) {
        paramVarArgs.g(2, this.rcY);
      }
      paramVarArgs.fT(3, this.sAo);
      paramVarArgs.fT(4, this.sAp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwk == null) {
        break label376;
      }
    }
    label376:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rcY != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rcY);
      }
      return i + f.a.a.a.fQ(3, this.sAo) + f.a.a.a.fQ(4, this.sAp);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rwk == null) {
          throw new b("Not all required fields were included: Md5");
        }
        if (this.rcY != null) {
          break;
        }
        throw new b("Not all required fields were included: DownloadUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cft localcft = (cft)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcft.rwk = locala.vHC.readString();
          return 0;
        case 2: 
          localcft.rcY = locala.vHC.readString();
          return 0;
        case 3: 
          localcft.sAo = locala.vHC.rY();
          return 0;
        }
        localcft.sAp = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */