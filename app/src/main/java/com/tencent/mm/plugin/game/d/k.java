package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class k
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jOU;
  public String jPA;
  public int jPC;
  public String jPG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPG == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jOU == null) {
        throw new b("Not all required fields were included: JumpUrl");
      }
      if (this.jPG != null) {
        paramVarArgs.g(1, this.jPG);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(3, this.jOS);
      }
      if (this.jOU != null) {
        paramVarArgs.g(4, this.jOU);
      }
      paramVarArgs.fT(5, this.jPC);
      if (this.jPA != null) {
        paramVarArgs.g(6, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPG == null) {
        break label542;
      }
    }
    label542:
    for (int i = f.a.a.b.b.a.h(1, this.jPG) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOS);
      }
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOU);
      }
      i = paramInt + f.a.a.a.fQ(5, this.jPC);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jPA);
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
        if (this.jPG == null) {
          throw new b("Not all required fields were included: IconUrl");
        }
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jOU != null) {
          break;
        }
        throw new b("Not all required fields were included: JumpUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localk.jPG = locala.vHC.readString();
          return 0;
        case 2: 
          localk.bHD = locala.vHC.readString();
          return 0;
        case 3: 
          localk.jOS = locala.vHC.readString();
          return 0;
        case 4: 
          localk.jOU = locala.vHC.readString();
          return 0;
        case 5: 
          localk.jPC = locala.vHC.rY();
          return 0;
        }
        localk.jPA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */