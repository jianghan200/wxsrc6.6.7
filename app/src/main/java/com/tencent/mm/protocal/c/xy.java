package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class xy
  extends com.tencent.mm.bk.a
{
  public String jPc;
  public int rDF;
  public String rDG;
  public String rDO;
  public String rej;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPc == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.rDO == null) {
        throw new b("Not all required fields were included: RecommendKey");
      }
      if (this.jPc != null) {
        paramVarArgs.g(1, this.jPc);
      }
      if (this.rDO != null) {
        paramVarArgs.g(2, this.rDO);
      }
      if (this.rej != null) {
        paramVarArgs.g(3, this.rej);
      }
      paramVarArgs.fT(4, this.rDF);
      if (this.rDG != null) {
        paramVarArgs.g(5, this.rDG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPc == null) {
        break label451;
      }
    }
    label451:
    for (int i = f.a.a.b.b.a.h(1, this.jPc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rDO != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rDO);
      }
      i = paramInt;
      if (this.rej != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rej);
      }
      i += f.a.a.a.fQ(4, this.rDF);
      paramInt = i;
      if (this.rDG != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rDG);
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
        if (this.jPc == null) {
          throw new b("Not all required fields were included: AppID");
        }
        if (this.rDO != null) {
          break;
        }
        throw new b("Not all required fields were included: RecommendKey");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        xy localxy = (xy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localxy.jPc = locala.vHC.readString();
          return 0;
        case 2: 
          localxy.rDO = locala.vHC.readString();
          return 0;
        case 3: 
          localxy.rej = locala.vHC.readString();
          return 0;
        case 4: 
          localxy.rDF = locala.vHC.rY();
          return 0;
        }
        localxy.rDG = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/xy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */