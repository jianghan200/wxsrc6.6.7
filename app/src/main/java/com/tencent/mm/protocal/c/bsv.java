package com.tencent.mm.protocal.c;

public final class bsv
  extends com.tencent.mm.bk.a
{
  public long sqk;
  public long sqm;
  public int sqn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.sqk);
      paramVarArgs.T(2, this.sqm);
      paramVarArgs.fT(3, this.sqn);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.sqk) + 0 + f.a.a.a.S(2, this.sqm) + f.a.a.a.fQ(3, this.sqn);
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
      bsv localbsv = (bsv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbsv.sqk = locala.vHC.rZ();
        return 0;
      case 2: 
        localbsv.sqm = locala.vHC.rZ();
        return 0;
      }
      localbsv.sqn = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bsv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */