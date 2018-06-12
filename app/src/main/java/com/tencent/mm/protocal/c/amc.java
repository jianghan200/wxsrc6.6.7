package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class amc
  extends com.tencent.mm.bk.a
{
  public b rOO;
  public b rgs;
  public b rgu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rgu != null) {
        paramVarArgs.b(1, this.rgu);
      }
      if (this.rgs != null) {
        paramVarArgs.b(2, this.rgs);
      }
      if (this.rOO != null) {
        paramVarArgs.b(3, this.rOO);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rgu == null) {
        break label280;
      }
    }
    label280:
    for (int i = f.a.a.a.a(1, this.rgu) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rgs != null) {
        paramInt = i + f.a.a.a.a(2, this.rgs);
      }
      i = paramInt;
      if (this.rOO != null) {
        i = paramInt + f.a.a.a.a(3, this.rOO);
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
        amc localamc = (amc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localamc.rgu = locala.cJR();
          return 0;
        case 2: 
          localamc.rgs = locala.cJR();
          return 0;
        }
        localamc.rOO = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/amc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */