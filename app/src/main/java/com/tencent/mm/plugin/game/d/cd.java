package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class cd
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOX;
  public String jPd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPd == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      if (this.jPd != null) {
        paramVarArgs.g(1, this.jPd);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jOX != null) {
        paramVarArgs.g(3, this.jOX);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPd == null) {
        break label321;
      }
    }
    label321:
    for (int i = f.a.a.b.b.a.h(1, this.jPd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.jOX != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOX);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jPd != null) {
          break;
        }
        throw new b("Not all required fields were included: IconURL");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cd localcd = (cd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcd.jPd = locala.vHC.readString();
          return 0;
        case 2: 
          localcd.bHD = locala.vHC.readString();
          return 0;
        }
        localcd.jOX = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */