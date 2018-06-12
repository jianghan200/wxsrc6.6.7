package com.tencent.mm.protocal.c;

public final class anl
  extends com.tencent.mm.bk.a
{
  public int bHC;
  public int rQa;
  public int rQb;
  public int rQc;
  public int rQd;
  public int rQe;
  public int rQf;
  public int rQg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rQa);
      paramVarArgs.fT(2, this.bHC);
      paramVarArgs.fT(3, this.rQb);
      paramVarArgs.fT(4, this.rQc);
      paramVarArgs.fT(5, this.rQd);
      paramVarArgs.fT(6, this.rQe);
      paramVarArgs.fT(7, this.rQf);
      paramVarArgs.fT(8, this.rQg);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rQa) + 0 + f.a.a.a.fQ(2, this.bHC) + f.a.a.a.fQ(3, this.rQb) + f.a.a.a.fQ(4, this.rQc) + f.a.a.a.fQ(5, this.rQd) + f.a.a.a.fQ(6, this.rQe) + f.a.a.a.fQ(7, this.rQf) + f.a.a.a.fQ(8, this.rQg);
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
      anl localanl = (anl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localanl.rQa = locala.vHC.rY();
        return 0;
      case 2: 
        localanl.bHC = locala.vHC.rY();
        return 0;
      case 3: 
        localanl.rQb = locala.vHC.rY();
        return 0;
      case 4: 
        localanl.rQc = locala.vHC.rY();
        return 0;
      case 5: 
        localanl.rQd = locala.vHC.rY();
        return 0;
      case 6: 
        localanl.rQe = locala.vHC.rY();
        return 0;
      case 7: 
        localanl.rQf = locala.vHC.rY();
        return 0;
      }
      localanl.rQg = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/anl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */