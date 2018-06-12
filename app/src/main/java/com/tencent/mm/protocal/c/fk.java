package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class fk
  extends com.tencent.mm.bk.a
{
  public int iwE;
  public int otY;
  public b rgr;
  public b rgs;
  public int rgt;
  public b rgu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rgr != null) {
        paramVarArgs.b(1, this.rgr);
      }
      paramVarArgs.fT(2, this.iwE);
      if (this.rgs != null) {
        paramVarArgs.b(3, this.rgs);
      }
      paramVarArgs.fT(4, this.rgt);
      if (this.rgu != null) {
        paramVarArgs.b(5, this.rgu);
      }
      paramVarArgs.fT(6, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rgr == null) {
        break label397;
      }
    }
    label397:
    for (paramInt = f.a.a.a.a(1, this.rgr) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.iwE);
      paramInt = i;
      if (this.rgs != null) {
        paramInt = i + f.a.a.a.a(3, this.rgs);
      }
      i = paramInt + f.a.a.a.fQ(4, this.rgt);
      paramInt = i;
      if (this.rgu != null) {
        paramInt = i + f.a.a.a.a(5, this.rgu);
      }
      return paramInt + f.a.a.a.fQ(6, this.otY);
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
        fk localfk = (fk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localfk.rgr = locala.cJR();
          return 0;
        case 2: 
          localfk.iwE = locala.vHC.rY();
          return 0;
        case 3: 
          localfk.rgs = locala.cJR();
          return 0;
        case 4: 
          localfk.rgt = locala.vHC.rY();
          return 0;
        case 5: 
          localfk.rgu = locala.cJR();
          return 0;
        }
        localfk.otY = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */