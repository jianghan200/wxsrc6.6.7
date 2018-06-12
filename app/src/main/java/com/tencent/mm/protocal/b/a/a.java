package com.tencent.mm.protocal.b.a;

import f.a.a.b;

public final class a
  extends com.tencent.mm.bk.a
{
  public int actionType;
  public int id;
  public String qXW;
  public String qXX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.qXW == null) {
        throw new b("Not all required fields were included: btnStr");
      }
      paramVarArgs.fT(1, this.id);
      paramVarArgs.fT(2, this.actionType);
      if (this.qXW != null) {
        paramVarArgs.g(3, this.qXW);
      }
      if (this.qXX != null) {
        paramVarArgs.g(4, this.qXX);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.id) + 0 + f.a.a.a.fQ(2, this.actionType);
      paramInt = i;
      if (this.qXW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.qXW);
      }
      i = paramInt;
    } while (this.qXX == null);
    return paramInt + f.a.a.b.b.a.h(4, this.qXX);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.qXW == null) {
        throw new b("Not all required fields were included: btnStr");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locala1.id = locala.vHC.rY();
        return 0;
      case 2: 
        locala1.actionType = locala.vHC.rY();
        return 0;
      case 3: 
        locala1.qXW = locala.vHC.readString();
        return 0;
      }
      locala1.qXX = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */