package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class bzj
  extends com.tencent.mm.bk.a
{
  public long rxH;
  public int svC;
  public int svD;
  public int svE;
  public int svF;
  public b svG;
  public long svs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.svs);
      paramVarArgs.T(2, this.rxH);
      paramVarArgs.fT(3, this.svC);
      paramVarArgs.fT(4, this.svD);
      paramVarArgs.fT(5, this.svE);
      paramVarArgs.fT(6, this.svF);
      if (this.svG != null) {
        paramVarArgs.b(7, this.svG);
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
      i = f.a.a.a.S(1, this.svs) + 0 + f.a.a.a.S(2, this.rxH) + f.a.a.a.fQ(3, this.svC) + f.a.a.a.fQ(4, this.svD) + f.a.a.a.fQ(5, this.svE) + f.a.a.a.fQ(6, this.svF);
      paramInt = i;
    } while (this.svG == null);
    return i + f.a.a.a.a(7, this.svG);
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
      bzj localbzj = (bzj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbzj.svs = locala.vHC.rZ();
        return 0;
      case 2: 
        localbzj.rxH = locala.vHC.rZ();
        return 0;
      case 3: 
        localbzj.svC = locala.vHC.rY();
        return 0;
      case 4: 
        localbzj.svD = locala.vHC.rY();
        return 0;
      case 5: 
        localbzj.svE = locala.vHC.rY();
        return 0;
      case 6: 
        localbzj.svF = locala.vHC.rY();
        return 0;
      }
      localbzj.svG = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */