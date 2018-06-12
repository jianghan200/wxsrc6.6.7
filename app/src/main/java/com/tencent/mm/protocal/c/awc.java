package com.tencent.mm.protocal.c;

public final class awc
  extends com.tencent.mm.bk.a
{
  public int rSt;
  public int rZp;
  public int rZq;
  public int rZr;
  public int rZs;
  public int rZt;
  public int rZu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rSt);
      paramVarArgs.fT(2, this.rZp);
      paramVarArgs.fT(3, this.rZq);
      paramVarArgs.fT(4, this.rZr);
      paramVarArgs.fT(5, this.rZs);
      paramVarArgs.fT(6, this.rZt);
      paramVarArgs.fT(7, this.rZu);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rSt) + 0 + f.a.a.a.fQ(2, this.rZp) + f.a.a.a.fQ(3, this.rZq) + f.a.a.a.fQ(4, this.rZr) + f.a.a.a.fQ(5, this.rZs) + f.a.a.a.fQ(6, this.rZt) + f.a.a.a.fQ(7, this.rZu);
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
      awc localawc = (awc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localawc.rSt = locala.vHC.rY();
        return 0;
      case 2: 
        localawc.rZp = locala.vHC.rY();
        return 0;
      case 3: 
        localawc.rZq = locala.vHC.rY();
        return 0;
      case 4: 
        localawc.rZr = locala.vHC.rY();
        return 0;
      case 5: 
        localawc.rZs = locala.vHC.rY();
        return 0;
      case 6: 
        localawc.rZt = locala.vHC.rY();
        return 0;
      }
      localawc.rZu = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/awc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */