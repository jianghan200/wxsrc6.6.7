package com.tencent.mm.protocal.c;

public final class cbq
  extends com.tencent.mm.bk.a
{
  public boolean sxG;
  public String sxH;
  public String sxI;
  public int sxJ;
  public int sxK;
  public int sxL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.av(1, this.sxG);
      if (this.sxH != null) {
        paramVarArgs.g(2, this.sxH);
      }
      if (this.sxI != null) {
        paramVarArgs.g(3, this.sxI);
      }
      paramVarArgs.fT(4, this.sxJ);
      paramVarArgs.fT(5, this.sxK);
      paramVarArgs.fT(6, this.sxL);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.b.b.a.ec(1) + 1 + 0;
      paramInt = i;
      if (this.sxH != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sxH);
      }
      i = paramInt;
      if (this.sxI != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sxI);
      }
      return i + f.a.a.a.fQ(4, this.sxJ) + f.a.a.a.fQ(5, this.sxK) + f.a.a.a.fQ(6, this.sxL);
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
      cbq localcbq = (cbq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcbq.sxG = locala.cJQ();
        return 0;
      case 2: 
        localcbq.sxH = locala.vHC.readString();
        return 0;
      case 3: 
        localcbq.sxI = locala.vHC.readString();
        return 0;
      case 4: 
        localcbq.sxJ = locala.vHC.rY();
        return 0;
      case 5: 
        localcbq.sxK = locala.vHC.rY();
        return 0;
      }
      localcbq.sxL = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */