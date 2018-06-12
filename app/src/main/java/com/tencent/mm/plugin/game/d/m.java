package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class m
  extends com.tencent.mm.bk.a
{
  public String jOX;
  public int jPL;
  public String jPd;
  public String jPe;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.jPd == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      paramVarArgs.fT(1, this.jPL);
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      if (this.jPd != null) {
        paramVarArgs.g(3, this.jPd);
      }
      if (this.jOX != null) {
        paramVarArgs.g(4, this.jOX);
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
      i = f.a.a.a.fQ(1, this.jPL) + 0;
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPe);
      }
      i = paramInt;
      if (this.jPd != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jPd);
      }
      paramInt = i;
    } while (this.jOX == null);
    return i + f.a.a.b.b.a.h(4, this.jOX);
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
      if (this.jPd == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localm.jPL = locala.vHC.rY();
        return 0;
      case 2: 
        localm.jPe = locala.vHC.readString();
        return 0;
      case 3: 
        localm.jPd = locala.vHC.readString();
        return 0;
      }
      localm.jOX = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */