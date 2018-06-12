package com.tencent.mm.protocal.c;

public final class btr
  extends com.tencent.mm.bk.a
{
  public String rmC;
  public String rwn;
  public int sri;
  public int srj;
  public long srk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sri);
      if (this.rmC != null) {
        paramVarArgs.g(2, this.rmC);
      }
      if (this.rwn != null) {
        paramVarArgs.g(3, this.rwn);
      }
      paramVarArgs.fT(4, this.srj);
      paramVarArgs.T(5, this.srk);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.sri) + 0;
      paramInt = i;
      if (this.rmC != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rmC);
      }
      i = paramInt;
      if (this.rwn != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwn);
      }
      return i + f.a.a.a.fQ(4, this.srj) + f.a.a.a.S(5, this.srk);
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
      btr localbtr = (btr)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbtr.sri = locala.vHC.rY();
        return 0;
      case 2: 
        localbtr.rmC = locala.vHC.readString();
        return 0;
      case 3: 
        localbtr.rwn = locala.vHC.readString();
        return 0;
      case 4: 
        localbtr.srj = locala.vHC.rY();
        return 0;
      }
      localbtr.srk = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/btr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */