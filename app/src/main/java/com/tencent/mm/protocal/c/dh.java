package com.tencent.mm.protocal.c;

public final class dh
  extends com.tencent.mm.bk.a
{
  public int rdA;
  public int rdB;
  public int rdC;
  public int rdD;
  public String rdE;
  public long rdx;
  public int rdy;
  public int rdz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.rdx);
      paramVarArgs.fT(2, this.rdy);
      paramVarArgs.fT(3, this.rdz);
      paramVarArgs.fT(4, this.rdA);
      paramVarArgs.fT(5, this.rdB);
      paramVarArgs.fT(6, this.rdC);
      paramVarArgs.fT(7, this.rdD);
      if (this.rdE != null) {
        paramVarArgs.g(8, this.rdE);
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
      i = f.a.a.a.S(1, this.rdx) + 0 + f.a.a.a.fQ(2, this.rdy) + f.a.a.a.fQ(3, this.rdz) + f.a.a.a.fQ(4, this.rdA) + f.a.a.a.fQ(5, this.rdB) + f.a.a.a.fQ(6, this.rdC) + f.a.a.a.fQ(7, this.rdD);
      paramInt = i;
    } while (this.rdE == null);
    return i + f.a.a.b.b.a.h(8, this.rdE);
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
      dh localdh = (dh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localdh.rdx = locala.vHC.rZ();
        return 0;
      case 2: 
        localdh.rdy = locala.vHC.rY();
        return 0;
      case 3: 
        localdh.rdz = locala.vHC.rY();
        return 0;
      case 4: 
        localdh.rdA = locala.vHC.rY();
        return 0;
      case 5: 
        localdh.rdB = locala.vHC.rY();
        return 0;
      case 6: 
        localdh.rdC = locala.vHC.rY();
        return 0;
      case 7: 
        localdh.rdD = locala.vHC.rY();
        return 0;
      }
      localdh.rdE = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */