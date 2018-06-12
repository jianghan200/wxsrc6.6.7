package com.tencent.mm.protocal.a.a;

public final class l
  extends com.tencent.mm.bk.a
{
  public int action;
  public int qXF;
  public int qXG;
  public int qXH;
  public int qXI;
  public int qXJ;
  public int qXK;
  public int qXL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qXF);
      paramVarArgs.fT(2, this.action);
      paramVarArgs.fT(3, this.qXG);
      paramVarArgs.fT(4, this.qXH);
      paramVarArgs.fT(5, this.qXI);
      paramVarArgs.fT(6, this.qXJ);
      paramVarArgs.fT(7, this.qXK);
      paramVarArgs.fT(8, this.qXL);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.qXF) + 0 + f.a.a.a.fQ(2, this.action) + f.a.a.a.fQ(3, this.qXG) + f.a.a.a.fQ(4, this.qXH) + f.a.a.a.fQ(5, this.qXI) + f.a.a.a.fQ(6, this.qXJ) + f.a.a.a.fQ(7, this.qXK) + f.a.a.a.fQ(8, this.qXL);
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
      l locall = (l)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locall.qXF = locala.vHC.rY();
        return 0;
      case 2: 
        locall.action = locala.vHC.rY();
        return 0;
      case 3: 
        locall.qXG = locala.vHC.rY();
        return 0;
      case 4: 
        locall.qXH = locala.vHC.rY();
        return 0;
      case 5: 
        locall.qXI = locala.vHC.rY();
        return 0;
      case 6: 
        locall.qXJ = locala.vHC.rY();
        return 0;
      case 7: 
        locall.qXK = locala.vHC.rY();
        return 0;
      }
      locall.qXL = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */