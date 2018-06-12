package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class ch
  extends com.tencent.mm.bk.a
{
  public String jOS;
  public String jOU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jOS == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.jOS != null) {
        paramVarArgs.g(1, this.jOS);
      }
      if (this.jOU != null) {
        paramVarArgs.g(2, this.jOU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jOS == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = f.a.a.b.b.a.h(1, this.jOS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jOU != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jOU);
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
        if (this.jOS != null) {
          break;
        }
        throw new b("Not all required fields were included: Desc");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ch localch = (ch)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localch.jOS = locala.vHC.readString();
          return 0;
        }
        localch.jOU = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */