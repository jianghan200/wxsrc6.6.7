package com.tencent.mm.plugin.report.service;

public final class b
  extends com.tencent.mm.bk.a
{
  public int bzI;
  public int mEb;
  public int mEc;
  public boolean mEd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.bzI);
      paramVarArgs.fT(2, this.mEb);
      paramVarArgs.fT(3, this.mEc);
      paramVarArgs.av(4, this.mEd);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.bzI) + 0 + f.a.a.a.fQ(2, this.mEb) + f.a.a.a.fQ(3, this.mEc) + (f.a.a.b.b.a.ec(4) + 1);
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
      b localb = (b)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localb.bzI = locala.vHC.rY();
        return 0;
      case 2: 
        localb.mEb = locala.vHC.rY();
        return 0;
      case 3: 
        localb.mEc = locala.vHC.rY();
        return 0;
      }
      localb.mEd = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */