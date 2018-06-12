package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class da
  extends com.tencent.mm.bk.a
{
  public String jPe;
  public int jSc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe == null) {
        throw new b("Not all required fields were included: Name");
      }
      paramVarArgs.fT(1, this.jSc);
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.jSc) + 0;
      paramInt = i;
    } while (this.jPe == null);
    return i + f.a.a.b.b.a.h(2, this.jPe);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.jPe == null) {
        throw new b("Not all required fields were included: Name");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      da localda = (da)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localda.jSc = locala.vHC.rY();
        return 0;
      }
      localda.jPe = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */