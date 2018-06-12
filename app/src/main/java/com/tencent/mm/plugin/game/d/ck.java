package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class ck
  extends com.tencent.mm.bk.a
{
  public int jSO;
  public String jSP;
  public String jSQ;
  public boolean jSR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jSQ == null) {
        throw new b("Not all required fields were included: MediaURL");
      }
      paramVarArgs.fT(1, this.jSO);
      if (this.jSP != null) {
        paramVarArgs.g(2, this.jSP);
      }
      if (this.jSQ != null) {
        paramVarArgs.g(3, this.jSQ);
      }
      paramVarArgs.av(4, this.jSR);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.jSO) + 0;
      paramInt = i;
      if (this.jSP != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSP);
      }
      i = paramInt;
      if (this.jSQ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSQ);
      }
      return i + (f.a.a.b.b.a.ec(4) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.jSQ == null) {
        throw new b("Not all required fields were included: MediaURL");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      ck localck = (ck)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localck.jSO = locala.vHC.rY();
        return 0;
      case 2: 
        localck.jSP = locala.vHC.readString();
        return 0;
      case 3: 
        localck.jSQ = locala.vHC.readString();
        return 0;
      }
      localck.jSR = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/d/ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */