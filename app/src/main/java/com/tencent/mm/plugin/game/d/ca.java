package com.tencent.mm.plugin.game.d;

public final class ca
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOU;
  public String jPG;
  public String jSC;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jPG != null) {
        paramVarArgs.g(2, this.jPG);
      }
      if (this.jOU != null) {
        paramVarArgs.g(3, this.jOU);
      }
      if (this.jSC != null) {
        paramVarArgs.g(4, this.jSC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPG);
      }
      i = paramInt;
      if (this.jOU != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOU);
      }
      paramInt = i;
      if (this.jSC != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSC);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ca localca = (ca)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localca.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localca.jPG = locala.vHC.readString();
          return 0;
        case 3: 
          localca.jOU = locala.vHC.readString();
          return 0;
        }
        localca.jSC = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */