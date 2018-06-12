package com.tencent.mm.plugin.game.d;

public final class cj
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jOT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jOT != null) {
        paramVarArgs.g(2, this.jOT);
      }
      if (this.jOS != null) {
        paramVarArgs.g(3, this.jOS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label289;
      }
    }
    label289:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOT);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOS);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cj localcj = (cj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcj.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localcj.jOT = locala.vHC.readString();
          return 0;
        }
        localcj.jOS = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */