package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class cbe
  extends com.tencent.mm.bk.a
{
  public String category;
  public int egS;
  public b rwb;
  public int sjO;
  public int sxo;
  public int sxp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.egS);
      paramVarArgs.fT(2, this.sxo);
      if (this.category != null) {
        paramVarArgs.g(3, this.category);
      }
      if (this.rwb != null) {
        paramVarArgs.b(4, this.rwb);
      }
      paramVarArgs.fT(5, this.sjO);
      paramVarArgs.fT(6, this.sxp);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.egS) + 0 + f.a.a.a.fQ(2, this.sxo);
      paramInt = i;
      if (this.category != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.category);
      }
      i = paramInt;
      if (this.rwb != null) {
        i = paramInt + f.a.a.a.a(4, this.rwb);
      }
      return i + f.a.a.a.fQ(5, this.sjO) + f.a.a.a.fQ(6, this.sxp);
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
      cbe localcbe = (cbe)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcbe.egS = locala.vHC.rY();
        return 0;
      case 2: 
        localcbe.sxo = locala.vHC.rY();
        return 0;
      case 3: 
        localcbe.category = locala.vHC.readString();
        return 0;
      case 4: 
        localcbe.rwb = locala.cJR();
        return 0;
      case 5: 
        localcbe.sjO = locala.vHC.rY();
        return 0;
      }
      localcbe.sxp = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */