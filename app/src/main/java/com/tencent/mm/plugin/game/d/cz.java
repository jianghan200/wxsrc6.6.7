package com.tencent.mm.plugin.game.d;

public final class cz
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOT;
  public String jOU;
  public int jTr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jOU != null) {
        paramVarArgs.g(2, this.jOU);
      }
      if (this.jOT != null) {
        paramVarArgs.g(3, this.jOT);
      }
      paramVarArgs.fT(4, this.jTr);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOU);
      }
      i = paramInt;
      if (this.jOT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOT);
      }
      return i + f.a.a.a.fQ(4, this.jTr);
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
        cz localcz = (cz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcz.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localcz.jOU = locala.vHC.readString();
          return 0;
        case 3: 
          localcz.jOT = locala.vHC.readString();
          return 0;
        }
        localcz.jTr = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */