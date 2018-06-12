package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class bz
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jSA;
  public LinkedList<String> jSB = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jSA != null) {
        paramVarArgs.g(2, this.jSA);
      }
      paramVarArgs.d(3, 1, this.jSB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label285;
      }
    }
    label285:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jSA != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jSA);
      }
      return i + f.a.a.a.c(3, 1, this.jSB);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jSB.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bz localbz = (bz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbz.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localbz.jSA = locala.vHC.readString();
          return 0;
        }
        localbz.jSB.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */