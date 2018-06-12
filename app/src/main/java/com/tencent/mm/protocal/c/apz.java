package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class apz
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public int rSB;
  public int rSC;
  public int rSt;
  public b rSu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rSt);
      if (this.rSu != null) {
        paramVarArgs.b(2, this.rSu);
      }
      paramVarArgs.fT(3, this.rSB);
      paramVarArgs.fT(4, this.hbF);
      paramVarArgs.fT(5, this.rSC);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rSt) + 0;
      paramInt = i;
      if (this.rSu != null) {
        paramInt = i + f.a.a.a.a(2, this.rSu);
      }
      return paramInt + f.a.a.a.fQ(3, this.rSB) + f.a.a.a.fQ(4, this.hbF) + f.a.a.a.fQ(5, this.rSC);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      apz localapz = (apz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localapz.rSt = locala.vHC.rY();
        return 0;
      case 2: 
        localapz.rSu = locala.cJR();
        return 0;
      case 3: 
        localapz.rSB = locala.vHC.rY();
        return 0;
      case 4: 
        localapz.hbF = locala.vHC.rY();
        return 0;
      }
      localapz.rSC = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/apz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */