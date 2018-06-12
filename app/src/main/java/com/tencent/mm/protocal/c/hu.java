package com.tencent.mm.protocal.c;

public final class hu
  extends com.tencent.mm.bk.a
{
  public String hyG;
  public String riL;
  public int ver;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riL != null) {
        paramVarArgs.g(1, this.riL);
      }
      if (this.hyG != null) {
        paramVarArgs.g(2, this.hyG);
      }
      paramVarArgs.fT(3, this.ver);
      return 0;
    }
    if (paramInt == 1) {
      if (this.riL == null) {
        break label269;
      }
    }
    label269:
    for (paramInt = f.a.a.b.b.a.h(1, this.riL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hyG != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hyG);
      }
      return i + f.a.a.a.fQ(3, this.ver);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        hu localhu = (hu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localhu.riL = locala.vHC.readString();
          return 0;
        case 2: 
          localhu.hyG = locala.vHC.readString();
          return 0;
        }
        localhu.ver = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/hu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */