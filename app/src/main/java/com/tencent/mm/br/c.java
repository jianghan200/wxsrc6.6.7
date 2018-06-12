package com.tencent.mm.br;

public final class c
  extends com.tencent.mm.bk.a
{
  public int dHJ;
  public int sLL;
  public int sLM;
  public int sLN;
  public int sLO = -1;
  public int sLP;
  public int size;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sLL);
      paramVarArgs.fT(2, this.sLM);
      paramVarArgs.fT(3, this.sLN);
      paramVarArgs.fT(41, this.sLO);
      paramVarArgs.fT(5, this.sLP);
      paramVarArgs.fT(6, this.dHJ);
      paramVarArgs.fT(7, this.size);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.sLL) + 0 + f.a.a.a.fQ(2, this.sLM) + f.a.a.a.fQ(3, this.sLN) + f.a.a.a.fQ(41, this.sLO) + f.a.a.a.fQ(5, this.sLP) + f.a.a.a.fQ(6, this.dHJ) + f.a.a.a.fQ(7, this.size);
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
      c localc = (c)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localc.sLL = locala.vHC.rY();
        return 0;
      case 2: 
        localc.sLM = locala.vHC.rY();
        return 0;
      case 3: 
        localc.sLN = locala.vHC.rY();
        return 0;
      case 41: 
        localc.sLO = locala.vHC.rY();
        return 0;
      case 5: 
        localc.sLP = locala.vHC.rY();
        return 0;
      case 6: 
        localc.dHJ = locala.vHC.rY();
        return 0;
      }
      localc.size = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/br/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */